package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

public class FreeRangeSteps {

    SoftAssert soft = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnLinksNavigationBar(section);
    }

    /**
     * STEP del Scenario 3 - Users can select a plan when signing up.
     * Intancia el método 'clickOnElegirPlanButto' del
     * POM - PaginaPrincipal.
     */
    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }

    @And("select Introducción al Testing")
    public void navigateToIntro() {
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.introduccionTestingLink();
    }

    @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans() {
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 13 productos",
                "Academia: $176 / año • 13 productos", "Free: Gratis • 3 productos");

        Assert.assertEquals(listaEsperada, lista);
    }
/* 
    public void EjemploAssertions() {
        // assertEquals - Verifica que dos valores sean iguales.

        String actualTitle = "FreeRangeToaster";
        String expectedTitle = "FreeRangeTester";
        String incorrectTitle = "algo";
        Boolean isElementPresent = true;

        Assert.assertEquals(actualTitle, expectedTitle, "El título de la página no es el esperado.");

        // assertNotEquals - Verifica que dos valores no sean iguales.

        Assert.assertNotEquals(actualTitle, incorrectTitle, "El título de la página no debería ser este.");

        // assertTrue - Verifica que una condición sea verdadera.

        Assert.assertTrue(isElementPresent, "El elemento debería estar presente.");

        // assertFalse - Verifica que una condición sea falsa.

        Assert.assertFalse(isElementPresent, "El elemento no debería estar presente.");

        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";

        // Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
        // muchas cosas pequeñas a la vez.
        soft.assertEquals(palabraEsperada, palabraEncontrada, "El título de la página no es el esperado.");
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada), "El elemento debería estar presente");
        soft.assertNotEquals(palabraEncontrada, palabraEsperada, "El título de la página no debería ser este.");

        soft.assertAll();
    }
*/
}
