package dir.service;


import java.util.List;
import dir.entity.Department;

public interface DepartmentService {
	
	public List<Department> findAll();

	public Department findById(int theId);

}
