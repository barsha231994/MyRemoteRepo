package com.flp.ems.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Roles;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;


public class UserInteraction {
	
	public String name;
	public String kin;
	public String email;
	public int fon;
	public String dob;
	public String doj;
	
	 HashMap me=new HashMap();
	 Scanner sc=new Scanner(System.in);
	 void AddEmployee(){
		 
		 System.out.println("Enter the number of Employee details u want to enter");
		 int n=sc.nextInt();
		 for(int i=0;i<=n;i++){
		Employee e=new Employee();
		Project p=new Project();
		Department d=new Department();
		Roles r=new Roles();
		
		System.out.println("Enter the Employee name:");
		name=sc.next();
		
		System.out.println("Enter the KIN_ID");
		kin=sc.next();
		
		System.out.println("Enter the Email_ID");
		email=sc.next();
		
		System.out.println("Enter the Phone_No");
		fon=sc.nextInt();
		
		System.out.println("Enter the Date of Birth of the Employee");
		dob=sc.next();
		Validate v=new Validate();
		v.isvalidDate(dob);
	
		
		System.out.println("Enter the Date of Joining of the Employee");
		doj=sc.next();
		Validate v1=new Validate();
		v.isvalidDate(doj);
		
		d.setName("abc");
		d.setDept(34);
		d.setDesc("xyz");
		p.setName("htdhsj");
		p.setPrjct(8);
		r.setName("yeie");
		r.setRole(1586);
		
		
		 String d1 = String.valueOf(e.getDid());
		 String p1 = String.valueOf(e.getPid());
		 String r1 = String.valueOf(e.getRid());
		 me.put("nm",name);
		 me.put("kinid",kin);
		 me.put("emailid",email);
		// me.put("phone",fon);
		 me.put("dateB",dob);
		 me.put("dateJ",doj);
		 me.put("Deprt",d1);
		 me.put("Proj",p1);
		 me.put("Role",r1);
		 System.out.println(me);
		 
		 EmployeeServiceImpl es=new  EmployeeServiceImpl();
		 es.AddEmployee(me);
		/* EmployeeDaoImplForList ed=new  EmployeeDaoImplForList();
		 ed.AddEmployee(me);*/
	
		/*	e.setName("Barsha");
			e.setKin("71930_FS");
			e.setEmail("barsha.mishra@capgemini.com");
			e.setFon("8984719344");
			e.setDob("23/11/1994");
			e.setDoj("30/05/1/2016");
			e.setAdd("Pune");
			e.setPid("12586");
			e.setDid("125");
			e.setRid("586");
		
			 Map<String,String> me=new HashMap<String,String>();
			*/ 
			//me.put(key, value);
			/*e.getName();
			e.getEmail();
			e.getFon();
			e.getDob();
			e.getDoj();
			e.getAdd();
			e.getPid();
			e.getDid();
			e.getRid();
			e.getKin();*/
		 }
		}
		void ModifyEmployee(){
			
		}
		void RemoveEmployee(){
			
		}
		void SearchEmployee(){
			
		}
		void getAllEmployee(){
			
			
		}
		
}
