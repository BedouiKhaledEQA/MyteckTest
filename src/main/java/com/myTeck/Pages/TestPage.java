package com.myTeck.Pages;

import com.myTeck.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestPage extends Base {
    public TestPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Connexion")
    WebElement Button;

    public void testperform()  {
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.findElement(By.linkText("Connexion")).click();
        wait.until(d -> Button.isDisplayed());
        Button.click();

    }

}
