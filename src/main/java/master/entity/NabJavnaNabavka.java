package master.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="nab_javna_nabavka")
public class NabJavnaNabavka {

	@Id
	private Integer idJavkaNabavka;
	
	private String opis;
	
	private Integer IdKorisnikKreirao;
	
	private Date trenutakKreiranja; 
	
	private Integer idKorisnikAzurirao;
	
	private Date trenutakAzuriranja;
	
	private Boolean fPoPartijama;
	
	private Integer idVrstaPostupka;
	
	private Integer idStatusNabavke;
	
	private Integer idFirma;
	
	
	
	
}
