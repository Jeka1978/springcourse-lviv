package screen_saver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Configuration
@ComponentScan
public class ScreenSaverConfig {

    @Value("${OS}")
    private String os;
    @Bean
    public Random random(){
        return new Random();
    }

    @Bean(name = "randomColor")
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color randomColor() {
        if (os.toLowerCase().contains("windows")) {

        }
        Color color = new Color(random().nextInt(255), random().nextInt(255), random().nextInt(255));
        return color;
    }
}
