package steps;

import io.cucumber.java.en.Given;
import pages.PrincipalPages;

public class AliEspressTest {

    PrincipalPages landingPage = new PrincipalPages();

    @Given("I navigate to the AliExpress")
    public void NavigateToAliExpress() {
        landingPage.navigateToAliExpress();
    } 

    
}