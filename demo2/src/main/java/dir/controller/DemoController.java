package dir.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	public DemoController(DepartmentService thedepartmentService) {
		departmentService=thedepartmentService;
	}
	
	@GetMapping("/departments_list")
	public String listDepartments(Model theModel) {
		
		List<Department> theDepartments=departmentService.findAll();
		
		theModel.addAttribute("departments",theDepartments);
		
		return "/departments/list_departments";
		
	}
	
	@GetMapping("/contact")
	public String listContacts(@RequestParam("departmentId") int theId, Model theModel) {
		
			List<Contact> theContacts=contactService.findById(theId);
		
			theModel.addAttribute("contacts",theContacts);
		
			return "/departments/list_contacts";
	}


}
