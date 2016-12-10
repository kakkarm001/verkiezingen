package models;

import java.util.*;
import javax.persistence.*;

 
@Entity
@Table(name = "partyanswercodes")
public class PartyAnswerCode{
	private int id;
	private int question_id;
	private int party_id;
	private int answer_code_id;
	
	@Id
    @Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    @Column(name = "question_id", nullable = false)
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
    
    @Column(name = "party_id", nullable = false)
	public int getParty_id() {
		return party_id;
	}
	public void setParty_id(int party_id) {
		this.party_id = party_id;
	}
    
    @Column(name = "answer_cod_id", nullable = false)
	public int getAnswer_code_id() {
		return answer_code_id;
	}
	public void setAnswer_code_id(int answer_code_id) {
		this.answer_code_id = answer_code_id;
	}
	
}
