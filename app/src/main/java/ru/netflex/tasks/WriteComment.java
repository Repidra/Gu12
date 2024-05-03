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

import java.util.List;

@Log
@Component
@ExternalTaskSubscription("write-comment")
public class WriteComment implements ExternalTaskHandler {

    private BooksService booksService;

    @Autowired
    public WriteComment(BooksService booksService) {
        this.booksService = booksService;
    }


    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        List<Book> books = booksService.getAllBooks();
    }
}
