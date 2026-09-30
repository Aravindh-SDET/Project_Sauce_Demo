package org.Validations.PageObjects;

import org.Validations.Utilities.Browser;
import org.Validations.Validations.Loginpage_Validations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.List;

public class Home_Page_Objects{
    WebDriver Driver;

    public Home_Page_Objects(WebDriver Driver){
        Login_Page_Objects L = new Login_Page_Objects(Driver);
        L.Login();
        this.Driver = Driver;
        PageFactory.initElements(Driver,this);
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement Heading;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement Carticon;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement Filtericon;
    @FindBy(id = "react-burger-menu-btn")
    private WebElement Menuicon;
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    private WebElement Bag_Name;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement Dropdown;
    @FindBy(xpath = "//span[@class='active_option']")
    private WebElement Visible_Option;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement Bag_Addtocartbutton;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement TShirt_Addtocartbutton;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement BikeLight_Addtocartbutton;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement BlackTShirt_Addtocartbutton;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement RedTShirt_Addtocartbutton;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement BabyTShirt_Addtocartbutton;
    @FindBy(xpath = "//a[@class='shopping_cart_link']/span")
    private WebElement Cartupdate;
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement RemoveButton;
    @FindBy(xpath = "(//button[text()='Remove'])")
    private List<WebElement> RemoveButtonCount;
    @FindBy(xpath = "((//button[text()='Remove'])/parent::div)/preceding-sibling::div/a/div")
    private List<WebElement> SelectedItems;

    public WebElement GetMenu_icon() {
        return Menuicon;
    }

    public WebElement GetCartIcon() {
        return Carticon;
    }

    public WebElement GetFilterIcon() {
        return Filtericon;
    }

    public WebElement GetHeading() {
        return Heading;
    }

    public WebElement GetBagName() {
        return Bag_Name;
    }

    public WebElement GetVisibleOption(){
        return Visible_Option;
    }

    public WebElement GetDropdown(){
        return Dropdown;
    }

    public WebElement GetBagAddtocartButton(){
        return Bag_Addtocartbutton;
    }

    public WebElement GetTShirtAddtocartButton(){
        return TShirt_Addtocartbutton;
    }

    public WebElement GetBikeLightAddtocartButton(){
        return BikeLight_Addtocartbutton;
    }

    public WebElement GetRedTShirtAddtocartButton(){
        return RedTShirt_Addtocartbutton;
    }

    public WebElement GetBlackTShirtAddtocartButton(){
        return BlackTShirt_Addtocartbutton;
    }

    public WebElement GetBabyTShirtAddtocartButton(){
        return BabyTShirt_Addtocartbutton;
    }

    public WebElement GetCartUpdate() {
        return Cartupdate;
    }

    public WebElement GetRemoveButton() {
        return RemoveButton;
    }

    public List<WebElement> GetRemoveButtonCount() {
        return RemoveButtonCount;
    }

    public List<WebElement> GetSelectedItems() {
        return SelectedItems;
    }

    public void Addtocart(){
        GetTShirtAddtocartButton().click();
        GetRedTShirtAddtocartButton().click();
        GetCartUpdate().click();
    }
}
