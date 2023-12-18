package com.testng;

import org.testng.annotations.Test;

public class Class1 {

    @Test(description = "This is testcase1")
    public void testcase1() {
        System.out.println("A");
    }

    @Test(description = "This is testcase2")
    public void testcase2() {
        System.out.println("c");
    }

    @Test(description = "This is testcase3")
    public void testcase3() {
        System.out.println("q");
    }
}