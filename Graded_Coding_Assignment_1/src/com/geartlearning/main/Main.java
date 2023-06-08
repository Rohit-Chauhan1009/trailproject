package com.geartlearning.main;

public class Main {
	
	public static void main(String[] args) {
		//Admin Department
		AdminDepartment AdminDep = new AdminDepartment();
		
		System.out.println("Welcome to "+AdminDep.departmentName());
		System.out.println(AdminDep.getTodaysWork());
		System.out.println(AdminDep.getWorkDeadline());
		System.out.println(AdminDep.isTodayAHoliday());
		System.out.println("");
		
		//Hr Department
		HrDepartment hr = new HrDepartment();
		
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("");
		
		//Tech Department
		TechDepartment tech = new TechDepartment();
		
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println("");
	}

}
