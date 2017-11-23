package never_use_switch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Configuration
@EnableScheduling
@ComponentScan
public class Config {

}
