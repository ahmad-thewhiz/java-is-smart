package com.ahmad.spring_boot_rest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitor {
    public static final Logger LOGGER= LoggerFactory.getLogger(PerformanceMonitor.class);

    @Around("execution (* com.ahmad.spring_boot_rest.service.JobService.getAllJobs(..))")
    public Object monitorTime(ProceedingJoinPoint pjp) throws Throwable {

        long start=System.currentTimeMillis();

        Object obj = pjp.proceed();

        long end=System.currentTimeMillis();

        LOGGER.info("Time Taken: "+ pjp.getSignature().getName()+ " " +(end-start));

        return obj;
    }
}
