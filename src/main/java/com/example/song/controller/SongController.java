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

import com.example.song.model.Song;
import com.example.song.service.SongH2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class SongController{

    @Autowired
    public SongH2Service songservice ;

    @GetMapping("/songs")
    public ArrayList<Song> getAllSongs(){
        return songservice.getAllSongs();
    }  

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable ("songId") int songId){
        return songservice.getSongById(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songservice.addSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable ("songId") int songId, @RequestBody Song song){
        return songservice.updateSong(songId, song);
    }

    @DeleteMapping("songs/{songId}")
    public void deleteSong(@PathVariable ("songId") int songId){
        songservice.deleteSong(songId);
    }
}