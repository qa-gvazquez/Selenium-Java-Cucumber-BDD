package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    public static Object closeBrowser;
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
    public static void navigateTo(String url) {
        driver.navigate().to(url);
    }

    /**
     * Segunda función - Uso del CleanCode: localizador genérico que incluye un
     * ExpectedCondition que será intanciado múltiples ocasiones.
     * Crea un objeto tipo WebElement llamado 'Find' que devuelve
     * Esperando hasta que la condición 'el elemento está presente' ubicado
     * con XPath, con un método espera 'wait' pre definida de 5 segundos.
     * 
     * Esto permite manejar las esperas una única vez.
     * 
     * Es tipo PRIVADO por que sólo se va a utilizar dentro de ESTA clase Base ya
     * que será el soporte para todas las interacciones con elementos Web, que
     * estaremos
     * definiendo en esta misma clase.
     * 
     * @param locator Es el localizador tipo Xpath, que definirá el WebElement.
     */
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    /**
     * Tercera función - Acción de dar Click en un elemento.
     * Obsérvese que intancía la segunda función 'Find' y le envía el
     * parámetro 'locator', para así utilizar la espera pre-definida.
     * 
     * Usaremos este método para dar Click en botones, en lugar del comando de
     * Selenium.
     * 
     * @param locator
     */
    public void clickElement(String locator) {
        Find(locator).click();
    }

    /**
     * Método para cerrar el Browser
     */
    public static void closeBrowser() {
        driver.quit();
    }

    /**
     * Método para maximizar la ventana
     * https://www.selenium.dev/documentation/webdriver/interactions/windows/
     */

    public static void maxBrowser() {
        driver.manage().window().maximize();
    }

}
