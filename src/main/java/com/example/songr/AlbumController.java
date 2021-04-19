package com.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;


    @GetMapping("/albums")
    public String getAlbums(Model m){
//        AlbumModel redTomato = new AlbumModel("Red Tomato","Waleed",13,560,"https://i.ytimg.com/vi/ZnSx-k1yk9M/maxresdefault.jpg");
//        AlbumModel singChildren = new AlbumModel("Sing Children","children",12,450,"https://www.iom.int/sites/default/files/press_release/media/pbn_02152018_UNICEF%20Call%20to%20Action2.png");
//        AlbumModel madeEverything = new AlbumModel("Allah Made Everything","Omar Regan & Islamia School",13,326,"https://islamicresourcestore.com/wp-content/uploads/2020/06/ALLAH-MADE.jpg");
//
//        List<AlbumModel> albums = new ArrayList<>();
//        albums.add(redTomato);
//        albums.add(singChildren);
//        albums.add(madeEverything);

        m.addAttribute("albums",albumRepository.findAll());
        return "albumsPage.html";
    }

    @GetMapping("/addAlbum")
    public String getAddAlbumView(){
        return "addAlbum.html";
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
