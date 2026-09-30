package org.Validations.Validations;

import org.Validations.PageObjects.Checkout_Page_Objects;
import org.Validations.Utilities.Browser;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Checkout_Page_Validations extends Browser {
    @Test
    public void HeadingValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Heading = Checkout.GetCartPageHeading().getText();
        System.out.println(Heading);
    }
    @Test
    public void CartCountValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Heading = Checkout.GetCartCount().getText();
        System.out.println(Heading);
    }
    @Test
    public void ProductNameValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
         List<WebElement> Names = Checkout.GetProductName();
         for(WebElement Name : Names) {
             System.out.println(Name.getText());
         }
    }
    @Test
    public void ProductPriceValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        List<WebElement> Prices = Checkout.GetProductPrice();
        for(WebElement Price : Prices) {
            System.out.println(Price.getText());
        }
    }
    @Test
    public void PaymentInfoTittleValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Payment_Tittle = Checkout.GetPaymentInfoTittle().getText();
        System.out.println(Payment_Tittle);
    }
    @Test
    public void PaymentIDValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Payment_ID = Checkout.GetPaymentID().getText();
        System.out.println(Payment_ID);
    }
    @Test
    public void ShippingInfoValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Shipping_Info = Checkout.GetShippingInfo().getText();
        System.out.println(Shipping_Info);
    }
    @Test
    public void ShippingPartnerValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Shipping_Partner = Checkout.GetShippingPartner().getText();
        System.out.println(Shipping_Partner);
    }
    @Test
    public void AmountHeadingValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Amount_Heading = Checkout.GetAmountHeading().getText();
        System.out.println(Amount_Heading);
    }
    @Test
    public void ItemAmountValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Item_Amount = Checkout.GetItemAmount().getText();
        System.out.println(Item_Amount);
    }
    @Test
    public void TaxAmountValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Tax_Amount = Checkout.GetTaxAmount().getText();
        System.out.println(Tax_Amount);
    }
    @Test
    public void TotalAmountValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String Total_Amount = Checkout.GetTotalAmount().getText();
        System.out.println(Total_Amount);
    }
    @Test
    public void FinishButtonNameandColorValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String FinishButtonName = Checkout.GetFinishButton().getText();
        System.out.println(FinishButtonName);
        String FinishButtonColor = Checkout.GetFinishButton().getCssValue("background-color");
        System.out.println(FinishButtonColor);
    }
    @Test
    public void cancelButtonNameandColorValidation(){
        Checkout_Page_Objects Checkout = new Checkout_Page_Objects(Driver);
        String CancelButtonName = Checkout.GetCancelButton().getText();
        System.out.println(CancelButtonName);
        String CancelButtonColor = Checkout.GetCancelButton().getCssValue("background-color");
        System.out.println(CancelButtonColor);
    }
}
