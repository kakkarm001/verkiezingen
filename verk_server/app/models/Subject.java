package models;

import java.util.*;
import javax.persistence.*;
 
 
@Entity
@Table(name = "subjects")
public class Subject{
	private int subject_id;
	private String subject_name;
	
    @Id
    @Column(name = "id", nullable = false)
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
    
    @Basic
    @Column(name = "name", nullable = false)
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
		
}
