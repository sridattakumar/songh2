// Write your code here
package com.example.song.repository;

import com.example.song.model.Song;
import java.util.*;

public interface SongRepository{
    
    public ArrayList<Song> getAllSongs();

    public Song getSongById(int songId);

    public Song addSong(Song song);

    public Song updateSong(int songId, Song song);

    public void deleteSong(int songId);
}