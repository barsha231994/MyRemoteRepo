package com.flp.ems.dao;

import com.flp.ems.domain.Employee;


public interface IemployeeDao  {
	void AddEmployee(Employee e);
	void ModifyEmployee();
	void RemoveEmployee();
	void SearchEmployee();
	void getAllEmployee();
}
