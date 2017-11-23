package qualifiers_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static qualifiers_example.DBType.HADOOP;
import static qualifiers_example.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @UCURepo(HADOOP)
    private EmployeeDao employeeDao;

    @UCURepo(ORACLE)
    private EmployeeDao backupDao;


    @Override
    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork() {
        System.out.println("working...");
        employeeDao.save();
    }

    @Override
    @Scheduled(cron = "1/3 * * * * ?")
    public void doBackup() {
        System.out.println("backuping...");
        backupDao.save();
    }
}





