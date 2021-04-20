package com.example.songr.album;


import com.example.songr.song.SongModel;

import javax.persistence.*;
import javax.annotation.Generated;
import java.util.List;

@Entity
public class AlbumModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageUrl;

    // Select * from student where major_id = id
    @OneToMany(mappedBy = "albumModel", cascade = CascadeType.ALL)
    private List<SongModel> songModels;

    public AlbumModel(){

    }

    public AlbumModel(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    // -----------------------Getter and Setter-----------------------

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<SongModel> getSongModels() {
        return songModels;
    }
}
