package org.example.Company.Service;

import org.example.Company.Model.Employee;
import org.example.Company.Model.Company;
import org.example.Company.Model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeService implements UserService {

    @Override
    public void update(User user) {
        List<Employee> list = Company.getEmployees();
        int index = list.indexOf(user);
        if (index > -1) {
            list.set(index, (Employee) user);
        } else {
            System.out.println("id не найден");
        }
    }
}
