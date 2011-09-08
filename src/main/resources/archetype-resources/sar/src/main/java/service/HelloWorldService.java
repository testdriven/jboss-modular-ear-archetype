package ${package}.service;

import org.jboss.system.ServiceMBeanSupport;

public class HelloWorldService extends ServiceMBeanSupport implements HelloWorldServiceMBean {
	// Our message attribute
	private String message = "Sorry no message today";

	// Getters and Setters
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	// The printMessage operation
	public void printMessage() {
		System.out.println(message);
	}

	// The lifecycle
	protected void startService() throws Exception {
		System.out.println("Starting with message=" + message);
	}

	protected void stopService() throws Exception {
		System.out.println("Stopping with message=" + message);
	}
}
	