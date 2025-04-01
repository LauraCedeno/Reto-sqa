package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PrincipalPages;

public class AliEspressTest {

    PrincipalPages landingPage = new PrincipalPages();

    @Given("I navigate to the AliExpress")
    public void NavigateToAliExpress() {
        landingPage.navigateToAliExpress();
    } 

    @When("I search for {string} then select a product and add the product to the cart")
    public void searchForProduct(String product) {
        landingPage.searchProduct(product);
    }


    
}