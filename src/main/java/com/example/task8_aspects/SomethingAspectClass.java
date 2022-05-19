package com.example.task8_aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SomethingAspectClass {
    private int counter = 0;

    @Value("${spring.max_request_count}")
    private int maxCount;


    @Around(value = "execution(public * com.example.task8_aspects.Controller.*(..))")
    public Object addCount(ProceedingJoinPoint pjp) throws Throwable {
        if (counter < maxCount) {
            counter++;
            return pjp.proceed();
        }
        throw new IllegalAccessException();
    }
}
