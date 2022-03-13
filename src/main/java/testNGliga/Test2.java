package testNGliga;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

    @AfterMethod(groups = "1")
    public void aMethod() {
        System.out.println("After Method");
    }

    @Test(groups = "1")
    public void test2() {
        System.out.println("Test");
        System.out.println("Test data: three four");
    }

    @Test(groups = "1")
    public void test3() {
        System.out.println("Test");
        System.out.println("Test data: true false");
    }



}
