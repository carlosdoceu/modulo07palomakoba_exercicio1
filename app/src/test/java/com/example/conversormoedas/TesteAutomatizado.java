package com.example.conversormoedas;

import com.example.conversormoedas.util.DriverFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TesteAutomatizado {


    private AndroidDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = DriverFactory.getDriver();

    }

    @Test
    public void TesteConversor() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.example.conversormoedas:id/edit_Real");
        el1.sendKeys("999");
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.conversormoedas:id/btn_Converter");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.example.conversormoedas:id/text_Dolar");
        el3.click();

        Assert.assertEquals("valor em dolares: \n178,07", el3.getText());

        MobileElement el4 = (MobileElement) driver.findElementById("com.example.conversormoedas:id/edit_Real");
        el4.clear();
        el4.sendKeys("0.1");
        MobileElement el5 = (MobileElement) driver.findElementById("com.example.conversormoedas:id/btn_Converter");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.example.conversormoedas:id/text_Dolar");
        el6.click();
        Assert.assertEquals("valor em dolares: \n0,02", el3.getText());
    }


    @After
    public void tearDown() {
        DriverFactory.finalizarDriver();
    }


}
