package pages;

import base.AppDriver;
import base.AppFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import testcases.Signintest;

import java.time.Duration;

import static base.AppFactory.driver;

public class Signinpage {

    public Signinpage() {

       try {
            PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
            //PageFactory.initElements(driver,Signinpage.class);
        } catch (Exception e) {

           e.printStackTrace();
        }
    }

    @FindBy(id = "com.carfirst.dealer:id/email") WebElement Username;

    @FindBy(id = "com.carfirst.dealer:id/password") WebElement Password;

    @FindBy(id = "com.carfirst.dealer:id/login") WebElement Login_Button;

    By by_pageHeader = By.id("com.carfirst.dealer:id/login_welcome_to_message");

    public void EnterValidEmailAddress() {
         new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_pageHeader));
          Username.sendKeys("QA");
    }

    public void Enterpassword() {
       // new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_pageHeader));
        Password.sendKeys("Test@123");

    }

    public void click_on_login_button() {

        Login_Button.click();

    }

}






