package aop_examples.business.dao;

import aop_examples.business.DataBaseNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Repository
public class DaoImpl implements Dao {
    private Random random = new Random();
    @Override
    public void save() {
        int i = random.nextInt(3);
        if (i == 2) {
            throw new DataBaseNotFoundException("fire all DBA!!!");
        }
        System.out.println("saving");
    }
}
