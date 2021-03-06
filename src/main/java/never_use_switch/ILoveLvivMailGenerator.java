package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Component
public class ILoveLvivMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "<html>Lviv is the best city in the world in any season</html>";
    }

    @Override
    public int myCode() {
        return 2;
    }

}
