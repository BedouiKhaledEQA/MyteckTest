package com.myTeck.Pages;

import com.myTeck.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends Base {
    public TestPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Connexion")
    WebElement Button;


    public void testperform()  {
        Button.click();

    }

}
