package com.example.test.controllers;

import com.example.test.models.Playlist;
import com.example.test.models.Song;
import com.example.test.models.SongPlaylist;
import com.example.test.services.PlaylistService;
import com.example.test.services.SongPlaylistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class PlaylistController {
    private final PlaylistService playlistService;
    private final SongPlaylistService songPlaylistService;

    @GetMapping("/playlists")
    public String playlists(Model model) {
        model.addAttribute("playlists", playlistService.listPlaylists());
        return "playlists";
    }

    @GetMapping("/playlists/{id}")
    public String songInfo(@PathVariable Long id, Model model) {
        model.addAttribute("playlist", playlistService.getPlaylistById(id));
        model.addAttribute("songs", playlistService.listSongs(id));
        return "playlist-info";
    }

    @PostMapping("/playlists/create")
    public String createPlaylist(Playlist playlist) {
        playlistService.savePlaylist(playlist);
        return "redirect:/playlists";
    }

    @PostMapping("/playlists/{id}/songs")
    public String addSong(SongPlaylist songPlayList) {
        songPlaylistService.saveSongPlayList(songPlayList);
        return "redirect:/playlists";
    }
}
