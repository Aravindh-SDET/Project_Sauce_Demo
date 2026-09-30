package org.Validations.PageObjects;

import org.Validations.Utilities.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Info_Objects{
    WebDriver Driver;
    public Checkout_Info_Objects(WebDriver Driver) {
        Cart_Page_Objects C = new Cart_Page_Objects(Driver);
        C.AddedProducts();
        this.Driver = Driver;
        PageFactory.initElements(Driver,this);
    }

    @FindBy(id = "first-name")
    private WebElement FirstName;
    @FindBy(id="last-name")
    private WebElement LastName;
    @FindBy(id="postal-code")
    private WebElement Zipcode;
    @FindBy(xpath="//span[@class='title']")
    private WebElement CheckoutPageTittle;
    @FindBy(xpath="//span[@class='shopping_cart_badge']")
    private WebElement CartIconUpdate;
    @FindBy(id = "continue")
    private WebElement ContinueButton;
    @FindBy(id = "cancel")
    private WebElement CancelButton;
    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement ErrorMsg;
    @FindBy(xpath = "//div[@class='error-message-container error']")
    private WebElement ErrorMsgColor;

    public WebElement GetFirstName(){
        return FirstName;
    }
    public WebElement GetLastName(){
        return LastName;
    }
    public WebElement GetZipcode(){
        return Zipcode;
    }
    public WebElement GetCheckoutPageTittle(){
        return CheckoutPageTittle;
    }
    public WebElement GetCartIconUpdate(){
        return CartIconUpdate;
    }
    public WebElement GetContinueButton(){
        return ContinueButton;
    }
    public WebElement GetCancelButton(){
        return CancelButton;
    }
    public WebElement GetErrorMsg(){
        return ErrorMsg;
    }
    public WebElement GetErrorMsgColor(){
        return ErrorMsgColor;
    }

    public void PageInfo() {
        GetFirstName().sendKeys("David");
        GetLastName().sendKeys("Kingston");
        GetZipcode().sendKeys("456789");
        GetContinueButton().click();
    }
}
