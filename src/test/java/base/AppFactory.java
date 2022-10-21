package base;

import ConfigFileReader.ConfigReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Signinpage;
import pages.Signuppage;
import testcases.Signintest;
import testcases.Signuptest;

import java.net.MalformedURLException;
import java.net.URL;

public class AppFactory {

    private Signinpage signinpage;
    public static AppiumDriver driver;
    public static DesiredCapabilities capabilities1;
    public static ConfigReader configReader;

    //ConfigReader configReader;


    public static void intializer() throws MalformedURLException {
        {

            capabilities1 = new DesiredCapabilities();
            configReader = new ConfigReader();
            DesiredCapabilities capabilities1 = new DesiredCapabilities();
            capabilities1.setCapability("platformName", configReader.getPlateformName());
            capabilities1.setCapability("platformVersion", configReader.getPlateVersion());
            capabilities1.setCapability("deviceName", configReader.getDeviceName());
            capabilities1.setCapability("app", System.getProperty("user.dir") + "/apps/CarFirst_v5.25.0_apkpure.com.apk");
            capabilities1.setCapability("unicodeKeyboard", true);
            capabilities1.setCapability("resetKeyboard", true);
            try {
                driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities1);
                AppDriver.setDriver(driver);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Opening Appium Server");

        }

    }


    @Test(priority = 1)
    public <val> void signup() throws InterruptedException, MalformedURLException {
        AppFactory.intializer();

        Signuppage Obj = new Signuppage();
        Obj.create_account(driver);


        Signuptest signuptest_obj = new Signuptest();
        signuptest_obj.insert_data(driver);

    }


    @Test(priority = 3)
    public void Login() throws InterruptedException {

        Signintest signintest = new Signintest();
        signintest.Addlogindata(driver);

     /*   try {
            Signinpage obj2 = new Signinpage();
            Thread.sleep(5000);
            signinpage.EnterValidEmailAddress();
            Thread.sleep(5000);
            signinpage.Enterpassword();
            signinpage.click_on_login_button();
        } catch (Exception e) {
            e.getCause();
            e.printStackTrace();
        }
    */

    }

    @Test(priority = 2)
    public void LoginwithoutEmailandPassword() throws InterruptedException {

        Signintest signintest = new Signintest();
        signintest.Click_on_loginbutton_withput_email_and_password(driver);
    }

    @AfterTest
    public static void quitDriver() {

        if (null != driver) {

            driver.quit();

        }
    }
}



