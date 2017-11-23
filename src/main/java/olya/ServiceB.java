package olya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service
public class ServiceB {

    @Autowired
    private ServiceC serviceC;

    public void doB(){
        System.out.println("BBBBBBBBB");
    }
}
