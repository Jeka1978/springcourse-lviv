package profiles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 * @since 3.2
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Config.class)
@ActiveProfiles("WINTER_IS_HERE")
public class IronBankManagerTest {

    @Autowired
    private ProphetService prophetService;

    @Test
    public void testThatStarkWillNotReceiveMoney() throws Exception {
        boolean stark = prophetService.checkIfThisCharacterWillSurviveTheWinter("stark");
        Assert.assertFalse(stark);
    }

}