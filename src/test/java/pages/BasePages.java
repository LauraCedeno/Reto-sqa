package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class BasePages {

    protected static WebDriver driver;
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    static{
        WebDriverManager.chromedriver().setup();
        driver = new chromedriver();
    }

    public BasePages(WebDriver driver){
        BasePages.driver = driver;
    }

    public static void navigateTo(String url){
        driver.get(url);

    
    
    }
}

    
