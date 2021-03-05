package com.masai.books.BookManagement.service;

import com.masai.books.BookManagement.entity.Passport;
import com.masai.books.BookManagement.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassportService {

    @Autowired
    PassportRepository passportRepository;

    public List<Passport> getAllPassport() {
        return passportRepository.findAll();
    }


    public Passport insertPassport(Passport passport) {
        return passportRepository.save(passport);

    }

    public boolean deletePassport(Long passportId) {
        Passport passport = passportRepository.findById(passportId).get();

        try{
            passportRepository.delete(passport);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }


    public void helloWorld() {
        System.out.println("hello spring");
    }
}
