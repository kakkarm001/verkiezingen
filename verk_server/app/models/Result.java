package models;

import java.util.*;
import javax.persistence.*;
 
 
@Entity
@Table(name = "results")
public class Result{
	private int result_id;
	private int user_id;
	private int party_id;

	@Id
    @Column(name = "id", nullable = false)
	public int getResult_id() {
		return result_id;
	}
	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}

    @Column(name = "user_id", nullable = false)
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
    
    @Column(name = "party_id", nullable = false)
	public int getParty_id() {
		return party_id;
	}
	public void setParty_id(int party_id) {
		this.party_id = party_id;
	}
	
	
	
	
}
