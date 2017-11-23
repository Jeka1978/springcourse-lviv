package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Component
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "<html>Happy Birthday</html>";
    }

    @Override
    public int myCode() {
        return 3;
    }
}
