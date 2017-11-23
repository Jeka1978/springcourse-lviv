package aop_examples.aop;

import aop_examples.business.DataBaseNotFoundException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Component
@Aspect
public class ExceptionHandlerAspect {

    @Value("${dbaMails}")
    private String[] mails;

    @Pointcut("execution(* aop_examples.business.*.*(..))")
    public void allBusinessMethods(){}

    @Pointcut("execution(* aop_examples.business.dao.*.*(..))")
    public void allDaoMethods(){}

    @AfterThrowing(pointcut = "allDaoMethods()",throwing = "ex")
    public void handleDBExceptions(DataBaseNotFoundException ex) {
        for (String mail : mails) {
            System.out.println("sending to "+mail+" "+ex.getMessage());
        }


    }

















}
