package CommonPages;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage{
    //Method for clickOnElements
    public  static  void clickOnElement(By by){
        driver.findElement(by).click();
    }
    //Method for enter text
    public static void enterText(By by, String text){ driver.findElement(by).sendKeys(text);
    }
    //Method for time stamp
    public static String dateStamp(){
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy.HH.MM.SS");
        return format.format(new Date());

    }

}
