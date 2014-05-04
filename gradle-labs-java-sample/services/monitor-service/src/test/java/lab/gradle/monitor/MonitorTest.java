package lab.gradle.monitor;



import org.junit.*;

/**
 * Created by IntelliJ IDEA.
 * User: shalom
 * Date: Jun 5, 2010
 * Time: 10:44:35 PM
 */

public class MonitorTest {

    @Test
    public void testSample(){
        System.out.println("in testSample, propFrmGradle:"+System.getProperty("propFromGradle"));
    }
}
