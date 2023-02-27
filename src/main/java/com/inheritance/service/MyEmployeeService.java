package com.inheritance.service;

import com.inheritance.entity.MyEmployee;
import com.inheritance.entity.Person;
import com.inheritance.entity.Pet;
import com.inheritance.repository.MyemployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyEmployeeService {

    @Autowired
    private MyemployeeRepo repo;

    public MyEmployee create(MyEmployee myEmployee){
        /*Person person = new Person();
        myEmployee.setPersonId(person.getPersonId());*/
        return repo.save(myEmployee);
    }

    public List<MyEmployee> getAllPersonWithCompany(){
        return repo.findAll();
    }

    public void deleteMyEmployeeById(Long personId)
    {

        repo.deleteById(personId);
    }

    public MyEmployee updatePerson(MyEmployee myEmployee, Long personId) {
        MyEmployee existingPerson = repo.findById(personId).get();
        existingPerson.setName(myEmployee.getName());
        existingPerson.setCompany(myEmployee.getCompany());
        return repo.save(existingPerson);
    }
}
