package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user")
public class AddArtist {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id", nullable = false , unique= true)
	private Long userId;
	

	@Column(name="date_of_birth", nullable = false , unique= true)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@Column(name="Bio", nullable = false , unique= true)
	private String bio;

	public AddArtist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddArtist(Long userId, Date dateOfBirth, String bio) {
		super();
		this.userId = userId;
		this.dateOfBirth = dateOfBirth;
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "AddArtist [userId=" + userId + ", dateOfBirth=" + dateOfBirth + ", bio=" + bio + ", getUserId()="
				+ getUserId() + ", getDateOfBirth()=" + getDateOfBirth() + ", getBio()=" + getBio() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
}
