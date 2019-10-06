package com.ahrenswett.songr.models;

import javax.persistence.*;

@Entity
public class Song {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            long id;

    String title;
    int track;
    double length;

    @ManyToOne ()
    Album album;

    public Song() {}

    public Song(String title, int track, double length, Album album) {
        this.title = title;
        this.track = track;
        this.length = length;
        this.album = album;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
