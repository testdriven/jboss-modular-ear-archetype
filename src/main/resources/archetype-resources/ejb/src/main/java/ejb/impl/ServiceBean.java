#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ejb.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ${package}.common.Printer;
import ${package}.ejb.Service;
//import ${package}.model.Person;

@Stateless
public class ServiceBean implements Service {
	@PersistenceContext(unitName = "example-pu")
	private EntityManager em;

	@Override
	public String action() {
		Printer.println("Hello, world! from EJB");
//		em.persist(Person.create("John", "Doe"));
		return "Hello, world!";
	}
}
