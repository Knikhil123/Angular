package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtisSongservice {
	@Autowired
	private Artistsongrepository artistsongrepository;
	
	@Autowired
	private  Artistsongsrepository  artistsongsrepository;
	
	@Autowired
	private AddArtistrepository addArtistrepository;
	
	public List<ArtistSong> getTopSongs(){
		List<ArtistSong> songs=(List<ArtistSong>) artistsongrepository.findAlldata();
		return songs;
	}
	public List<String> getArtistName(){
		List<String> names=(List<String>) artistsongrepository.findByname();
		return names;
	}
	
	public void postAddsongDataAtService(ArtistSongs artistsongs) {
				artistsongsrepository.save(artistsongs);
}
	public void postAddArtistAtService(AddArtist addArtist) {
		addArtistrepository.save(addArtist);
}
	
}
