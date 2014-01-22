package master.service;

import master.repository.XnabVrstaPostupkaRepository;

import org.junit.Before;
import org.junit.Test;
import org.springframework.webflow.test.MockAction;
import static org.mockito.Mockito.*;

public class RepositoryXnabVrstaPostupkaServiceTest {
	
	private RepositoryXnabVrstaPotupkaService xnabVrstaPotupkaService; 
	private XnabVrstaPostupkaRepository xnabVrstaPostupkaRepository;
	
	@Before
	public void setup () {
		
		xnabVrstaPotupkaService  = new RepositoryXnabVrstaPotupkaService();
		xnabVrstaPostupkaRepository = mock( XnabVrstaPostupkaRepository.class);
		xnabVrstaPotupkaService.setXnabVrstaPostupkaRepository(xnabVrstaPostupkaRepository);
		
		
		
		
		
		System.out.println( "ovo je setup");
		
		
	}
	
	@Test
	public void create(){
		
		System.out.println( "create test");
		
		
	}
	
	

}
