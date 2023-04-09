package org.example.Company.Service;

import org.example.Company.Model.*;

import java.util.ArrayList;
import java.util.List;

public class VipDepartmentService implements ReferenceService{
    @Override
    public void add(Reference reference) {
        VipDepartment.setDepartment((Department) reference);
    }

    @Override
    public void delete(Reference reference) {
        VipDepartment.removeDepartment((Department) reference);
    }

    @Override
    public List<User> getUserList() {
        List<User> list = new ArrayList<>();
        List<Department> dep = VipDepartment.getVipDepartment();
        for(Employee e: Company.getEmployees()){
            if (dep.contains(e.getDepartment())) {
                list.add(e);
            }
        }
        return list;
    }
}
