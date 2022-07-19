package com.greatlearning.gradedassessment;

//The subclass of SuperDepartment
	  class HrDepartment extends SuperDepartment 
	  {
		   String department="Hr Department";
		   String Todaywork="Fill today's timesheet and mark your attendance";
		   String workdeadline="Complete By EOD";
		   String act="team Lunch";
			   		
		public String departmentName()
		{
			return department;
		}
		
		public String getTodaysWork()
		{
			return Todaywork;
		}
		
		public String getWorkDeadline()
		{
			return workdeadline ;
		}
		public String doActivity()
		{
				 
			return act;
			
		 }
		
	}