package qualifiers_example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */

@Configuration
@ComponentScan
@EnableScheduling
public class JavaConfig {
}
