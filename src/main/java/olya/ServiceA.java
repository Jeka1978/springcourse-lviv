package olya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service
public class ServiceA {

    public void doA(){
        System.out.println("AAAAAAAAAA");
    }
}
