package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Artistsongrepository extends CrudRepository <ArtistSong,Long> {

    @Query(value="Select  * from artist_songs_user order by rate desc limit 10;",nativeQuery=true) 
          List<ArtistSong>findAlldata();
     
    @Query(value="Select distinct artist_name from artist_songs_user;",nativeQuery=true)
			List<String>findByname();
	

}