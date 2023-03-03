package com.bridgelabz.test;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.base.DataProviderD;
import com.bridgelabz.base.TestNgListener;
import org.openqa.selenium.By;
import org.testng.annotations.*;

@Listeners(TestNgListener.class)
public class WebinarScript extends BaseClass {

    @BeforeTest
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @Test(description = "Webinar Screen Automation", priority = 0, dataProvider = "dataProvider", dataProviderClass = DataProviderD.class)
    public void webinarScreen(String phoneNo, String emailId) throws InterruptedException {
        driver.get("https://bldev.bridgelabz.com/webinar");
        boolean flag  = driver.findElement(By.name("ContactNumber")).isDisplayed();
        if (flag) {
            driver.findElement(By.name("ContactNumber")).sendKeys(phoneNo);
            Thread.sleep(500);
        }
        driver.findElement(By.id("deftemail")).sendKeys(emailId);
        Thread.sleep(500);
    }

//    @Test(description = "Entering mail id into the webinar screen", priority = 1)
//    public void enterEmailId_IntroTextField() {
//        driver.findElement(By.id("deftemail")).sendKeys("surabhibhagat@gmail.com");
//    }
//
//    @Test(priority = 2)
//    public void enterFullName_IntoTextField() {
//        driver.findElement(By.id("deftusername")).sendKeys("Surabhi Bhagat");
//    }

    @Test(dataProvider = "dataProvider", dataProviderClass = DataProviderD.class)
    public void emailId(String emailId) throws InterruptedException {
        driver.get("https://bldev.bridgelabz.com/webinar");
        driver.findElement(By.id("deftemail")).sendKeys(emailId);
        Thread.sleep(500);
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}
