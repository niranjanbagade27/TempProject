package com.strategy.design.pattern;

import org.springframework.stereotype.Service;

@Service
public class EmpService {

    public Employee getEmployee(String name, String email){
        Employee e;
        if(name.equals("A") && email.equals("a@a.com")){
            return new Employee(name, email);
        }
        return null;
    }

    public Employee createEmp(String name, String email) {
        Employee e = new Employee(name, email);
        return e;
    }
}
