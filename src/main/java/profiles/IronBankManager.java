package profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service
public class IronBankManager {
    @Autowired
    private ProphetService prophetService;

    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork() {
        boolean stark = prophetService.checkIfThisCharacterWillSurviveTheWinter("Stark");

        System.out.println("stark = " + stark);

        boolean targarien = prophetService.checkIfThisCharacterWillSurviveTheWinter("Targarien");
        System.out.println("targarien = " + targarien);

        boolean lanister = prophetService.checkIfThisCharacterWillSurviveTheWinter("Lanister");
        System.out.println("lanister = " + lanister);
    }
}






