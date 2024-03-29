package com.ahrenswett.songr.models;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Album {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            Long id;

    String title;
    String artist;
    int songCount;
    int length;
    String imgURL;

    @OneToMany (mappedBy = "album")
    public List<Song> songs;



    public Album(){}

    public Album(String title, String artist, int songCount, int length, String imgURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgURL = imgURL;
//        Using a linked list because i will probably never just look at one song
        this.songs = new LinkedList<>();
    }

    public String toString(){
        return String.format( "Album: %s Artist: %s Songs: %d Length: %d sec",this.title,this.artist,this.songCount,this.length);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
