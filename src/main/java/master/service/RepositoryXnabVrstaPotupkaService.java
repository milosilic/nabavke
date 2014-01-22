package master.service;

import java.util.List;

import master.entity.XnabVrstaPostupka;
import master.repository.XnabVrstaPostupkaRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class RepositoryXnabVrstaPotupkaService implements
		XnabVrstaPostupkaService {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryXnabVrstaPotupkaService.class);
	 @Resourse
	 private XnabVrstaPostupkaRepository xnabVrstaPostupkaRepository;
	 
	 

	public List<XnabVrstaPostupka> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setXnabVrstaPostupkaRepository(
			XnabVrstaPostupkaRepository xnabVrstaPostupkaRepository) {
		
		
	}

	

}
