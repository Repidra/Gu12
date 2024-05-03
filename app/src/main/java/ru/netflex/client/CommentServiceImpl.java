package ru.flibasta.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import ru.flibasta.server.comments.Comment;
import ru.flibasta.server.comments.CommentService;

import java.util.List;

@Component
public class CommentServiceImpl implements CommentService {

    private final WebClient webClient;

    public CommentServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8083").build();
    }

    @Override
    public List<Comment> getFilmComments(Long bookId) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/comment")
                        .queryParam("bookId", bookId)
                        .build())
                .retrieve()
                .bodyToFlux(Comment.class)
                .collectList()
                .block();
    }

    @Override
    public Comment setFilmComment(Comment comment) {
        return webClient.post()
                .uri("/comment")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(comment))
                .retrieve()
                .bodyToMono(Comment.class)
                .block();
    }

}
