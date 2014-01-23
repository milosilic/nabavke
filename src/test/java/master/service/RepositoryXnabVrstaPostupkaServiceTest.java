package master.service;

import java.util.ArrayList;
import java.util.List;

import master.entity.XnabVrstaPostupka;
import master.repository.XnabVrstaPostupkaRepository;


import org.junit.Before;
import org.junit.Test;
import org.springframework.webflow.test.MockAction;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RepositoryXnabVrstaPostupkaServiceTest {
	
	private RepositoryXnabVrstaPotupkaService xnabVrstaPotupkaService; 
	private XnabVrstaPostupkaRepository xnabVrstaPostupkaRepository;
	
	@Before
	public void setup () {
		
		xnabVrstaPotupkaService  = new RepositoryXnabVrstaPotupkaService();
		xnabVrstaPostupkaRepository = mock( XnabVrstaPostupkaRepository.class);
		xnabVrstaPotupkaService.setXnabVrstaPostupkaRepository(xnabVrstaPostupkaRepository);
		
	}
	
	@Test
    public void findAll() {
        List<XnabVrstaPostupka> persons = new ArrayList<XnabVrstaPostupka>();
        when(xnabVrstaPostupkaRepository.findAll()).thenReturn(persons);
        
        List<XnabVrstaPostupka> returned = xnabVrstaPotupkaService.findAll();
        
        verify(xnabVrstaPostupkaRepository, times(1)).findAll();
        verifyNoMoreInteractions(xnabVrstaPostupkaRepository);
        
        assertEquals(persons, returned);
    }
	
	

}
