package never_use_switch;

import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */


@Repository
public class MailDaoImpl implements MailDao {
    private Random random = new Random();
    @Override
    public MailInfo getMailInfo() {
        return new MailInfo(random.nextInt(2) + 1);
    }
}
