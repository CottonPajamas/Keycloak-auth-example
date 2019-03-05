package com.authexample.keycloak.exception;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * This is our Global exception handler. Though the stacktrace will no longer appear in the web page,
 * the great thing is, it will still appear in the console and in the logs.
 * 
 * Steps to perform:
 * 	1. Create this class with all the necessary details
 * 	2. Create your default error.html page
 * 	3. Add the necessary parameters in application.properties
 * 
 * 	Note: For RESTful services, may wish to consider returning a 404 message as a JSON (Look at how JHipster does it)
 * 
 * 
 * @author CottonPajamas
 *
 */
@ControllerAdvice  // This will make it as the default behaviour for all controllers to follow
@ConditionalOnProperty(prefix = "app", name = "disable-default-exception-handling")
public class GlobalControllerExceptionHandler {
	
	@ExceptionHandler(Throwable.class)  // Catch any exception
    public String handleException() {
		return "error";		// This points to the default error.html page in the 'templates' folder under resources
    }

}
