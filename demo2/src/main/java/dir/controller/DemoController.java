package dir.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dir.entity.*;
import dir.service.*;

@Controller
@RequestMapping("/home")
public class DemoController {
	
private DepartmentService departmentService;
private ContactService contactService;
	
	public DemoController(DepartmentService departmentService, ContactService contactService) {
		this.departmentService = departmentService;
		this.contactService = contactService;
	}
	
	@GetMapping("/departments")
	public String listDepartments(Model theModel) {
		
		List<Department> theDepartments=departmentService.findAll();
		
		theModel.addAttribute("departments",theDepartments);
		
		return "/departments/list";
		
	}
	
	
	//@GetMapping("/departments/{id}")
	@GetMapping("/contacts/{id}")
	public String listContacts(@PathVariable("id") int theId, Model theModel) {
	        Department theDepartments = departmentService.findById(theId);
	        theModel.addAttribute("departments",theDepartments);
	        return "/departments/show";
	        
	        
	}
	
	
	


}
