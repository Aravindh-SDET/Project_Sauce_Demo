package org.Validations.Validations;

import org.Validations.PageObjects.Cart_Page_Objects;
import org.Validations.PageObjects.Login_Page_Objects;
import org.Validations.Utilities.Browser;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Cart_Page_Validations extends Browser {

    @Test
    public void PageHeadingValidation(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        String Heading = Cart.GetPageHeading().getText();
        System.out.println(Heading);
    }
    @Test
    public void CartCountValidations(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        String Cart_Count = Cart.GetCartCount().getText();
        System.out.println(Cart_Count);
    }
    @Test
    public void ProductNameValidations(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        List<WebElement> Product_Name = Cart.GetProductName();
        for (WebElement Name : Product_Name)
        {
            System.out.println(Name.getText());
        }
    }
    @Test
    public void ProductPriceValidations(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        List<WebElement> Product_price = Cart.GetProductPrice();
        for (WebElement price : Product_price)
        {
            System.out.println(price.getText());
        }
    }
    @Test
    public void RemoveButtonTextvalidation(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        String RemoveButton_Text = Cart.GetRemoveButton().getText();
        System.out.println(RemoveButton_Text);

    }
    @Test
    public void RemoveButtonColourvalidation(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        String RemoveButton_Colour = Cart.GetRemoveButton().getCssValue("color");
        System.out.println(RemoveButton_Colour);
    }
    @Test
    public void CheckoutButtonTextvalidation(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        String CheckoutButton_Text = Cart.GetCheckoutButton().getText();
        System.out.println(CheckoutButton_Text);
    }
    @Test
    public void CheckoutButtonColourvalidation(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        String CheckoutButton_Colour = Cart.GetCheckoutButton().getCssValue("background-color");
        System.out.println(CheckoutButton_Colour);
    }
    @Test
    public void ContinueShoppingButtonTextvalidation(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        String ContinueShoppingButton_Text = Cart.GetContinueShoppingButton().getText();
        System.out.println(ContinueShoppingButton_Text);
    }
    @Test
    public void ContinueShoppingButtonColourvalidation(){
        Cart_Page_Objects Cart = new Cart_Page_Objects();
        String ContinueShoppingButton_Colour = Cart.GetContinueShoppingButton().getCssValue("background-color");
        System.out.println(ContinueShoppingButton_Colour);
    }
}
