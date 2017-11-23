package qualifiers_example;

import org.springframework.stereotype.Repository;

import static qualifiers_example.DBType.HADOOP;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */

@UCURepo(HADOOP)
public class SparkEmployeeDao implements EmployeeDao {
    @Override
    public void save() {
        System.out.println("Saving to Hadoop....");
    }
}
