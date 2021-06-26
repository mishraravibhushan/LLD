package personal.call.center;

 abstract class Employee {
	 private Call currentCall = null;
	 protected Rank rank;
	 
	 public Employee() {
		 
	 }
	 
	 public Employee(CallHandler handler) {
		 
	 }
	 /*
	  * Start the conversation
	  */
	 public void receiveCall(Call call) {
		 
	 }
	 /*
	  * This issue is resolved finish the call
	  */
	 public void callCompleted(){
		 
	 }
	 /*
	  * The issue has not been resolved. 
	  * Escalate the call and assign a new call to 
	  * employee
	  */
	 public void escalateAndReassign() {
		 
	 }
	 /*
	  * Assign new call to an employee if the employee is free
	  */
	 public boolean assignNewCall() {
		 return true;
	 }
	 /*
	  * Return whether or not employee is free
	  */
	 public boolean isFree() {
		 return currentCall == null;
	 }
	 public Rank getRacnk() {
		 return rank;
	 }
	 

}
