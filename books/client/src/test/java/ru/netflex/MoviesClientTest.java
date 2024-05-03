package ru.flibasta;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;
import lombok.Getter;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import ru.flibasta.server.books.*;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

@Log
class BooksClientTest {
    @Getter
    static class AsyncBooksHandler implements AsyncHandler<GetAllBooksResponse> {
        GetAllBooksResponse response;

        @Override
        public void handleResponse(Response<GetAllBooksResponse> response) {
            try {
                this.response = response.get(2000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException | TimeoutException | InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    void testAsyncMethod1() {
        WebServiceBook webServiceBook = new WebServiceBook();
        BooksService service = webServiceBook.getBookPort();


        // Method 1
        AsyncBooksHandler asyncHandler = new AsyncBooksHandler();
        Future<?> futureResponse = service.getAllBooksAsync(asyncHandler);

        while (!futureResponse.isDone()) {
            try {
                System.out.println("Method 1. Waiting...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        List<Book> Books = asyncHandler.getResponse().getReturn();
        print(Books);
    }

    @Test
    void testAsyncMethod2() {
        WebServiceBook webServiceBook = new WebServiceBook();
        BooksService service = webServiceBook.getBookPort();


        // Method 1
        Response<GetAllBooksResponse> response = service.getAllBooksAsync();

        while (!response.isDone()) {
            try {
                System.out.println("Method 2. Waiting...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            List<Book> Books = response.get().getReturn();
            print(Books);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public void print(List<Book> Books) {
        if (Books.isEmpty()) {
            log.log(Level.INFO, "No Books found");
            return;
        }

        for (Book Book : Books) {
            log.log(Level.INFO, "Book: " + Book.getId());
            for (Title title2 : Book.getTitles()) {
                log.log(Level.INFO, "Title: " + title2.getTitle() + "\n");
            }
        }
    }
}