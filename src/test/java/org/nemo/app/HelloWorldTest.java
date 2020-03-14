package org.nemo.app;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void test_printName(){
        HelloWorld helloWorld = new HelloWorld();

        String name = helloWorld.printName("Jayaprakash", "Gadi");
        Assert.assertEquals(name, "Jayaprakash Gadi");
    }

}
