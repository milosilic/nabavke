package master.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "xnab_vrsta_postupka" )
public class XnabVrstaPostupka {
	
	@Id
	@Column( name="id_vrsta_potupka", nullable=false, unique= true )
	private Integer idVrstaPostupka; 
	
	private String naziv; 
	
	private Boolean fArhivirano;
	
	

}
