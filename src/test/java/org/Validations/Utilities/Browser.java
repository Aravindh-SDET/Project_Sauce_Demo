package org.Validations.Utilities;

import org.Validations.PageObjects.Cart_Page_Objects;
import org.Validations.PageObjects.Checkout_Info_Objects;
import org.Validations.PageObjects.Home_Page_Objects;
import org.Validations.PageObjects.Login_Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Browser {
    public WebDriver Driver;

    @BeforeMethod
    public void Launch(){
    //System.setProperty("webdriver.edge.driver","C:\\Browser Drivers\\msedgedriver.exe");
        Driver = new EdgeDriver();
        Driver.get("https://www.saucedemo.com/");
        Driver.manage().window().maximize();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void Teardown(){
        Driver.quit();
    }

}
