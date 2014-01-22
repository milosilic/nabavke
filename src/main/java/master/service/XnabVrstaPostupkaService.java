package master.service;

import java.util.List;

import master.entity.XnabVrstaPostupka;


public interface XnabVrstaPostupkaService {
	
	/**
     * Pronalazi sve vrste postupaka postoje..
     * @return  listu postupaka.
     */
    public List<XnabVrstaPostupka> findAll();

}
