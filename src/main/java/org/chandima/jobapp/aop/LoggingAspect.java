package org.chandima.jobapp.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {
    public static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution (* org.chandima.jobapp.service.JobService.*(..))")
    public void logMethodCall() {
        LOGGER.info("Method Called ");
    }
}
