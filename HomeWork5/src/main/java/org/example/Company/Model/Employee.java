package org.example.Company.Model;

public class Employee extends User{
    Department department;
    Profession profession;
    Integer salary;

    public Employee(String password, String firstName, String secondName, Integer age, String department, String profession, Integer salary) {
        super(password, firstName, secondName, age);
        this.department = new Department(department);
        this.profession = new Profession(profession);

        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{ " +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", position='" + profession + '\'' +
                ", salary=" + salary +
                '}';
    }
}
