package org.Validations.PageObjects;

import org.Validations.Utilities.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Checkout_Page_Objects extends Browser {
    public Checkout_Page_Objects(){
        PageFactory.initElements(Driver,this);
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement CheckoutHeading;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement CartCount;
    @FindBy(xpath = "//div[@class='cart_item_label']/a/div")
    private List<WebElement> ProductName;
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private List<WebElement> ProductPrice;
    @FindBy(xpath = "//div[@data-test='payment-info-label']")
    private WebElement PaymentInfoTittle;
    @FindBy(xpath = "//div[@data-test='payment-info-value']")
    private WebElement PaymentID;
    @FindBy(xpath = "//div[@data-test='shipping-info-label']")
    private WebElement ShippingInfoTittle;
    @FindBy(xpath = "//div[@data-test='shipping-info-value']")
    private WebElement ShippingPartner;
    @FindBy(xpath = "//div[@data-test='total-info-label']")
    private WebElement AmountHeading;
    @FindBy(xpath = "//div[@data-test='subtotal-label']")
    private WebElement ItemAmount;
    @FindBy(xpath = "//div[@data-test='tax-label']")
    private WebElement TaxAmount;
    @FindBy(xpath = "//div[@data-test='total-label']")
    private WebElement TotalAmount;
    @FindBy(id = "finish")
    private WebElement FinishButton;
    @FindBy(id = "cancel")
    private WebElement CancelButton;

    public WebElement GetCartPageHeading(){
        return CheckoutHeading;
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
    public WebElement GetPaymentInfoTittle(){
        return PaymentInfoTittle;
    }
    public WebElement GetPaymentID(){
        return PaymentID;
    }
    public WebElement GetShippingInfo(){
        return ShippingInfoTittle;
    }
    public WebElement GetShippingPartner(){
        return ShippingPartner;
    }
    public WebElement GetAmountHeading(){
        return AmountHeading;
    }
    public WebElement GetItemAmount(){
        return ItemAmount;
    }
    public WebElement GetTaxAmount(){
        return TaxAmount;
    }
    public WebElement GetTotalAmount(){
        return TotalAmount;
    }
    public WebElement GetFinishButton(){
        return FinishButton;
    }
    public WebElement GetCancelButton(){
        return CancelButton;
    }
}
