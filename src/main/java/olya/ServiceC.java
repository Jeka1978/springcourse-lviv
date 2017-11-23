package olya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service

public class ServiceC {

    @Value("${olya.name}")
    private String ccc;

    @Value("${olya.age}")
    private int age;

    @PostConstruct
    public void init(){
        System.out.println("Service C was created");
    }


    @Autowired
    private ServiceA serviceA;


    public void doC(){
        System.out.println(ccc);
        System.out.println(age);
        System.out.println("CCCCCCCCC");

        serviceA.doA();
    }
}
