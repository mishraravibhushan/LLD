package personal.call.center;

import java.util.List;

public class CallHandler {
	/**
	 * Three levels of employees: Respondents , managers , directors 
	 */
	private final int LEVELS = 3;
	
	/*
	 * Initialize 10 respondents ,4 managers and 3 directors 
	 */
	private final int NUM_RESPONDENTS = 10;
	private final int NUM_MANAGERS = 4;
	private final int NUM_DIRECTORS = 2;
	
	/*
	 * List of employess by level 
	 * employeeLevels[0] = respondents;
	 * employeeLevels[1] = managers;
	 * employeeLevels[2] = directors;
	 */
	List<List<Employee>> employeeLevels ;
	/**
	 * queuess for each call's rank
	 */
	List<List<Call>> callQueues;
	
	public CallHandler() {
		
	}
	/*
	 * Gets the first available employee who can handle this call
	 */
	public Employee getHandlerForCall(Call call) {
		return new Respondents();
	}
	/*
	 * Routes the call to an available employee pr save in a queue 
	 * if no employee is available
	 */
	public void dispatchCall(Call call) {
		/*
		 * Try to route call to an employee with minimal rank
		 */
		Employee emp = getHandlerForCall(call);
		if(emp != null) {
			emp.receiveCall(call);
			call.setHandler(emp);
		}else {
			/*
			 * Place the call into corresponding call
			 * queue according to it's rank
			 */
			call.reply("Please wait for free employee to reply");
			callQueues.get(call.getRank().getValue()).add(call);
		}
	}
	/*
	 * An employee got free. Look for a waiting call that 
	 * employee can serve. Return true if we assigned call, false otherwise
	 */
	public boolean assignCall(Employee emp) {
		return true;
	}

}
