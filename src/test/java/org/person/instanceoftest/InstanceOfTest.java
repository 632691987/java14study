package org.person.instanceoftest;

import org.junit.Test;

public class InstanceOfTest
{

    @Test
    public void testDemo() {
        var obj = "This is a message";

        if (obj instanceof String str) {
        	System.out.println(str.transform(s -> "Hello world,".concat(str)));
        }
    }

}
