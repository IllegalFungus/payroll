package za.ac.cput.service;

import za.ac.cput.domain.Employee;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeService  service;

    private EmployeeRepository repository;
    private EmployeeService() {

    }

    public static IEmployeeService getService() {
        if(service == null) {
            service = new EmployeeService();
        }
            return service;
    }
    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee read(String id) {

        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }
}
