package com.ahrenswett.songr;

public class Album {
    String title;
    String artist;
    int songCount;
    int length;
    String imgURL;

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
