package com.flp.ems.domain;

import com.flp.ems.util.Validate;

public class Employee {
	int count=1;
	String name;
	String kin;
	String email;
	String fon;
	String dob;
	String doj;
	String add;
	String pid;
	String did;
	String rid;
	Validate v=new Validate();
	/*Scanner sc=new Scanner(System.in);
	{
	System.out.println("Enter the no. of Employees::");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
		System.out.println("Generated Employee ID is::"+count);
	}
	}*/
	/*System.out.println("Enter Employee Name::");
	name=sc.next();
	System.out.println("Enter Employee KIN_ID::");
	kin=sc.next();
	System.out.println("Enter Employee email_id::");
	 email=sc.next();
	System.out.println("Enter Employee Phone no.::");
	fon=sc.nextInt();
	System.out.println("Enter Employee Date_of_Birth::");
	dob=sc.next();
	System.out.println("Enter Employee Date_of_Joining::");
	doj=sc.next();
	System.out.println("Enter Employee Address::");
	add=sc.next();
	System.out.println("Enter Project ID::");
	pid=sc.nextInt();
	System.out.println("Enter Department ID::");
	did=sc.nextInt();
	System.out.println("Enter Roles ID::");
	rid=sc.nextInt();
	count++;
		}
	}
	void display(){
		System.out.println("NAME::"+name);
		System.out.println("KIN_ID::"+kin);
		System.out.println("EMAIL_ID::"+email);
		System.out.println("PHONE_NO::"+fon);
		System.out.println("DATE_OF_BIRTH::"+dob);
		System.out.println("DATE_OF_JOINING::"+doj);
		System.out.println("ADDRESS::"+add);
		System.out.println("PROJECT_ID::"+pid);
		System.out.println("DEPARTMENT_ID::"+did);
		System.out.println("ROLES_ID::"+rid);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}*/
	public String getName() {
		System.out.println("Validation of Name::"+v.isvalidname(name));
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKin() {
		return kin;
	}
	public void setKin(String kin) {
		this.kin = kin;
	}
	public String getEmail() {
		System.out.println("Validation of Mail_id::"+v.isvalidEmail(email));
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFon() {
		System.out.println("Validation of Phone_no::"+v.isvalidPhone(fon));
		return fon;
	}
	public void setFon(String string) {
		this.fon = string;
	}
	public String getDob() {
		System.out.println("Validation of Date_of_Birth::"+v.isvalidDate(dob));
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		System.out.println("Validation of Date_of_Joining::"+v.isvalidDate(doj));
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPid() {
		System.out.println("Validation of Project_Id::"+v.isInt(pid));
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getDid() {
		System.out.println("Validation of Department_Id::"+v.isInt(did));
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getRid() {
		System.out.println("Validation of Role_Id::"+v.isInt(rid));
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
}
}
