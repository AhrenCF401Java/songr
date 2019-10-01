package com.ahrenswett.songr;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class HomeController {
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

        Album transmuteRelease = new Album(
                "Transmute / Release",
                "Whitebear",
                4,
                1200,
                "https://f4.bcbits.com/img/a0913766110_10.jpg"
        );
        allAlbums.add(transmuteRelease);

        Album awoke = new Album(
                "Awoke",
                "Random Rab",
                12,
                4536,
                "https://f4.bcbits.com/img/a1516753429_16.jpg"
        );
        allAlbums.add(awoke);

//        add the albums to the page
        m.addAttribute("allAlbums",allAlbums);
//        return the data to the albums page
        return "albums";
    }
}
