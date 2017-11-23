package olya;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OlyaConfig.class);
        ServiceC serviceC = context.getBean(ServiceC.class);
        serviceC.doC();

    }
}
