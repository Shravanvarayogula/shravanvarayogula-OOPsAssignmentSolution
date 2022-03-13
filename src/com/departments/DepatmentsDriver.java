package com.departments;
//Driver class holding main method
/** 
 * 
 * @author shravanvarayogula
 *
 */
public class DepatmentsDriver{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Super class SuperDepartment object reference to child class AdminDepartment object
		SuperDepartment sd = new AdminDepartment();
		System.out.println(" Welcome to " +sd.departmentName());
		System.out.println(sd.getTodaysWork());
		System.out.println(sd.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());

		HrDepartment hd = new HrDepartment();
		System.out.println("");
		System.out.println(" Welcome to " +hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		System.out.println("");
		
		TechDepartment td = new TechDepartment();
		System.out.println(" Welcome to " +td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
		
		
	}

}
