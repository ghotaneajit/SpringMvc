package com.example.registration.regRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registration.entityRepo.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
