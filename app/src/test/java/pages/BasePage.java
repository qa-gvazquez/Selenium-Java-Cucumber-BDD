package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Clase base con todos los comandos para ejecutar las acciones individuales de
 * cada WebElement al momento de modelar las página del proyecto de
 * automatización.
 */
public class BasePage {
    /**
     * Definición WebDriver, usando Selenium 4.24 sin necesidad de un WebDriver.
     */
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    /**
     * Instancia del WebDriver, usando Selenium 4.24 sin necesidad de un WebDriver.
     */
    static {
        driver = new ChromeDriver();
    }

    /**
     * Constructor de la BasePage, para instanciar automáticamente el WebDriver
     * cuando se herede esta clase.
     */
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    /**
     * Primera función - Navegar a una URL
     * https://www.selenium.dev/documentation/webdriver/interactions/navigation/
     */
    public static void navigateTo(String url){
        driver.navigate().to(url);
    }

}
