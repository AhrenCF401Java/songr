package com.ahrenswett.songr;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTest {
    Album transmuteRelease;

    @Before
    public void setup() {
        transmuteRelease = new Album(
                "Transmute / Release",
                "Whitebear",
                4,
                1200,
                "https://f4.bcbits.com/img/a0913766110_10.jpg"
        );
    }
    @Test
    public void constructor(){
        assertEquals(
                "Transmute / Release",
                transmuteRelease.title
        );
        assertEquals(
                "Whitebear",
                transmuteRelease.artist
        );
    }

    @Test
    public void testToString() {
       assertEquals(
               "Album: Transmute / Release Artist: Whitebear Songs: 4 Length: 1200 sec",
                transmuteRelease.toString()
               );

    }
}