package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.base.ReporterListener;
import com.bridgelabz.base.TestNgListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNgListener.class)
@Listeners(ReporterListener.class)
public class TestFailClass extends BaseClass {

    @Test
    public void testPassed() {
        Assert.assertTrue(true);
    }

    @Test
    public void testFailed() {
        Assert.assertTrue(false);
    }

    @Test
    public void testDepend() {
        Assert.assertTrue(true);
    }
}

