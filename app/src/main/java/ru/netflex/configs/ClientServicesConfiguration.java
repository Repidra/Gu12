package ru.flibasta.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import ru.flibasta.client.CommentServiceImpl;
import ru.flibasta.server.auth.AuthorisationService;
import ru.flibasta.server.auth.WebServiceAuthorization;
import ru.flibasta.server.comments.CommentService;
import ru.flibasta.server.books.BooksService;
import ru.flibasta.server.books.WebServiceBook;

@Configuration
public class ClientServicesConfiguration {
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    public CommentService getCommentService(WebClient.Builder builder) {
        return new CommentServiceImpl(builder);
    }

    @Bean
    public BooksService getBooksService() {
        WebServiceBook webServiceBook = new WebServiceBook();
        return webServiceBook.getBookPort();
    }

    @Bean
    public AuthorisationService getAuthorisationService() {
        WebServiceAuthorization webServiceAuthorization = new WebServiceAuthorization();
        return webServiceAuthorization.getAuthorizationPort();
    }
}
