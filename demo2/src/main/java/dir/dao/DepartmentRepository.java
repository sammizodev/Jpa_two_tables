package dir.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import dir.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
	

}
