package CommonPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector  extends BasePage{
    LoadProperty loadProperty =new LoadProperty();
    String browserName= loadProperty.getProperty("browser");
    String BaseURL = "https://demo.nopcommerce.com/register?returnUrl=%2F";

    public void OpenSelectedBrowser() {
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("Browser not Matched ");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get(BaseURL);
    }
}