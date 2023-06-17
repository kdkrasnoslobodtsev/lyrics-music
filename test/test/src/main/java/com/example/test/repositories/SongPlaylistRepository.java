package com.example.test.repositories;

import com.example.test.models.SongPlaylist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongPlaylistRepository extends JpaRepository<SongPlaylist, Long>{
}
