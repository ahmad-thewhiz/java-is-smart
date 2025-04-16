package com.ahmad.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {

    public static final Logger LOGGER=LoggerFactory.getLogger(LoggingAspect.class);



    @Before("execution (* com.ahmad.spring_boot_rest.service.JobService.getAllJobs(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Before: Method Called "+jp.getSignature().getName());
    }

    @After("execution (* com.ahmad.spring_boot_rest.service.JobService.getAllJobs(..))")
    public void logMethodCallExecuted(JoinPoint jp) {
        LOGGER.info("After: Method Called "+jp.getSignature().getName());
    }

//    @AfterThrowing - only when there is an exception
//    @AfterReturning - only when there is no exception


}