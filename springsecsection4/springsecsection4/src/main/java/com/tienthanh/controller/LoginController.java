package com.tienthanh.controller;

import com.tienthanh.model.Customer;
import com.tienthanh.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer){
        Customer savedCustomer =null;
        ResponseEntity response = null;
        try{

            String hashedPw = passwordEncoder.encode(customer.getPwd());
            customer.setPwd(hashedPw);

            savedCustomer = customerRepository.save(customer);
            if(savedCustomer.getId()>0){
                response = ResponseEntity.status(HttpStatus.CREATED).body("Registered successfully");
            }
        }catch (Exception ex){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception due to "+ex.getMessage());
        }

        return response;
    }
}
