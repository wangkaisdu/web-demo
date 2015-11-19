package com.free.wangkai.Service;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Service;

import com.free.wangkai.model.Department;
 
@Service
public class DepartmentService {
 
    public List<Department> listDepartment() {
        List<Department> list = new ArrayList<Department>();
 
        list.add(new Department(1, "Operations", "Chicago"));
        list.add(new Department(2, "HR", "Hanoi"));
        return list;
    }
}