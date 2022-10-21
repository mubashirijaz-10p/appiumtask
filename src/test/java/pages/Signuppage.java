package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Signuppage {


    public <val> void create_account(AppiumDriver driver) throws InterruptedException {

        try {
            Thread.sleep(15000);
            // driver.findElement(By.id("com.pakwheels:id/urdu")).click();
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();

            Thread.sleep(5000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("com.carfirst.dealer:id/onboarding_finish_button")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("com.carfirst.dealer:id/signup_for_account")).click();
            Thread.sleep(10000);
            try {

                //  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.EditText")).click();
                Thread.sleep(20000);
                System.out.println(driver.getPageSource());
                driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up now!\"]/android.widget.Button")).click();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {

            e.getStackTrace();
        }

    }


}
