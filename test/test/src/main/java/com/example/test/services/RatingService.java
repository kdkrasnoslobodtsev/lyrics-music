package com.example.test.services;

import com.example.test.models.Playlist;
import com.example.test.models.Rating;
import com.example.test.models.Song;
import com.example.test.models.SongPlaylist;
import com.example.test.repositories.PlaylistRepository;
import com.example.test.repositories.RatingRepository;
import com.example.test.repositories.SongPlaylistRepository;
import com.example.test.repositories.SongRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RatingService {
    private final RatingRepository ratingRepository;
    public void saveRating(Rating rating) {
        log.info("Saving new {}", rating);
        ratingRepository.save(rating);
    }
}
