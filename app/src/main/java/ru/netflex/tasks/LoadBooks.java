package ru.flibasta.tasks;

import lombok.extern.java.Log;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.flibasta.server.books.Book;
import ru.flibasta.server.books.BooksService;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

@Log
@Component
@ExternalTaskSubscription("load-books")
public class LoadBooks implements ExternalTaskHandler {

    private BooksService booksService;

    @Autowired
    public LoadBooks(BooksService booksService) {
        this.booksService = booksService;
    }


    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        List<Book> books = booksService.getAllBooks();
        log.log(Level.INFO, "Книг: " + books.size());
        externalTaskService.complete(externalTask, Collections.singletonMap("books", books));
    }
}
