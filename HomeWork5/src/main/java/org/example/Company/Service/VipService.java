package org.example.Company.Service;

import org.example.Company.Model.Employee;
import org.example.Company.Model.User;

import java.util.List;

public interface VipService {
    void create(User user);
    void delete(User user);
    List<User> read();
}
