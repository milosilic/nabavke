package master.controller;

import master.config.Application;
import master.entity.XnabVrstaPostupka;
import master.repository.XnabVrstaPostupkaRepository;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		
		XnabVrstaPostupkaRepository xnabVrstaPostupkaRepository = context.getBean(XnabVrstaPostupkaRepository.class);
		 // fetch all customers
        Iterable<XnabVrstaPostupka> customers = xnabVrstaPostupkaRepository.findAll();
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (XnabVrstaPostupka customer : customers) {
            System.out.println(customer);
        }
        System.out.println();
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}
	
}