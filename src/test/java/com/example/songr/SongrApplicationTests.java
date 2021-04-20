package com.example.songr;

import com.example.songr.album.AlbumModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetTitle(){
		AlbumModel albumModel = new AlbumModel("Allah Made Everything","Omar Regan & Islamia School",13,326,"https://islamicresourcestore.com/wp-content/uploads/2020/06/ALLAH-MADE.jpg");
		String expectedTitle = "Allah Made Everything";
		assertEquals("tests getTitle from Album class",expectedTitle, albumModel.getTitle());
	}

	@Test
	public void testGetArtist(){
		AlbumModel albumModel = new AlbumModel("Allah Made Everything","Omar Regan & Islamia School",13,326,"https://islamicresourcestore.com/wp-content/uploads/2020/06/ALLAH-MADE.jpg");
		String expectedArtist = "Omar Regan & Islamia School";
		assertEquals("tests GetArtist from Album class",expectedArtist, albumModel.getArtist());
	}

	@Test
	public void testGetSongCount(){
		AlbumModel albumModel = new AlbumModel("Allah Made Everything","Omar Regan & Islamia School",13,326,"https://islamicresourcestore.com/wp-content/uploads/2020/06/ALLAH-MADE.jpg");
		int expectedSongCount = 13;
		assertEquals("tests SongCount from Album class",expectedSongCount, albumModel.getSongCount());
	}

	@Test
	public void testGetLength(){
		AlbumModel albumModel = new AlbumModel("Allah Made Everything","Omar Regan & Islamia School",13,326,"https://islamicresourcestore.com/wp-content/uploads/2020/06/ALLAH-MADE.jpg");
		int expectedLength = 326;
		assertEquals("tests SongCount from Album class",expectedLength, albumModel.getLength());
	}

	@Test
	public void testGetImgUrl(){
		AlbumModel albumModel = new AlbumModel("Allah Made Everything","Omar Regan & Islamia School",13,326,"https://islamicresourcestore.com/wp-content/uploads/2020/06/ALLAH-MADE.jpg");
		String expectedImg = "https://islamicresourcestore.com/wp-content/uploads/2020/06/ALLAH-MADE.jpg";
		assertEquals("tests SongCount from Album class",expectedImg, albumModel.getImageUrl());
	}
}
