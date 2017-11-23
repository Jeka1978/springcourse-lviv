package quoters;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Component
public class DaniloGreatKing {
    public void sayВеликиеСлова() {
        System.out.println("Кто на нас с мечом придет, тот от меча и погибнет");
    }

}
