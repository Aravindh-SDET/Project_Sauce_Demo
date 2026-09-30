package org.Validations.PageObjects;

import org.Validations.Utilities.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Cart_Page_Objects{
    WebDriver Driver;

    public Cart_Page_Objects(WebDriver Driver){
        Home_Page_Objects H = new Home_Page_Objects(Driver);
        H.Addtocart();
        this.Driver = Driver;
        PageFactory.initElements(Driver, this);
    }

    @FindBy(xpath = "//span[text()='Your Cart']")
    private WebElement PageHeading;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement CartCount;
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private List<WebElement> ProductName;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private List<WebElement> ProductPrice;
    @FindBy(xpath = "//button[@class='btn btn_secondary btn_small cart_button']")
    private WebElement RemoveButton;
    @FindBy(id = "checkout")
    private WebElement CheckoutButton;
    @FindBy(id = "continue-shopping")
    private WebElement ContinueShoppingButton;

    public WebElement GetPageHeading(){
        return PageHeading;
    }
    public WebElement GetCartCount(){
        return CartCount;
    }
    public List<WebElement> GetProductName(){
        return ProductName;
    }
    public List<WebElement> GetProductPrice(){
        return ProductPrice;
    }
    public WebElement GetRemoveButton(){
        return RemoveButton;
    }
    public WebElement GetCheckoutButton(){
        return CheckoutButton;
    }
    public WebElement GetContinueShoppingButton(){
        return ContinueShoppingButton;
    }

    public void AddedProducts(){
        GetCheckoutButton().click();
    }
}
