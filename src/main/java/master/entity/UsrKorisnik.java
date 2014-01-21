package master.entity;

import javax.persistence.*;

@Entity
@Table(name = "usr_korisnik")
public class UsrKorisnik {
	
	@Id
	@Column( unique= true, nullable = false, name="id_korisnik")
	
	private Integer id_korisnik;
	
	private String ime;
	
	private String prezime;
	
	private String maticniBroj;
	
	private String username;
	
	private String password;
	
	
}
