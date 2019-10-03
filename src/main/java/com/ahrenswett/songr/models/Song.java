package com.ahrenswett.songr.models;

import javax.persistence.*;

@Entity

public class Song {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            long id;

    public String title;
    public int track;
    public double length;

    @ManyToOne
    Album album;


    public Song(String title, int track, double length, Album album) {
        this.title = title;
        this.track = track;
        this.length = length;
        this.album = album;
    }


}
