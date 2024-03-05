package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;

public class EmployeeFactory {

    public static Employee createEmployee(String employeeNumber, String firstName, String lastName) {
        //must test first
        if (Helper.isNullorEmpty(employeeNumber) || Helper.isNullorEmpty(firstName)
            || Helper.isNullorEmpty(lastName))
            return null;
        return new Employee.Builder().setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }

    public static Employee createEmployee(String firstName, String lastName) {
        //must test first
        if (Helper.isNullorEmpty(firstName)
                || Helper.isNullorEmpty(lastName))
            return null;

        String employeeNumber = Helper.generateID();

        return new Employee.Builder().setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }

}
