package pages;
import pages.BasePages;

public class PrincipalPages extends BasePages{
    
    public PrincipalPages(){
        super(driver);
    }

    public void NavigateToAliExpress(){
        navigateTo("https://es.aliexpress.com/");
    }
}
