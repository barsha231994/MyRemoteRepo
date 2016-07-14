package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Roles;
import com.flp.ems.util.Validate;
import com.flp.ems.view.UserInteraction;



public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public void AddEmployee(HashMap hm) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		/*Department d=new Department();
		Project p=new Project();
		Roles r=new Roles();*/
		UserInteraction u=new UserInteraction();
		Validate v=new Validate();
		if(v.isvalidname(u.name)==true){
			e.setName((String)hm.get("nm"));
		}
		else{
			e.setName(null);
		}
		if(v.isvalidEmail(u.email)==true){
			e.setEmail((String)hm.get("email"));
		}
		else{
			e.setEmail(null);
		}
		if(v.isvalidDate(u.dob)==true){
			e.setDob((String)hm.get("dob"));
		}
		else{
			e.setDob(null);
		}
		if(v.isvalidDate(u.doj)==true){
			e.setDoj((String)hm.get("doj"));
		}
		else{
			e.setDoj(null);
		}
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
