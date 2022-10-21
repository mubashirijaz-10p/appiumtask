package testcases;

import base.AppFactory;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import pages.Signinpage;

import java.net.MalformedURLException;


public class Signintest extends AppFactory {

    public <val> void Addlogindata(AppiumDriver driver) throws InterruptedException {
        try {

            Thread.sleep(2000);
            AppFactory.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("QA");
            Thread.sleep(2000);
            AppFactory.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Test@123");
            Thread.sleep(2000);
            AppFactory.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button")).click();
            Thread.sleep(5000);
            String Variable = driver.getPageSource();
            boolean login_true = Variable.contains("Login Error");
            boolean expected_result = true;
            Assert.assertEquals(expected_result, login_true);
            Assert.assertFalse(login_true);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public <val> void Click_on_loginbutton_withput_email_and_password(AppiumDriver driver) throws InterruptedException {

        Thread.sleep(2000);
        AppFactory.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button")).click();
        Thread.sleep(2000);
        String Variable1 = driver.getPageSource();
        boolean login_true = Variable1.contains("Validation error Username is required");
        Assert.assertFalse(login_true);




    }




}


