package za.ac.cput.repository;

import za.ac.cput.domain.Employee;
import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee, String> {
    List<Employee> getAll();
}
