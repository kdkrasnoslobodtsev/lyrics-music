package com.example.test.services;

import com.example.test.models.Song;
import com.example.test.repositories.SongRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SongService {
    private final SongRepository songRepository;

    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    public void saveSong(Song product) {
        log.info("Saving new {}", product);
        songRepository.save(product);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }

    public Song getSongById(Long id) {
        return songRepository.findById(id).orElse(null);
    }


}
