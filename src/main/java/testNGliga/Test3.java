package testNGliga;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Test3 {

    @AfterClass(groups = "1")
    public void aClass() {
        System.out.println("After Class");
    }

    @AfterClass(groups = "1")
    public void aClass2() {
        System.out.println("After Class");
    }

    @BeforeClass(groups = "1")
    public void bClass() {
        System.out.println("Before Class");
    }

    @AfterTest(groups = "1")
    public void aTest() {
        System.out.println("After Test");
    }

    @AfterMethod(groups = "1", onlyForGroups = "1")
    public void aMethod() {
        System.out.println("After Method");
    }

    @Test(groups = "2", invocationCount = 3)
    public void test4() {
        System.out.println("Test");
    }

    @Test(groups = "1")
    public void test5() {
        System.out.println("Test data: 1 2");
    }

    @Test(groups = "2")
    public void test7() {
        System.out.println("Test data: three four");
    }

    @Test(groups = "2")
    public void test6() {
        System.out.println("Test");
    }

    @Test(groups = "2")
    public void test8() {
        System.out.println("Test");
    }

    @Test(groups = "2")
    public void test9() {
        System.out.println("Test data: true false");
    }
}
