package models;

import java.util.*;
import javax.persistence.*;

 
@Entity
@Table(name = "users")
public class User{
	private int user_id;
	private String user_email;
	private String user_password;
	private int user_age;
	private String user_sex;
	private String user_city;
	private int user_active;
	
	
    @Id
    @Column(name = "id", nullable = false)
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
    
    @Basic
    @Column(name = "email", nullable = false)
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
    
    @Basic
    @Column(name = "passw", nullable = false)
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
    
    @Basic
    @Column(name = "age", nullable = false)
	public int getUser_age() {
		return user_age;
	}
	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}
    
    @Basic
    @Column(name = "sex", nullable = false)
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
    
    @Basic
    @Column(name = "city", nullable = true)
	public String getUser_city() {
		return user_city;
	}
	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}
    
    @Basic
    @Column(name = "active", nullable = true)
	public int getUser_active() {
		return user_active;
	}
	public void setUser_active(int user_active) {
		this.user_active = user_active;
	}
	
}
