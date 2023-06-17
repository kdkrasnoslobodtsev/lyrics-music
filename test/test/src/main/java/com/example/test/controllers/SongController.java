package com.example.test.controllers;

import com.example.test.models.Rating;
import com.example.test.models.Song;
import com.example.test.services.RatingService;
import com.example.test.services.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class SongController {
    private final SongService songService;
    private final RatingService ratingService;
    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", songService.listSongs());
        return "main-page";
    }

    @GetMapping("/songs/{id}")
    public String songInfo(@PathVariable Long id, Model model) {
        model.addAttribute("song", songService.getSongById(id));
        return "song-info";
    }

    @PostMapping("/songs/create")
    public String createSong(Song song) {
        songService.saveSong(song);
        return "redirect:/songs";
    }

    @PostMapping("/songs/delete/{id}")
    public String deleteSong(@PathVariable Long id) {
        songService.deleteSong(id);
        return "redirect:/songs";
    }

    @PostMapping("/ratings")
    public String estimateSong(Rating rating) {
        ratingService.saveRating(rating);
        return "redirect:/songs";
    }
}
