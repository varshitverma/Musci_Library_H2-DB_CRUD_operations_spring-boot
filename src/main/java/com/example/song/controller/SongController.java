/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

// Write your code here
package com.example.song.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.song.model.Song; 
import com.example.song.service.SongH2Service;

import java.util.*;

@RestController 
public class SongController {

    @Autowired
    private SongH2Service songService;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songService.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songService.addSong(song);
    }

    @GetMapping("/songs/{songId}")

    public Song getSongById(@PathVariable int songId) {
        return songService.getSongById(songId);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable int songId, @RequestBody Song song) {
        return songService.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable int songId) {
        songService.deleteSong(songId);
    }
    
}