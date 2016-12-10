package models;

import java.util.*;
import javax.persistence.*;
 

@Entity
@Table(name = "parties")
public class Party{
	private int party_id;
	private String party_name;
	private String party_text;
	
	@Id
    @Column(name = "id", nullable = false)
	public int getParty_id() {
		return party_id;
	}
	public void setParty_id(int party_id) {
		this.party_id = party_id;
	}
    
    @Column(name = "name", nullable = false)
	public String getParty_name() {
		return party_name;
	}
	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
    
    @Column(name = "suggestion_text", nullable = false)
	public String getParty_text() {
		return party_text;
	}
	public void setParty_text(String party_text) {
		this.party_text = party_text;
	}
	
	
}
