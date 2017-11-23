package quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Component
@Aspect
public class QuoterAspect {


    @Before("execution(* quoters..*.say*(..))")
    public void beforeSayMethods(JoinPoint jp) {

        System.out.println("This is quote of "+jp.getTarget().getClass().getSimpleName());
    }

}
