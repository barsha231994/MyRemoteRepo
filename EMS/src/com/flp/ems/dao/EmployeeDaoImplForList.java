package com.flp.ems.dao;

import com.flp.ems.domain.Employee;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

import com.flp.ems.dao.IemployeeDao;

public class EmployeeDaoImplForList implements IemployeeDao {

	List<Object> el = new ArrayList<Object>();
	@Override
	public void AddEmployee(Employee e) {
		// TODO Auto-generated method stub
		el.add(e);
		System.out.println(el);
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
