package com.bridgelabz.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class BaseClass {

    public static WebDriver driver = null;

    @BeforeTest
    @Parameters("browser")
    public void setUp(@Optional("Chrome") String Browser) {
        if (Browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (Browser.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

    public void takeScreenShot(String testName) throws IOException {
        Date date = new Date();
        TakesScreenshot shot = (TakesScreenshot) driver;
        File srcFile = shot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("Screenshot/"+testName+date.getDate()+".png");
        FileUtils.copyFile(srcFile,destFile);
    }
}
