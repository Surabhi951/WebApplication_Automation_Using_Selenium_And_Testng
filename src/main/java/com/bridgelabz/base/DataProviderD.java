package com.bridgelabz.base;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderD {

    @DataProvider(name = "dataProvider")
    public static Object[][] getDataForTestExecution(Method m) {
        if (m.getName().equalsIgnoreCase("webinarScreen")) {
            return new Object[][]{
                    {"8795421365", "surabhi@gmail.com"},
                    {"9857412365", "meena@gmail.com"},
                    {"7584963214", "naina@gmail.com"}
            };
        } else {
            return new Object[][]{
                    {"surabhi@gmail.com"},
                    {"meena@gmail.com"},
                    {"naina@gmail.com"}
            };
        }
    }

}
