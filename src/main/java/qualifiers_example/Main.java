package qualifiers_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(JavaConfig.class);
    }
}
