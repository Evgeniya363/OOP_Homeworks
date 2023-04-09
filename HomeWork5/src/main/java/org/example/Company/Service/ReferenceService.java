package org.example.Company.Service;

import org.example.Company.Model.Department;
import org.example.Company.Model.Reference;
import org.example.Company.Model.User;

import java.util.List;

public interface ReferenceService {
    public void add(Reference reference);
    public void delete(Reference reference);
    public List<User> getUserList();
}
