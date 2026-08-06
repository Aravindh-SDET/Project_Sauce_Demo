package org.Validations.Validations;

import org.Validations.PageObjects.Checkout_Info_Objects;
import org.Validations.Utilities.Browser;
import org.testng.annotations.Test;

public class Checkout_Info_Page_Validations extends Browser {

    @Test
    public void CheckoutPageTittleValidations(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        String Tittle = Info.GetCheckoutPageTittle().getText();
        System.out.println(Tittle);
    }
    @Test
    public void CartIconUpdate_Validations(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        String Cart_Items = Info.GetCartIconUpdate().getText();
        System.out.println(Cart_Items);
    }
    @Test
    public void FirstNameFieldValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        String FirstName = Info.GetFirstName().getAttribute("placeholder");
        System.out.println(FirstName);
    }
    @Test
    public void LastNameFieldValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        String LastName = Info.GetLastName().getAttribute("placeholder");
        System.out.println(LastName);
    }
    @Test
    public void ZipcodeFieldValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        String LastName = Info.GetZipcode().getAttribute("placeholder");
        System.out.println(LastName);
    }
    @Test
    public void FirstNameErrorFieldandcolorValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        Info.GetLastName().sendKeys("Kingston");
        Info.GetZipcode().sendKeys("456789");
        Info.GetContinueButton().click();
        String Firstname_Error = Info.GetErrorMsg().getText();
        System.out.println(Firstname_Error);
        String Firstname_ErrorColor =Info.GetErrorMsgColor().getCssValue("background-color");
        System.out.println(Firstname_ErrorColor);
    }
    @Test
    public void LastNameErrorFieldandcolorValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        Info.GetFirstName().sendKeys("David");
        Info.GetZipcode().sendKeys("456789");
        Info.GetContinueButton().click();
        String Lastname_Error = Info.GetErrorMsg().getText();
        System.out.println(Lastname_Error);
        String Lastname_ErrorColor =Info.GetErrorMsgColor().getCssValue("background-color");
        System.out.println(Lastname_ErrorColor);
    }
    @Test
    public void ZipcodeErrorFieldandcolorValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        Info.GetFirstName().sendKeys("David");
        Info.GetLastName().sendKeys("Kingston");
        Info.GetContinueButton().click();
        String Zipcode_Error = Info.GetErrorMsg().getText();
        System.out.println(Zipcode_Error);
        String Zipcode_ErrorColor =Info.GetErrorMsgColor().getCssValue("background-color");
        System.out.println(Zipcode_ErrorColor);
    }
    @Test
    public void ContinueButtonTextValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        System.out.println(Info.GetContinueButton().getText());
    }
    @Test
    public void ContinueButtonColorValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        System.out.println(Info.GetContinueButton().getCssValue("background-color"));
    }
    @Test
    public void CancelButtonTextValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        System.out.println(Info.GetCancelButton().getText());
    }
    @Test
    public void CancelButtonColorValidation(){
        Checkout_Info_Objects Info = new Checkout_Info_Objects();
        System.out.println(Info.GetCancelButton().getCssValue("background-color"));
    }

}
