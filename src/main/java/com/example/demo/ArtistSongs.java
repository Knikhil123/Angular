package com.example.demo;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="songs")
public class ArtistSongs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="songs_id", nullable = false , unique= true)
	private Long songsId;
	
	@Column(name="song_name", nullable = false , unique= true)
	private String songName;
	
	@Column(name="artist_name", nullable = false , unique= true)
	private String artistName;
	
	@Column(name= "date_of_release", nullable = false , unique= true)
	@Temporal(TemporalType.DATE)
	private Date dateOfRelease;
	
	@Lob
	@Column(name="cover_image", columnDefinition= "BLOB" , nullable = false , unique= true)
	private byte[] coverImage;
	

	@Column(name="user_id", nullable = false , unique= true)
	private Long userId;

	@Column(name="rate", nullable = false , unique= true)
	private Long rate;

	public ArtistSongs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArtistSongs(Long songsId, String songName, String artistName, Date dateOfRelease, byte[] coverImage,
			Long userId, Long rate) {
		super();
		this.songsId = songsId;
		this.songName = songName;
		this.artistName = artistName;
		this.dateOfRelease = dateOfRelease;
		this.coverImage = coverImage;
		this.userId = userId;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "ArtistSongs [songsId=" + songsId + ", songName=" + songName + ", artistName=" + artistName
				+ ", dateOfRelease=" + dateOfRelease + ", coverImage=" + Arrays.toString(coverImage) + ", userId="
				+ userId + ", rate=" + rate + ", getSongsId()=" + getSongsId() + ", getSongName()=" + getSongName()
				+ ", getArtistName()=" + getArtistName() + ", getDateOfRelease()=" + getDateOfRelease()
				+ ", getCoverImage()=" + Arrays.toString(getCoverImage()) + ", getUserId()=" + getUserId()
				+ ", getRate()=" + getRate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Long getSongsId() {
		return songsId;
	}

	public void setSongsId(Long songsId) {
		this.songsId = songsId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Date getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(Date dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public byte[] getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(byte[] coverImage) {
		this.coverImage = coverImage;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRate() {
		return rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

}
