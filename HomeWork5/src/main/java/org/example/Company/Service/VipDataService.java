package org.example.Company.Service;

import org.example.Company.Model.*;

import java.util.ArrayList;
import java.util.List;

public class VipDataService extends EmployeeService implements VipService {

    @Override
    public void create(User user) {
        Company.setEmployee((Employee) user);
    }

    @Override
    public void delete(User user) {
        Company.removeEmployee((Employee) user);
    }

    @Override
    public List<User> read() {
        List<User> list = new ArrayList<>();
        Company.getEmployees().forEach(n -> list.add((User) n));
        return list;
    }
}
