package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to every section using the navigation bar")
    public void navigationBarUse(){
        landingPage.clickOnLinksNavigationBar();
    }
}
