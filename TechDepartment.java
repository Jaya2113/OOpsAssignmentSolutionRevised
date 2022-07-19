package com.greatlearning.gradedassessment;

// The subclass of SuperDepartment
class TechDepartment extends SuperDepartment
{ 
	  String department="Tech Department";
		  String Todaywork="complete coding of module 1";
		  String workdeadline="Complete By EOD";
		  String activity="team Lunch";
		   String stackinformation="core java";
	 	
		public  String departmentName()
		{
			return "Tech Department";
		}
		
		public String getTodaysWork()
		{
			return Todaywork;
		}
		
		public String getWorkDeadline()
		{
			return workdeadline;
		}
		
		public String getTechStackInformation()
				 {
			return stackinformation;
				 }
	}