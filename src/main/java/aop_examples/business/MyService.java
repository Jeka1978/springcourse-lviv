package aop_examples.business;

import aop_examples.business.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service
public class MyService {
    @Autowired
    private Dao dao;

    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork() {
        System.out.println("working...");
        dao.save();
    }
}
