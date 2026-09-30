package org.Validations.Validations;

import org.Validations.PageObjects.Login_Page_Objects;
import org.Validations.Utilities.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Loginpage_Validations extends Browser {

    @Test(priority = 1)
    public void URL_Validation(){
        Login_Page_Objects Home_Page = new Login_Page_Objects(Driver);
        String Current_URL = Driver.getCurrentUrl();
        System.out.println(Current_URL);
    }

    @Test(priority = 2)
    public void HomepageTittle(){
        Login_Page_Objects Home_Page = new Login_Page_Objects(Driver);
        String Homepage_Tittle = Driver.getTitle();
        System.out.println(Homepage_Tittle);
    }

    @Test(priority = 3)
    public void HomepageHeading(){
        Login_Page_Objects Home_Page = new Login_Page_Objects(Driver);
        String Homepage_Heading = Home_Page.GetHeading().getText();
        System.out.println(Homepage_Heading);
    }

    @Test(priority = 4)
    public void UsernameField(){
        Login_Page_Objects Home_Page = new Login_Page_Objects(Driver);
        String Username_Placeholder = Home_Page.GetUsername().getAttribute("placeholder");
        System.out.println(Username_Placeholder);
    }

    @Test(priority = 5)
    public void PasswordField(){
        Login_Page_Objects Home_Page = new Login_Page_Objects(Driver);
        String Password_Placeholder = Home_Page.GetPassword().getAttribute("placeholder");
        System.out.println(Password_Placeholder);
    }

    @Test(priority = 6)
    public void ButtonName(){
        Login_Page_Objects Home_Page = new Login_Page_Objects(Driver);
        WebElement Button_Name = Home_Page.GetLogin_Button();
        String Name = Button_Name.getAttribute("value");
        System.out.println(Name);
    }

    @Test(priority = 7)
    public void ButtonColour(){
        Login_Page_Objects Home_Page = new Login_Page_Objects(Driver);
        String Button_Colour = Home_Page.GetLogin_Button().getCssValue("background-color");
        System.out.println(Button_Colour);
    }

    @Test(priority = 8)
    public void Login(){
    Login_Page_Objects Home_Page = new Login_Page_Objects(Driver);
        Home_Page.SetLogin("standard_user","secret_sauce");
    }
}
