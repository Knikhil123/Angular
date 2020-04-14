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
@Table(name="artist_songs_user")
public class ArtistSong {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="artist_id", nullable = false , unique= true)
	private Long artistId;
	
	@Column(name="artist_name", nullable = false , unique= true)
	private String artistName;
	

	@Column(name="date_of_birth", nullable = false , unique= true)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(name="songs_id", nullable = false , unique= true)
	private Long songsId;
	
	@Column(name="song_name", nullable = false , unique= true)
	private String songName;
	
	@Column(name= "date_of_release", nullable = false , unique= true)
	@Temporal(TemporalType.DATE)
	private Date dateOfRelease;
	
	@Lob
	@Column(name="cover_image", columnDefinition= "BLOB" , nullable = false , unique= true)
	private byte[] coverImage;
	

	@Column(name="rate", nullable = false , unique= true)
	private Long rate;
	
	@Column(name="user_id", nullable = false , unique= true)
	private Long userId;
	
	@Column(name="name", nullable = false , unique= true)
	private String name;
	
	@Column(name="email", nullable = false , unique= true)
	private String email;

	public ArtistSong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArtistSong(Long artistId, String artistName, Date dateOfBirth, Long songsId, String songName,
			Date dateOfRelease, byte[] coverImage, Long rate, Long userId, String name, String email) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.dateOfBirth = dateOfBirth;
		this.songsId = songsId;
		this.songName = songName;
		this.dateOfRelease = dateOfRelease;
		this.coverImage = coverImage;
		this.rate = rate;
		this.userId = userId;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "ArtistSong [artistId=" + artistId + ", artistName=" + artistName + ", dateOfBirth=" + dateOfBirth
				+ ", songsId=" + songsId + ", songName=" + songName + ", dateOfRelease=" + dateOfRelease
				+ ", coverImage=" + Arrays.toString(coverImage) + ", rate=" + rate + ", userId=" + userId + ", name="
				+ name + ", email=" + email + ", getArtistId()=" + getArtistId() + ", getArtistName()="
				+ getArtistName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getSongsId()=" + getSongsId()
				+ ", getSongName()=" + getSongName() + ", getDateOfRelease()=" + getDateOfRelease()
				+ ", getCoverImage()=" + Arrays.toString(getCoverImage()) + ", getRate()=" + getRate()
				+ ", getUserId()=" + getUserId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Long getArtistId() {
		return artistId;
	}

	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public Long getRate() {
		return rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


} 