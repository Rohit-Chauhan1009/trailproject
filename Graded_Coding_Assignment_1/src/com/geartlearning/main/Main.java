package com.geartlearning.main;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment AdminDep = new AdminDepartment();
		
		
		
		System.out.println("Welcome to "+AdminDep.departmentName());
		System.out.println(AdminDep.getTodaysWork());
		System.out.println(AdminDep.getWorkDeadline());
		System.out.println("");
		
		HrDepartment hr = new HrDepartment();
		
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println("");
		
		TechDepartment tech = new TechDepartment();
		
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println("");
		
		SuperDepartment sup = new SuperDepartment();
		System.out.println(sup.isTodayAHoliday());
		
	}

}
