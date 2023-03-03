package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass extends BaseClass {

    @Test
    public void robotClassTest() throws AWTException {
        driver.get("https://www.facebook.com/");
        Robot robot = new Robot();
        driver.findElement(By.id("email")).sendKeys("surabhibhagat95@gmail.com");
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        robot.mouseMove(300,500);
        robot.mouseWheel(5000);
    }
}

