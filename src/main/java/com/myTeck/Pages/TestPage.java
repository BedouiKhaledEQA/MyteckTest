package com.myTeck.Pages;

import com.myTeck.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage extends Base {
    public TestPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
    WebElement Button;

    public void testperform() throws InterruptedException {
        Thread.sleep(7000);
        Button.click();

    }

}
