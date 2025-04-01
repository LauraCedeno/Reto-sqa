package pages;
import org.openqa.selenium.By;

public class PrincipalPages extends BasePages{
    
    private By searchBox = By.id("search-words");
    private By buttonSearch = By.xpath("//*[@id=\"_full_container_header_23_\"]/div[2]/div/div[1]/div/input[2]");
    private By clickPublicity = By.xpath("//span[@class='ic_ag'][normalize-space()='Precio']");
    private By publicity = By.xpath("//div[@class='esm--upload-close--1x0SREz']//img");
    private By country = By.xpath("//span[@class='ih_a1'][normalize-space()='Turquía']");
    private By selectFirstProduct = By.xpath("//a[contains(text(),'Tiras nasales Kits')]");
    private By addCar = By.xpath("//button[@class='comet-v2-btn comet-v2-btn-primary comet-v2-btn-large add-to-cart--addtocart--Qhoji3M comet-v2-btn-important']");

    public PrincipalPages(){
        super(driver);
    }

    public void navigateToAliExpress(){
        navigateTo("https://es.aliexpress.com/");
    }

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchBox).click();
        driver.findElement(buttonSearch).click();
        driver.findElement(clickPublicity).click();
        driver.findElement(publicity).click();
        driver.findElement(country).click();
        driver.findElement(selectFirstProduct).click();
        driver.findElement(addCar).click();
    }

    
    
}
