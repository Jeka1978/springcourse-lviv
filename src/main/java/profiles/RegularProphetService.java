package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service
@Profile("WINTER_IS_COMING")
public class RegularProphetService implements ProphetService {
    private Random random = new Random();
    @Override
    public boolean checkIfThisCharacterWillSurviveTheWinter(String name) {
        if (name.toLowerCase().contains("stark")) {
            return false;
        }
        return true;
    }
}
