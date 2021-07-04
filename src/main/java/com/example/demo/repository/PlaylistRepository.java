package com.example.demo.repository;

import com.example.demo.document.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
