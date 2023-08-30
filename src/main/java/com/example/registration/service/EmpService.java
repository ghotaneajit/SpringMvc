package com.example.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entityRepo.Emp;
import com.example.registration.regRepo.EmpRepo;

@Service
public class EmpService {

	
			@Autowired 
			private EmpRepo empRepo;
			
			
			
			public String save(Emp emp )
			{
				Emp save = empRepo.save(emp);
				return "saved";
			}
			
			
			
	
}
