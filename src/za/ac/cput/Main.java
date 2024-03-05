package za.ac.cput;

import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

public class Main {
    public static void main(String[] args) {
        //Employee e  = new Employee("Matthew", "Shaw");
        //Employee e2 = new Employee("300123456", "Sheethal", "Tom");

//        Employee e = new Employee.Builder().setFirstName("Matthew")
//                .setLastName("Shaw").build();
        //Allows you to personally choose the setters you want to use when constructing a new object
        Employee e = EmployeeFactory.createEmployee("30011466", "Matthew",
                "Shaw");
        if (e != null) {
            System.out.println(e.toString());
        } else {
            System.out.println("Object was unable to be created.");
        }

    }
}
