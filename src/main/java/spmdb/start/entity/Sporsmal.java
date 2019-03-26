package spmdb.start.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sporsmal {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	Integer niva;
	String spm;
	String svar;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNiva() {
		return niva;
	}
	public void setNiva(int niva) {
		this.niva = niva;
	}
	public String getSpm() {
		return spm;
	}
	public void setSpm(String spm) {
		this.spm = spm;
	}
	public String getSvar() {
		return svar;
	}
	public void setSvar(String svar) {
		this.svar = svar;
	}
	
	
}
