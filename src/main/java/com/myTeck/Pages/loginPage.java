package com.myTeck.Pages;

import com.myTeck.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage extends Base {
    public loginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "/body.cms-home.cms-index-index.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(4) header.page-header:nth-child(1) div.panel.wrapper div.panel.header ul.header.links li.link.authorization-link:nth-child(2) > a:nth-child(1)")
    WebElement connexionButton;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/div[1]/button[1]/span[1]")
    WebElement loginButton;

    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")
    WebElement loginCheckAssertion;
    public void loginAuth(String mail,String pass) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body.cms-home.cms-index-index.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(4) header.page-header:nth-child(1) div.panel.wrapper div.panel.header ul.header.links li.link.authorization-link:nth-child(2) > a:nth-child(1)")));
        connexionButton.click();
        email.sendKeys(mail);
        password.sendKeys(pass);
        loginButton.click();
        Thread.sleep(5000);
    }

    public void loginAssertion() throws InterruptedException {
        Assert.assertTrue((loginCheckAssertion).isDisplayed());
        Thread.sleep(5000);
    }

}
