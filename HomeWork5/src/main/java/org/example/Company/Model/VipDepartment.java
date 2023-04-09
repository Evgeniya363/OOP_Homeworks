package org.example.Company.Model;

import java.util.ArrayList;
import java.util.List;

public class VipDepartment {
    public static List<Department> vipDepartment = new ArrayList<>();

    public static void setDepartment(Department department) {
        vipDepartment.add(department);
    }

    public static void removeDepartment(Department department) {
        vipDepartment.remove(department);
    }

    public static List<Department> getVipDepartment() {
        return vipDepartment;
    }
}
