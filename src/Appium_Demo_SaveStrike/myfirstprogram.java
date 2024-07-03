package Appium_Demo_SaveStrike;

import ConfigFileReader.ConfigReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;


public class myfirstprogram {

    ConfigReader configReader;
    public myfirstprogram() {

        configReader = new ConfigReader();
    }

    AppiumDriver driver;

  //  @BeforeTest
//  public void initializer() throws MalformedURLException {
//
//      DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "11");
//        capabilities.setCapability("deviceName", "Pixel 5 API 30");
//     //   capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/Calculator_v8.2 (453324893)_apkpure.com.apk");
//        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/Booking.com_ Hotels and more_33.6.0.1_Apkpure.apk");
//       driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//        System.out.println("Opening Appium Server");
//
//    }

    @BeforeTest
    public void initializer2() throws MalformedURLException {
        {
            DesiredCapabilities capabilities1 = new DesiredCapabilities();
            capabilities1.setCapability("platformName",configReader.getPlateformName());
            capabilities1.setCapability("platformVersion",configReader.getPlateVersion());
            capabilities1.setCapability("deviceName", configReader.getDeviceName());
//          capabilities1.setCapability("app", System.getProperty("user.dir") + "/apps/Calculator_v8.2 (453324893)_apkpure.com.apk");
            capabilities1.setCapability("app", System.getProperty("user.dir") + "/apps/savestrike-build-3.10-23sept.apk");
            capabilities1.setCapability("unicodeKeyboard", true);
            capabilities1.setCapability("resetKeyboard", true);
           try {
               driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities1);
           }

           catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Opening Appium Server");

       }

    }



   @Test(priority = 1)
    public <val> void Create_goal1() throws InterruptedException {

        Main_Parent Obj = new Main_Parent();
        Obj.Create_goal(driver);


    }

    @After
    public void teardown() {
        // closes all the browser windows opened by web driver
        driver.quit();
    }
}











//    @Test (priority = 1)
//    public <val> void PlusTwonumbers() {
//
//
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"4\"]")).click();
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]")).click();
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]")).click();
//        val result = (val) driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
//        assertEquals("7", result);
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"clear\"]")).click();
//    }
//
//
//
//    @Test (priority = 2)
//    public <val1>void MinusTwonumbers() {
//
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"4\"]")).click();
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"minus\"]")).click();
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]")).click();
//        val1 result = (val1) driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
//        assertEquals("1", result);
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"clear\"]")).click();
//
//    }
//
//
//    @Test (priority = 3)
//    public <val3> void MultiplyTwonumbers() {
//
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"4\"]")).click();
//        driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
//        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]")).click();
//        val3 result = (val3) driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
//        assertEquals("12", result);
//
//    }
//
//}
//
//
