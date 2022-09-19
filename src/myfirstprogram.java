
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;


public class myfirstprogram {

    AppiumDriver driver;

    @BeforeTest
    public void initializer() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "Pixel 4a API 30");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/Calculator_v8.2 (453324893)_apkpure.com.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        System.out.println("Opening Appium Server");

    }

  //  @BeforeTest
  public void initializer2() throws MalformedURLException {
        {

            DesiredCapabilities capabilities1 = new DesiredCapabilities();
            capabilities1.setCapability("platformName", "Android");
            capabilities1.setCapability("platformVersion", "11");
            capabilities1.setCapability("deviceName", "Pixel 5 API 30");
            capabilities1.setCapability("app", System.getProperty("user.dir") + "/apps/Calculator_v8.2 (453324893)_apkpure.com.apk");
            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4724/wd/hub"), capabilities1);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Opening Appium Server");

        }

    }
    @Test (priority = 1)
    public <val> void PlusTwonumbers() {


        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"4\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]")).click();
        val result = (val) driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
        assertEquals("7", result);
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"clear\"]")).click();
    }


    @Test (priority = 2)
    public <val1>void MinusTwonumbers() {

        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"4\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"minus\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]")).click();
        val1 result = (val1) driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
        assertEquals("1", result);
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"clear\"]")).click();

    }


    @Test (priority = 3)
    public <val3> void MultiplyTwonumbers() {

        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"4\"]")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]")).click();
        val3 result = (val3) driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
        assertEquals("12", result);

    }

}

