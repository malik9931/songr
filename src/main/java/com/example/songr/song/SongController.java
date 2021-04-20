package com.example.songr.song;

import com.example.songr.album.AlbumModel;
import com.example.songr.album.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getAllSongs(Model m){
        m.addAttribute("songs",songRepository.findAll());
        return "SongTemplates/allSongs.html";
    }

    @GetMapping("/addSong")
    public String getAddAlbumView(){
        return "SongTemplates/addSong.html";
    }

    @PostMapping("/songs")
    public RedirectView addSong(@RequestParam(value = "title") String title ,
                                 @RequestParam(value = "length") int length,
                                 @RequestParam(value = "trackNumber") int trackNumber,
                                 @RequestParam(value= "albumModelId") AlbumModel albumModelId){
        SongModel newSong = new SongModel(title,length,trackNumber,albumModelId);
        songRepository.save(newSong);
        return new RedirectView("/songs");
    }

//    @PostMapping("/songs")
//    public ResponseEntity<SongModel> addSong(String title, int length, int  trackNumber, AlbumModel albumModelId){
////        AlbumModel album = albumRepository.findById(albumModelId).get();
//        SongModel newSong = new SongModel(title,length, trackNumber ,albumModelId);
//        songRepository.save(newSong);
//        return new ResponseEntity(newSong, HttpStatus.OK);
//    }
}
