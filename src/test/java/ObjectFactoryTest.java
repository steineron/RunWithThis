/**
 * Created by rosteiner on 5/17/15.
 */
public class ObjectFactoryTest {

    public static class RunThisTest{
        private static int invoked =0;

        @RunThisMethod(repeat = 10)
        public void test(){
            System.out.println(++invoked);
        }
    }
    @org.junit.Test
    public void testCreateObject() throws Exception {


        ObjectFactory.createObject(RunThisTest.class);

    }
}