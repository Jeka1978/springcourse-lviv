package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service
public class MailSender {

    @Autowired
    private MailDao mailDao;

    @Autowired
    private Map<String,MailGenerator> map;


    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        String mailCode = String.valueOf(mailDao.getMailInfo().getMailCode());
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generateHtml();
        send(html);
    }

    private void send(String html) {
        //code which use apache mail module in ordere to send an email
        System.out.println("html = " + html);
    }
}








