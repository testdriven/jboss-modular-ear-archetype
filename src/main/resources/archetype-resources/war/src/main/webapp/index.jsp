#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%@page import="java.util.Hashtable"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="${package}.ejb.Service"%>

<%
	Context initContext = null;
	Hashtable env = new Hashtable(1);
	try {
		initContext = new InitialContext(env);
	} catch (Exception e) {
		out.println("Oops.. couldn't get initContext <br/>" + e.getMessage());
	}
	try {
		// Call EJB methods 
		Service service = (Service) initContext.lookup("${groupId}.${rootArtifactId}-${version}/ServiceBean/local");
		out.println(service.action());
	} catch (Exception e) {
		e.printStackTrace();
		out.println("Oops.. error while calling ServiceBean<br/>" + e.getMessage());
	}
%>
