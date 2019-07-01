package com.cousre.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasaicAnnotation {
    @Test
    public void TestDome () {
        System.out.println("周兰云大傻逼");
    }
    @BeforeMethod
    public void TestBefore() {
        System.out.println("方法之前运行的");
    }
    @AfterMethod
    public void TestAfter() {
        System.out.println("方法之后运行的");
    }
}
