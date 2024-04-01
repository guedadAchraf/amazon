package com.company.web;

import com.company.dao.CompanyDao;
import com.company.entities.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {


    @Autowired
    private CompanyDao companyDao;

    @GetMapping("welcome")
    public ResponseEntity<String> helloWorld() {
        String message = "Hello World";
        return ResponseEntity.ok().body(message);
    }

    @GetMapping(value = "welcomeJson", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getName() {
        String message = "Hello World,this is achraf speaking";
        return ResponseEntity.ok().body(message);
    }

    @PostMapping(value = "setCompany")
    public ResponseEntity<Company> setPersonData(@RequestBody Company company){
        Company savedCompany = companyDao.save(company);
        return ResponseEntity.ok().body(savedCompany);
    }
}
