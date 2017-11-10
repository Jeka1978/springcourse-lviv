package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
public class ShakespearQuoter implements Quoter {
    @Setter
    private String message;

    @InjectRandomInt(min = 30, max =60)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
