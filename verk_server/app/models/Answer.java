package models;

import java.util.*;
import javax.persistence.*;
 
 
@Entity
@Table(name = "answers")
public class Answer{

    
	private int answer_id;
	private int user_id;
	private int question_id;
	private int answer_code;
	
	@Id
    @Column(name = "id", nullable = false)
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
    
    @Column(name = "user_id", nullable = false)
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
    
    @Column(name = "question_id", nullable = false)
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
    
    @Column(name = "answer_code_id", nullable = false)
	public int getAnswer_code() {
		return answer_code;
	}
	public void setAnswer_code(int answer_code) {
		this.answer_code = answer_code;
	}
	
	
}
