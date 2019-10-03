package com.ahrenswett.songr.controllers;

import com.ahrenswett.songr.models.Album;
import com.ahrenswett.songr.models.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AlbumRepository albumRepository;


    @GetMapping("/hello")
    public String capitolize(Model m){
        String word = "llama";
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

    @PostMapping("/albums")
    public RedirectView addTheAlbums(String title, String artist, int songCount, int length, String imgURL){
        Album album =new Album(title, artist, songCount, length, imgURL);
        albumRepository.save(album);
        return new RedirectView("albums");
    }

}
