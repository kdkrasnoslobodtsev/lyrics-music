package com.example.test.models;

import jakarta.persistence.*;

@Entity
@Table(name = "songplaylists")
public class SongPlaylist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "song_id")
    private Integer song_id;

    @Column(name = "playlist_id")
    private Integer playlist_id;

    public SongPlaylist(Long id, Integer song_id, Integer playlist_id) {
        this.id = id;
        this.song_id = song_id;
        this.playlist_id = playlist_id;
    }

    public SongPlaylist() {
    }

    public Long getId() {
        return this.id;
    }

    public Integer getSong_id() {
        return this.song_id;
    }

    public Integer getPlaylist_id() {
        return this.playlist_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSong_id(Integer song_id) {
        this.song_id = song_id;
    }

    public void setPlaylist_id(Integer playlist_id) {
        this.playlist_id = playlist_id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SongPlaylist)) return false;
        final SongPlaylist other = (SongPlaylist) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$song_id = this.getSong_id();
        final Object other$song_id = other.getSong_id();
        if (this$song_id == null ? other$song_id != null : !this$song_id.equals(other$song_id)) return false;
        final Object this$playlist_id = this.getPlaylist_id();
        final Object other$playlist_id = other.getPlaylist_id();
        if (this$playlist_id == null ? other$playlist_id != null : !this$playlist_id.equals(other$playlist_id))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SongPlaylist;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $song_id = this.getSong_id();
        result = result * PRIME + ($song_id == null ? 43 : $song_id.hashCode());
        final Object $playlist_id = this.getPlaylist_id();
        result = result * PRIME + ($playlist_id == null ? 43 : $playlist_id.hashCode());
        return result;
    }

    public String toString() {
        return "SongPlaylist(id=" + this.getId() + ", song_id=" + this.getSong_id() + ", playlist_id=" + this.getPlaylist_id() + ")";
    }
}
