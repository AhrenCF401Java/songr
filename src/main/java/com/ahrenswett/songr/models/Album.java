package com.ahrenswett.songr.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imgURL;

    public Album(){}

    public Album(String title, String artist, int songCount, int length, String imgURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgURL = imgURL;
    }

    public String toString(){
        return String.format( "Album: %s Artist: %s Songs: %d Length: %d sec",this.title,this.artist,this.songCount,this.length);
    }


}
