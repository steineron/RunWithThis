import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by rosteiner on 5/17/15.
 */
public class ObjectFactory {
    public static Object createObject(Class<?> cls) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object instance = cls.newInstance();
        Method[] classMethods = cls.getMethods();
        for (int i = 0; i < classMethods.length; i++) {
            Method method = classMethods[i];
            RunThisMethod runThisMethod = method.getDeclaredAnnotation(RunThisMethod.class);
            if (runThisMethod != null && runThisMethod.repeat() > 0) {
                int repeat = runThisMethod.repeat();
                for (int j = 0; j < repeat; j++) {
                    method.invoke(instance);

                }
            }
        }
        return instance;
    }
}
