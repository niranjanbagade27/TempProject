package com.strategy.design.pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncryptionController {

    @Autowired
    EncryptionFactory factory;

    @Autowired
    EmpService service;

    @GetMapping("/encrypt")
    public void getEncryption(@RequestParam EncryptionEnum type){
        System.out.println("Hi");
        factory.getEncryptionType(type).encrypt();
    }

    @GetMapping("getemp")
    public ResponseEntity<Employee> getEmployee(@RequestParam String name, @RequestParam String email){
        Employee result = service.getEmployee(name, email);

        if(result==null){
            result = service.createEmp(name, email);
        }

        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping("getemp1")
    public Employee getEmployee(@RequestParam String name){
        Employee result = service.getEmployee(name, "");

        if(result==null){
            result = service.createEmp(name, "");
        }

        return result;

    }
}
