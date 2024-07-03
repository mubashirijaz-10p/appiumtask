package Appium_Demo_SaveStrike;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main_Parent extends myfirstprogram {


    public <val> void Create_goal(AppiumDriver driver) throws InterruptedException {
        try {

            Thread.sleep(5000);
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Goal erstellen\"]/android.widget.ImageView")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText")).sendKeys("Testing Goal");
            Thread.sleep(2000);

            //  JavascriptExecutor jse = (JavascriptExecutor)driver;
            //   jse.executeScript("scroll(0, -250)");
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Weiter\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[9]/android.view.View/android.view.View/android.widget.EditText[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[9]/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys("Testing123");
            Thread.sleep(2000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[9]/android.view.View/android.view.View/android.widget.EditText[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[9]/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys("https://images.unsplash.com/photo-1492144534655-ae79c964c9d7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1583&q=80");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Weiter\"]")).click();
           // Thread.sleep(5000);
//        System.out.println("---------------------------------------------------");
//        System.out.println(driver.getPageSource());
//       System.out.println("---------------------------------------------------");

             Thread.sleep(5000);

            driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Überspringen\"]")).click();
           // driver.findElement(By.xpath("//android.view.View[@content-desc=\"Weiter\"]")).click();
            Thread.sleep(5000);
           // driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Finales Datum\"]")).sendKeys("12.10.2022");
            driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Überspringen\"]")).click();
            //android.widget.ImageView[@content-desc="Finales Datum"]
            Thread.sleep(5000);
            driver.findElement(By.xpath("//android.view.View[@content-desc=\"Weiter\"]")).click();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
