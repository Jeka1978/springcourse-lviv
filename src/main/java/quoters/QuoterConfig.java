package quoters;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Configuration
@ComponentScan
@PropertySource("classpath:quotes.properties")
@EnableAspectJAutoProxy
public class QuoterConfig {


}
