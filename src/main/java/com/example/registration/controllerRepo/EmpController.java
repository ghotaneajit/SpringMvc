package com.example.registration.controllerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.registration.entityRepo.Emp;
import com.example.registration.service.EmpService;

@Controller
@RequestMapping
public class EmpController {

	
	@Autowired
	private EmpService service;
	
	
	
	@GetMapping("/")
	public String showHomePage() {
		       return "homePage";
	}
	
	  @GetMapping("/register")
	    public String showRegistration() {
	       return "registerInvoicePage";	
	    }
	  
	  @PostMapping("/save")
	    public String saveInvoice(@ModelAttribute Emp emp, Model model) {
	        service.save(emp);
	        int id = emp.getEmpId();
	        String message = "Record with id : '"+id+"' is saved successfully !";
	        model.addAttribute("message", message);
	        return "registerInvoicePage";
	    }
	
	
	
}
