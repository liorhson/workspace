package lab.gradle.batch;

import lab.gradle.common.CommonSample;

/**
 * Created by IntelliJ IDEA.
 * User: shalom
 * Date: Jun 5, 2010
 * Time: 10:13:55 PM
 */
public class BatchSample {

    public static void main(String[] args) {
        new BatchSample().sayHello();
    }

    public void sayHello() {
        System.out.println("Hello from BatchSample, calling common..");
        new CommonSample().sayHello();

    }


}
