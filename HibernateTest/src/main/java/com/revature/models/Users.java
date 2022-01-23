package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "users_id")
	private int id;
	@Column(unique = true, nullable = false)
	private String first_name;
	private String last_name;
	private String user_name;
	private String password;
	private String Email;
	

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(String first_name, String last_name, String user_name, String password, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_name = user_name;
		this.password = password;
		Email = email;
	}


	public Users(int id, String first_name, String last_name, String user_name, String password, String email) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_name = user_name;
		this.password = password;
		Email = email;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", user_name="
				+ user_name + ", password=" + password + ", Email=" + Email + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(Email, first_name, id, last_name, password, user_name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(first_name, other.first_name) && id == other.id
				&& Objects.equals(last_name, other.last_name) && Objects.equals(password, other.password)
				&& Objects.equals(user_name, other.user_name);
	}

}
