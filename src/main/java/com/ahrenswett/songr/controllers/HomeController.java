package com.ahrenswett.songr.controllers;

import com.ahrenswett.songr.models.Album;
import com.ahrenswett.songr.models.AlbumRepository;
import com.ahrenswett.songr.models.Song;
import com.ahrenswett.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;


    @GetMapping("/hello/{word}")
    public String capitolize(@PathVariable String word, Model m){
        m.addAttribute("word",word.toUpperCase());
        return "home";
    }


    @GetMapping("/albums")
    public String albums(Model m){
// create an arraylist to hold albums
        List<Album> allAlbums= albumRepository.findAll();
//        add the albums to the page
        m.addAttribute("allAlbums",allAlbums);
//        return the data to the albums page
        return "albums";
    }

    @GetMapping("/albums/{id}")
    public String detailedAlbumDisplay(@PathVariable Long id, Model m){
        m.addAttribute("album",albumRepository.getOne(id));
        return "album_details";
    }

    @GetMapping("/songs")
    public String songs(Model m){
        List<Song> allSongs = songRepository.findAll();
        m.addAttribute("allSongs",allSongs);
        return"songs";
    }

    @PostMapping("/albums")
    public RedirectView addTheAlbums(String title, String artist, int songCount, int length, String imgURL){
        Album album =new Album(title, artist, songCount, length, imgURL);
        albumRepository.save(album);
        return new RedirectView("/albums/{id}");
    }

    @PostMapping("/albums/{id}")
    public String addNewSong(@PathVariable Long id, Model m){
        m.addAttribute("album",albumRepository.getOne(id));
        return "album_details";
    }

}
