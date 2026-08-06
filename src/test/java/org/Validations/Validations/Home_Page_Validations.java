package org.Validations.Validations;

import org.Validations.PageObjects.Home_Page_Objects;
import org.Validations.Utilities.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Home_Page_Validations extends Browser {

    @Test
    public void Heading_Validation(){
        Home_Page_Objects Home = new Home_Page_Objects();
        String Heading = Home.GetHeading().getText();
        System.out.println(Heading);
    }
    @Test
    public void Filter_Icon_Validation(){
        Home_Page_Objects Home = new Home_Page_Objects();
        Boolean Filter_Icon = Home.GetFilterIcon().isDisplayed();
        System.out.println(Filter_Icon);
    }
    @Test
    public void Cart_Icon_Validation(){
        Home_Page_Objects Home = new Home_Page_Objects();
        Boolean Cart_Icon =Home.GetCartIcon().isDisplayed();
        System.out.println(Cart_Icon);
    }
    @Test
    public void Menu_Icon_Validation(){
        Home_Page_Objects Home = new Home_Page_Objects();
        Boolean Menu_Icon =Home.GetMenu_icon().isDisplayed();
        System.out.println(Menu_Icon);
    }
    @Test
    public void Bag_Name_Validation(){
        Home_Page_Objects Home = new Home_Page_Objects();
        String Bag_Name = Home.GetBagName().getText();
        System.out.println(Bag_Name);
    }
    @Test
    public void Dropdown_Validation(){
        Home_Page_Objects Home = new Home_Page_Objects();
        System.out.println("Before Selection : "+Home.GetVisibleOption().getText());
        Select Option = new Select(Home.GetDropdown());
        Option.selectByVisibleText("Price (low to high)");
        System.out.println("After Selection : "+Home.GetVisibleOption().getText());
    }
    @Test
    public void Add_To_Cart_Text_Validation(){
        Home_Page_Objects Home = new Home_Page_Objects();
        String AddToCart_Button_Name = Home.GetBagAddtocartButton().getText();
        System.out.println(AddToCart_Button_Name);
    }
    @Test
    public void Add_To_Cart_Validation() {
        Home_Page_Objects Home = new Home_Page_Objects();
        try {
            //It will populate No Such Element because it will not have the Cardupdate value untill we add to cart
            String Cart_Icon = Home.GetCartUpdate().getText();
        } catch (Exception e) {
            System.out.println("Before Adding product to cart No of Items :" + e);
        }
        Home.GetBagAddtocartButton().click();
        Home.GetTShirtAddtocartButton().click();
        Home.GetBikeLightAddtocartButton().click();
        String Updated_Cart_Icon = Home.GetCartUpdate().getText();
        System.out.println("After Adding product to cart No of Items :" + Updated_Cart_Icon);
    }
        @Test
        public void Remove_Button_validation(){
            Add_To_Cart_Validation();
            Home_Page_Objects Home = new Home_Page_Objects();
            String Remove_Button_Text = Home.GetRemoveButton().getText();
            System.out.println(Remove_Button_Text);
            String Remove_Button_Colour = Home.GetRemoveButton().getCssValue("color");
            System.out.println(Remove_Button_Colour);
            List<WebElement> Count = Home.GetRemoveButtonCount();
            System.out.println("No of Remove button in the webpage is : "+Count.size());
            List<WebElement> Names = Home.GetSelectedItems();
            for (WebElement item : Names){
                System.out.println(item.getText());
            }

        }
    }
