package org.example.Company;

import org.example.Company.Model.Company;
import org.example.Company.Model.Employee;
import org.example.Company.Service.EmployeeService;
import org.example.Company.Service.VipDataService;
import org.example.Company.Service.VipDepartmentService;
import org.example.Company.View.EmployeeView;
import org.example.Company.View.VipView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("1111","Olga", "Petrova", 23, "accounting", "accountant",80000);
        Employee e2 = new Employee("2222","Eva", "Sokolova", 30, "accounting", "storekeeper",70000);
        Employee e3 = new Employee("1212","Tatyana", "Egorova", 40, "accounting", "senior accountant",100000);
        Employee e4 = new Employee("3322","Petor", "Ilin", 49, "marketing", "marketing specialist",82000);
        Employee e5 = new Employee("3210","Timofei", "Korobov", 44, "company management", "head of department",75000);
        Employee e6 = new Employee("1234","Egor", "Toropov", 33, "company management", "director",90000);

        VipDataService es1 = new VipDataService();
        es1.create(e1);
        es1.create(e2);
        es1.create(e3);
        es1.create(e4);
        es1.create(e5);
        es1.create(e6);
        System.out.println("Added 6 employees:\n" + es1.read());
        es1.delete(e2);
        System.out.println("Deleted id 10005:\n" + es1.read());

        EmployeeService es2 = new EmployeeService();
        e1.setFirstName("Olenka");
        e1.setSecondName("Petrova-Vodkina");
        es2.update(e1);
        System.out.println("Updated id 10001:\n" + es1.read());

        VipDepartmentService vd = new VipDepartmentService();
        vd.add(e5.getDepartment());
        System.out.println("Employees with VIP privileges:\n" + vd.getUserList());

        VipView vv = new VipView();
        vv.view();
        vv.view(e4);

        (new EmployeeView()).view(e3);
    }
}
