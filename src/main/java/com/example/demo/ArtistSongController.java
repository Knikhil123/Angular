package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="*", allowedHeaders="*")
@Component
@RestController
public class ArtistSongController {
	
	@Autowired
	private ArtisSongservice artisSongservice; 
	
	
	
	@RequestMapping(value="/topSongs")
	public List<ArtistSong> getAllData(){
		List<ArtistSong> list =(List<ArtistSong>) artisSongservice.getTopSongs();
		return list;
	}
	
	@RequestMapping(value="/aname")
	public List<String> getAllName(){
		List<String> list1= artisSongservice.getArtistName();
		return list1;
	}
	
	@RequestMapping(value="/sname", method =RequestMethod.POST)
	public void sname(@RequestBody ArtistSongs artistsongs) {
		artisSongservice.postAddsongDataAtService(artistsongs);
	}
	
	@RequestMapping(value="/addname", method =RequestMethod.POST)
	public void sname(@RequestBody AddArtist addArtist) {
		artisSongservice.postAddArtistAtService(addArtist);
		
	}
}
