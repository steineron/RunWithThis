import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by rosteiner on 5/17/15.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RunThisMethod {
    int repeat();
}
