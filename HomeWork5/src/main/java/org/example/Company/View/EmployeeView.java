package org.example.Company.View;

import org.example.Company.Model.Company;
import org.example.Company.Model.Employee;

public class EmployeeView {
    public void view(Employee employee){
        System.out.println("Employees data:");
        for(Employee e: Company.getEmployees()){
            if (e.equals(employee)){
                System.out.println(employee.toString());
            }
        }
    }
}
