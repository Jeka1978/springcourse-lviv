package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service
public class MailSender {

    @Autowired
    private MailDao mailDao;


    private Map<Integer,MailGenerator> map = new HashMap<>();

    @Autowired
    public void initMap(List<MailGenerator> mailGenerators){
        for (MailGenerator mailGenerator : mailGenerators) {
            int code = mailGenerator.myCode();
            if (map.containsKey(code)) {
                throw new IllegalStateException(code + " already in use");
            }
            map.put(code, mailGenerator);
        }
    }


    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        int mailCode = mailDao.getMailInfo().getMailCode();
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








