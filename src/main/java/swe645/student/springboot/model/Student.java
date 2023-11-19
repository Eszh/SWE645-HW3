package swe645.student.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//swe645 assignment03

@Entity
@Data
@Table(name = "surveysform")
@NoArgsConstructor
@AllArgsConstructor

public class Student {
	@Id
    @Column(name = "SID")
    @GeneratedValue
    private long sid;

    @Column(name = "FIRST_NAME")
    private String firstname;

    @Column(name = "LAST_NAME")
    private String lastname;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ZIPCODE")
    private String zipcode;
    
    
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DATE_OF_SURVEY")
    private String date;

 	@Column(name = "LIKEMOST")
    private String likemost;


    @Column(name = "RECOMMEND")
    private String recommend;

	@Column(name = "INTERESTED_IN")
    private String interested_in;
	

	@Column(name = "FEEDBACK")
    private String feedback;


	public long getId() {
		return sid;
	}


	public void setId(long id) {
		this.sid = id;
	}


	public String getFirstName() {
		return firstname;
	}


	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}


	public String getLastName() {
		return lastname;
	}


	public void setLastName(String lastname) {
		this.lastname = lastname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getLikemost() {
		return likemost;
	}


	public void setLikemost(String likemost) {
		this.likemost = likemost;
	}


	public String getRecommend() {
		return recommend;
	}


	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}


	public String getInterested_in() {
		return interested_in;
	}


	public void setInterested_in(String interested_in) {
		this.interested_in = interested_in;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}

