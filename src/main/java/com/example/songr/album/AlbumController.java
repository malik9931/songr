package com.example.songr.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;


    @GetMapping("/albums")
    public String getAlbums(Model m){
        m.addAttribute("albums",albumRepository.findAll());
        return "AlbumTemplates/albumsPage.html";
    }

    @GetMapping("/albums/{id}")
    public String getAlbumById(Model m,@PathVariable(value = "id") Integer id){
//        AlbumModel albumModel = albumRepository.findById(id).get();
//        m.addAttribute("students",studentRepository.findAll());
        m.addAttribute("album",albumRepository.findById(id).get());

        return "AlbumTemplates/album.html";
    }

    @GetMapping("/addAlbum")
    public String getAddAlbumView(){
        return "AlbumTemplates/addAlbum.html";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(@RequestParam(value = "title") String title ,
                                 @RequestParam(value = "artist") String artist,
                                 @RequestParam(value = "songCount") int songCount,
                                 @RequestParam(value = "length") int length,
                                 @RequestParam(value = "imageUrl") String imageUrl){
        AlbumModel newAlbum = new AlbumModel(title,artist,songCount,length,imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }

}
