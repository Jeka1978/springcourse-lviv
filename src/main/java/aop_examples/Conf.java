package aop_examples;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@EnableScheduling
@PropertySource("classpath:mails.properties")
public class Conf {


    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Conf.class);
    }
}
