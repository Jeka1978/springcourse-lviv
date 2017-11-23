package qualifiers_example;

import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

import static qualifiers_example.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@UCURepo(ORACLE)
public class OracleEmployeeDao implements EmployeeDao {
    @Override
    @SneakyThrows
    public void save() {
        Thread.sleep(500);
        System.out.println("employee was saved to oracle");
    }
}
