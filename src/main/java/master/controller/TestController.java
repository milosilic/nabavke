package master.controller;

import java.security.Principal;
import java.util.List;

import master.entity.XnabVrstaPostupka;
import master.service.XnabVrstaPostupkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {
	
	 private XnabVrstaPostupkaService xnabVrstaPostupkaService;

	    @Autowired
	    public TestController(XnabVrstaPostupkaService xnabVrstaPostupkaService) {
		this.xnabVrstaPostupkaService = xnabVrstaPostupkaService;
	    }

	    @RequestMapping(value = "/hotels/search", method = RequestMethod.GET)
	    public void search(SearchCriteria searchCriteria, Principal currentUser, Model model) {
	    	System.out.println("********************************************************************");
		if (currentUser != null) {
		    List<XnabVrstaPostupka> booking = xnabVrstaPostupkaService.findAll();
		    model.addAttribute(booking);
		}
	    }

}
