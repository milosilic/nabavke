package master.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "xnab_vrsta_postupka" )
public class XnabVrstaPostupka {
	
	@Id
	@Column( name="id_vrsta_postupka", nullable=false, unique= true )
	   @GeneratedValue(strategy=GenerationType.AUTO)
	private Long idVrstaPostupka; 
	
	private String naziv; 
	
	private Boolean fArhivirano;
	
	protected XnabVrstaPostupka() {}
	
	

}
