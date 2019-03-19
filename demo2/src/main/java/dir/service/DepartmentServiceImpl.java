package dir.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dir.dao.*;
import dir.entity.*;

@Service
public class DepartmentServiceImpl implements DepartmentService{

private DepartmentRepository departmentRepository;
	
	@Autowired
	public DepartmentServiceImpl(DepartmentRepository theDepartmentRepository) {
		departmentRepository= theDepartmentRepository;
	}
	@Override
	public List<Department> findAll() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department findById(int theId) {
		Optional<Department> result = departmentRepository.findById(theId);
		
		Department theDepartment = null;
		
		if (result.isPresent()) {
			theDepartment= result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find Group id - " + theId);
		}
		
		return theDepartment;
	}

}
