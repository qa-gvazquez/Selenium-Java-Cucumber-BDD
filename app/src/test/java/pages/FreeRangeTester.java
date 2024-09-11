package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeRangeTester {

    private WebDriver driver;

    @BeforeMethod
    public  void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void navegaAFreeRangeTester() throws InterruptedException {
        driver.get("https://www.freerangetesters.com/");
        Thread.sleep(1000);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
