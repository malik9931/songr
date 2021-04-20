package com.example.songr.song;

import com.example.songr.album.AlbumModel;

import javax.persistence.*;

@Entity
public class SongModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private int length;
    private int trackNumber;

    @ManyToOne
    private AlbumModel albumModel;

    public SongModel(){

    }

    public SongModel(String title, int length, int trackNumber, AlbumModel albumModel) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.albumModel = albumModel;
    }

    public Integer getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public AlbumModel getAlbumModel() {
        return albumModel;
    }

    public void setAlbumModel(AlbumModel albumModel) {
        this.albumModel = albumModel;
    }
}
