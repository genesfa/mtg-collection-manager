package com.ranthas.mtgcollectionmanager.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.ranthas.mtgcollectionmanager.controller.*.*(..))")
    public void logController(JoinPoint joinPoint) {
        LOGGER.debug("Debugging controller endpoints");
        LOGGER.debug("Calling controller: {}", joinPoint.getSignature().getName());
        LOGGER.debug("Arguments: {}", joinPoint.getArgs());
        LOGGER.debug("***********************************************************************************************");
    }
}
