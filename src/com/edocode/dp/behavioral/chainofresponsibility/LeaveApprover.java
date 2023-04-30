package com.edocode.dp.behavioral.chainofresponsibility;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication application);
	
	String getApproverRole();
}
