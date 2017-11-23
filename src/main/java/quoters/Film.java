package quoters;/**
 * @author Evgeny Borisov
 * @since 3.2
 */

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Qualifier
public @interface Film {
}
