package com.example.test.services;

import com.example.test.models.Playlist;
import com.example.test.models.Song;
import com.example.test.models.SongPlaylist;
import com.example.test.repositories.PlaylistRepository;
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
public class PlaylistService {
    private final PlaylistRepository playlistRepository;
    private final SongPlaylistRepository songPlaylistRepository;
    private final SongRepository songRepository;

    public List<Playlist> listPlaylists() {
        return playlistRepository.findAll();
    }

    public void savePlaylist(Playlist playlist) {
        log.info("Saving new {}", playlist);
        playlistRepository.save(playlist);
    }

    public List<Song> listSongs(Long id) {
        List<Song> songs = new ArrayList<>();
        for (SongPlaylist songPlaylist: songPlaylistRepository.findAll()) {
            if (songPlaylist.getPlaylist_id().equals(id)) {
                Song song = songRepository.findById(Long.valueOf(songPlaylist.getSong_id())).orElse(null);
                songs.add(song);
            }
        }
        return songs;
    }

    public void deletePlaylist(Long id) {
        playlistRepository.deleteById(id);
    }

    public Playlist getPlaylistById(Long id) {
        return playlistRepository.findById(id).orElse(null);
    }
}
