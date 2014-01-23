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
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.*;

@Service
public class RepositoryXnabVrstaPotupkaService implements
		XnabVrstaPostupkaService {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryXnabVrstaPotupkaService.class);
	 
	 @Resource
	 private XnabVrstaPostupkaRepository xnabVrstaPostupkaRepository;
	 
	 
	 @Transactional(readOnly = true)
	    public List<XnabVrstaPostupka> findAll() {
		  LOGGER.debug("Finding all persons");
		return   xnabVrstaPostupkaRepository.findAll();
		  
		
	}



	public void setXnabVrstaPostupkaRepository(
			XnabVrstaPostupkaRepository xnabVrstaPostupkaRepository) {
		this.xnabVrstaPostupkaRepository = xnabVrstaPostupkaRepository;
		
	}

	

}
