package org.Validations.PageObjects;

import org.Validations.Utilities.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page_Objects{
    public WebDriver Driver;
    public Login_Page_Objects(WebDriver Driver) {
        this.Driver=Driver;
    PageFactory.initElements(Driver,this);
        PageFactory.initElements(Driver,this);
    }

    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement Heading;
    @FindBy(id = "user-name")
    private WebElement Username;
    @FindBy(id="password")
    private WebElement Password;
    @FindBy(id = "login-button")
    private WebElement Login_Button;

    public WebElement GetHeading(){
        return Heading;
    }
    public WebElement GetUsername(){
       return Username;
    }

    public WebElement GetPassword(){
        return Password;
    }

    public WebElement GetLogin_Button(){
        return Login_Button;
    }

    public void SetLogin(String Name, String Pass){
    Username.sendKeys(Name);
    Password.sendKeys(Pass);
    Login_Button.click();
    }

    public void Login(){
        Username.sendKeys("standard_user");
        Password.sendKeys("secret_sauce");
        Login_Button.click();
        //Driver.switchTo().alert().accept();
    }

}
