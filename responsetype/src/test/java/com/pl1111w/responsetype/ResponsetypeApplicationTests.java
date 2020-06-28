package com.pl1111w.responsetype;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootTest
class ResponsetypeApplicationTests {

    @Test
    void contextLoads() {

        Mono<String> bodyMono = WebClient.create().get().uri("http://localhost:8080/user/query")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToMono(String.class);
        System.out.println(bodyMono.block());
    }
    @Test
    void contextLoads1() {

        Mono<String> bodyMono = WebClient.create().post().uri("http://localhost:8080/user/delete")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToMono(String.class);
        System.out.println(bodyMono.block());
    }

}
