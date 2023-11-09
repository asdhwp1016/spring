package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@Around("allPointcut()")
	public Object arroundLog(ProceedingJoinPoint pjp) throws Throwable{
//		System.out.println("[Before] : ����Ͻ� �޼ҵ� ���� ���� ó���� ����...");
//		Object returnObj = pjp.proceed();
//		System.out.println("[After] : ����Ͻ� �޼ҵ� ���� �Ŀ� ó���� ����...");
//		return returnObj;
		
		String method = pjp.getSignature().getName();
		
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		
		Object obj = pjp.proceed();
		
		stopwatch.stop();
		System.out.println(method+"() �޼ҵ� ���࿡ �ɸ� �ð� : "+stopwatch.getTotalTimeMillis()+"(ms) ��");
		return obj;
	}

}