package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "<html>Hello new Client!!!</html>";
    }

    @Override
    public int myCode() {
        return 1;
    }
}
