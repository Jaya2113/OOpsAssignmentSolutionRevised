package com.greatlearning.gradedassessment;

//The subclass of SuperDepartment
class AdminDepartment extends SuperDepartment
{
	    String department="Admin Department";
		 String Todaywork="Complete Your Document Submission";
		   String workdeadline="Complete By EOD";
		  
		 //method of departmentName	
	    public String departmentName()
	          {
		return department;
	          }
	  //method of getWorkDeadline
	
	public String getTodaysWork()
	{
		return Todaywork;
	}
	
	//method of getWorkDeadline
	public String getWorkDeadline()
	{
		return workdeadline;
	}
}