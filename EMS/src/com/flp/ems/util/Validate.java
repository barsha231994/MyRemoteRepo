package com.flp.ems.util;

public class Validate {
	String Email_id;
	static String Phone_no;
	String Address;
	static int Project_id, Role_id;
	static String number;
  static String newname;
	static String Dateofjoining;
	String Dateofbirth;
	static int Deptid;
	static String dept, proj, role;
	static int Data;
	static int Empployeeid, Kinid;

	public static  boolean isvalidname(String name) {
		newname=name;
		if(newname.matches("[A-Z][a-zA-Z]*"))
		{

		}
		return true;
		
		
	}

	static boolean isvalidkin() {

		return true;

	}

	public static boolean isvalidPhone(String phone) {

		isInt(phone);

		if (phone.equals("")) {
			System.out.println("plz enter number");
		} else if (phone.length() > 10) {
			System.out.println("invalid number");

		} else if (phone.length() < 10) {
			System.out.println("invalid number");
		} else {

			System.out.println("valid email id");
		}

		return true;

	}

	public static boolean isInt(String phones) {

		try {
			long i = Long.parseLong(phones);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	public static boolean isvalidEmail(String mail) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(mail);
		return m.matches();

	}
	
	public static boolean isvalidDate(String dat)
	{
		
		
		
		if (dat.matches("\\d{2}-\\d{2}-\\d{4}")) {
		    
			return true;
			
		}else
		{
			return false;
		}
		
	}
}
