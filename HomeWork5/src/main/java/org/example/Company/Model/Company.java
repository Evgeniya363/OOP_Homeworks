package org.example.Company.Model;

import java.util.ArrayList;

public class Company {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public static void setEmployee(Employee employee) {
        employees.add(employee);
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }
}

