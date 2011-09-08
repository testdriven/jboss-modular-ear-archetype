package ${package}.service;

import org.jboss.system.ServiceMBeanSupport;

import ${package}.common.Printer;

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

	// The lifecycle
	protected void startService() throws Exception {
		Printer.println("Starting with message=" + message);
	}

	protected void stopService() throws Exception {
		Printer.println("Stopping with message=" + message);
	}
}
	