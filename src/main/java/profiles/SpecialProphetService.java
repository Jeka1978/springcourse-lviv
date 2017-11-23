package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@Service
@Profile("WINTER_IS_HERE")
public class SpecialProphetService implements ProphetService {
    @Override
    public boolean checkIfThisCharacterWillSurviveTheWinter(String name) {
        if (name.toLowerCase().contains("lanister")) {
            return true;
        }else {
            return false;
        }
    }
}
