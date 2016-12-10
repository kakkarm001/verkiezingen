package models;

import java.util.*;
import javax.persistence.*;
 

@Entity
@Table(name = "questions")
public class Question{
	private int question_id;
	private String question;
	private int subject_id;
	private int party_id;
	
	@Id
    @Column(name = "id", nullable = false)
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
    
    @Column(name = "question", nullable = false)
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
    
    @Column(name = "subject_id", nullable = false)
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
    
    @Column(name = "party_id", nullable = false)
	public int getParty_id() {
		return party_id;
	}
	public void setParty_id(int party_id) {
		this.party_id = party_id;
	}
	
}
