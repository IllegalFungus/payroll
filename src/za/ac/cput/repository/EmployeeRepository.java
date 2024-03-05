package za.ac.cput.repository;

import jdk.nio.mapmode.ExtendedMapMode;
import za.ac.cput.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private IEmployeeRepository repository = null;
    private List<Employee> employeeList;

    private EmployeeRepository () {
        employeeList = new ArrayList<Employee>();
    }

    public IEmployeeRepository getRepository() {
        if (repository == null) {
            repository = new EmployeeRepository();
        }
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        boolean success = employeeList.add(employee);
        if (success) {
            return employee;
        } else {
            return null;
        }
    }

    @Override
    public Employee read(String employeeNumber) {
        for (Employee e: employeeList) {
            if (e.getEmployeeNumber().equals(employeeNumber))
                return e;
        }
        return null;
        //Lambda expression. find the one line code to do linear search
    }

    @Override
    public Employee update(Employee employee) {
        String employeeNumber = employee.getEmployeeNumber();
        Employee employeeToUpdate = read(employeeNumber);

        if (employeeToUpdate == null)
            return null;
        if (delete(employeeNumber)) {
            if (employeeList.add(employee))
                return employee;
            return null;
        }
        return null;
    }

    @Override
    public boolean delete(String employeeNumber) {
        Employee employeeToDelete = read(employeeNumber);
        if (employeeToDelete == null)
            return false;
        if (employeeList.remove(employeeNumber)) {
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }
}
