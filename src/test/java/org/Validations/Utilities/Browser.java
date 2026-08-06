package org.Validations.Utilities;

import org.Validations.PageObjects.Cart_Page_Objects;
import org.Validations.PageObjects.Home_Page_Objects;
import org.Validations.PageObjects.Login_Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Browser {
    public static WebDriver Driver;

    @BeforeMethod
    public void Launch(){
    System.setProperty("webdriver.edge.driver","C:\\Browser Drivers\\msedgedriver.exe");
        Driver = new EdgeDriver();
        Driver.get("https://www.saucedemo.com/");
        Driver.manage().window().maximize();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Enables only when you are using for the Home_Page_Validations
        Login_Page_Objects LOP = new Login_Page_Objects();
        LOP.Login();
        //Enables only when you are using for the Cart_Page_Validations
        Home_Page_Objects Home = new Home_Page_Objects();
        Home.Addtocart();
        //Enables only when you are using for the Cart_Info_Page_Validations
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        Cart.AddedProducts();
    }

    @AfterMethod
    public void Teardown(){
        Driver.quit();
    }

}
