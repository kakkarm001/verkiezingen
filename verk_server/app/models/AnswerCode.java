package models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "codes")
public class AnswerCode{
	private int answer_code_id;
	private int answer_code;
	private String answer_code_text;
	
	@Id
    @Column(name = "id", nullable = false)
	public int getAnswer_code_id() {
		return answer_code_id;
	}
	public void setAnswer_code_id(int answer_code_id) {
		this.answer_code_id = answer_code_id;
	}
    
    @Column(name = "answer_code", nullable = false)
	public int getAnswer_code() {
		return answer_code;
	}
	public void setAnswer_code(int answer_code) {
		this.answer_code = answer_code;
	}
    
    @Column(name = "answer_code_text", nullable = false)
	public String getAnswer_code_text() {
		return answer_code_text;
	}
	public void setAnswer_code_text(String answer_code_text) {
		this.answer_code_text = answer_code_text;
	}
	
	

}
