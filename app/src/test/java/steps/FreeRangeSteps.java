package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnLinksNavigationBar(section);
    }

    @And("select Introducción al Testing")
    public void navigateToIntro() throws InterruptedException {
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.introduccionTestingLink();
        Thread.sleep(1000); // Se agregó temporalmenta para VER que efectivamente abre la página correcta.
    }

}
