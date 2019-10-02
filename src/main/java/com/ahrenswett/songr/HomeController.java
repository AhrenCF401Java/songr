package com.ahrenswett.songr;

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
        ArrayList<Album> allAlbums= new ArrayList<>();
//        create new album
        Album karuna = new Album(
                "Karuna",
                "David Starfire",
                10,
                2700,
                "https://f4.bcbits.com/img/a1430017819_10.jpg"
        );
//        add album to arraylist
        allAlbums.add(karuna);
        albumRepository.save(karuna);


        Album transmuteRelease = new Album(
                "Transmute / Release",
                "Whitebear",
                4,
                1200,
                "https://f4.bcbits.com/img/a0913766110_10.jpg"
        );
        allAlbums.add(transmuteRelease);
        albumRepository.save(transmuteRelease);


        Album awoke = new Album(
                "Awoke",
                "Random Rab",
                12,
                4536,
                "https://f4.bcbits.com/img/a1516753429_16.jpg"
        );
        allAlbums.add(awoke);
        albumRepository.save(awoke);


//        add the albums to the page
        m.addAttribute("allAlbums",allAlbums);
//        return the data to the albums page
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView addTheAlbums(String title, String artist, int songCount, int length, String imgURL){
        Album album =new Album(title, artist, songCount, length, imgURL);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

}
