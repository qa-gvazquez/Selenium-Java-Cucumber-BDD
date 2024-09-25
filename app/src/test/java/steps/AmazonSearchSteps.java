package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {

    AmazonSearchPage amazon = new AmazonSearchPage();

    @Given("^the user navigates to www.amazon.com$")
    public void navigateToAmazon() {
        amazon.navigateToAmazon();
    }

    // Expresion regular que busca cualquier String que le mandemos.
    // Como estamos usando símbolos de inicio ^ y fin $ de paso, no podemos usar {word}.
    @And("^searches for (.*)$")
    public void enterSearchCriteria(String criteria) {
        amazon.enterSearchCriteria(criteria);
        amazon.clickSearch();
    }

    // Expresion regular que busca uno o más de cualquier cosa.
    // Dado que goToPageX usa goToLinkText, se hace necesario recibir un STRING
    @And("^navigates to page (.+)$")
    public void navigateToSecondPage(String digit) {
        amazon.goToPageX(digit);
    }

    //Expresión regular que busca cualquier dígito.
    @And("selects the third item")
    public void selectsThirdItem() {
        amazon.pickNthItem();
    }

    @Then("^the user is able to add it to the cart$")
    public void itemCanBeAddedToTheCart() {
        amazon.addToCart();
        Assert.assertEquals("Agregado al carrito", amazon.addedToCartMessage());
    }

}
