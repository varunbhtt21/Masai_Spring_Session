package com.masai.books.BookManagement.controller;

import com.masai.books.BookManagement.entity.Passport;
import com.masai.books.BookManagement.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassportController {

    @Autowired
    PassportService passportService;


    @GetMapping("/passports")
    public List<Passport> getAllPassport(){
        return passportService.getAllPassport();
    }

    @PostMapping("/passport")
    public Passport insertPassport(@RequestBody Passport passport){
        return passportService.insertPassport(passport);
    }

    @DeleteMapping("/passport/{id}")
    public String deletePassport(@PathVariable("id") Long passportId){

        boolean flag = passportService.deletePassport(passportId);
        if(flag) return "Entry Deleted";
        else return "Fail to Delete";
    }


}
