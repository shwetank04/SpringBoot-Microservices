package com.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity(name = "user_details")
public class UserEntity {

	@jakarta.persistence.Id
	@GeneratedValue
	private Integer Id;
	@JsonProperty("user_name")
	@Size(min = 2, message = "name shouldhave 2 minimum of character")
	private String name;
	@Past
	private LocalDate birthDate;

	@OneToMany(mappedBy = "userEntity")
	@JsonIgnore
	private List<Post> posts;

	protected UserEntity() {

	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public UserEntity(Integer id, String name, LocalDate birthDate) {
		super();
		Id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
