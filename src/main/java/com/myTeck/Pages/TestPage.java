package com.myTeck.Pages;

import com.myTeck.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestPage extends Base {
    public TestPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
    WebElement Button;
    @FindBy(id = "rw-menutop")
    WebElement list;

    public void testperform() {
        Select sel=new Select(list);
        sel.selectByVisibleText("Service Entreprise");



    }

}
