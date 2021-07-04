package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.document.Playlist;
import com.example.demo.repository.PlaylistRepository;

import reactor.core.publisher.Flux;

//@Component
//public class DummyData  implements CommandLineRunner{
//
//	private final PlaylistRepository playlistRepository;
//
//    DummyData(PlaylistRepository playlistRepository) {
//        this.playlistRepository = playlistRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//    	playlistRepository.deleteAll()
//                .thenMany(
//                        Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8",
//                                "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
//                                .map(name -> new Playlist(UUID.randomUUID().toString(), name))
//                                .flatMap(playlistRepository::save))
//                .subscribe(System.out::println);
//    }
//
//
//}