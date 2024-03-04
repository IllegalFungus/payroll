package za.ac.cput.domain;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String employeeNumber;
    private String lastName;

//    public Employee(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public Employee(String employeeNumber, String firstName, String lastName) {
//        this.employeeNumber = employeeNumber;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public Employee(String lastName) {
//        this.lastName = lastName;
//    }
    // task: how to set firstname also - both lastName and firstName are strings... therefore program cannot tell the difference

    private Employee() {}

    //new constructor we added after creating the builder class
    private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(employeeNumber, employee.employeeNumber) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, employeeNumber, lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String employeeNumber;
        private String lastName;

        public Builder setFirstName(String firstName) { // does not return void instead returns Builder class
            this.firstName = firstName;
            return this;
        }

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Employee e) {
            this.employeeNumber = e.employeeNumber;
            this.firstName = e.firstName;
            this.lastName = e.lastName;
            return this;
        }

        public Employee build() { return new Employee(this);}
    }
}
