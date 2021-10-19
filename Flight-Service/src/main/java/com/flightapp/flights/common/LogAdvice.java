package com.flightapp.flights.common;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LogAdvice 
{
	
	private static Logger log = Logger.getLogger(LogAdvice.class);
	
	
	@Pointcut(value = "execution(* com.flightapp.*.*.*(..))")
	public void joinMethod() {}
	
	
	@Around("joinMethod()")
	public Object loggingEntity(ProceedingJoinPoint pjp) throws Throwable
	{
		ObjectMapper mapper = new ObjectMapper();
		
		String className = pjp.getTarget().getClass().toString();
		String methodName = pjp.getSignature().getName();
		Object array[] = pjp.getArgs();
		
		log.info("Method Invoked - " + "Class Name : "+className+ ", Method Name : "+methodName+"()"+ 
				", Arguments : "+mapper.writeValueAsString(array));
		
		Object object = pjp.proceed();
		
		log.info("Class Name : "+className+ ", Method Name : "+methodName+"()"+ 
				", Response : "+mapper.writeValueAsString(object));
		
		return object;
	}
}
