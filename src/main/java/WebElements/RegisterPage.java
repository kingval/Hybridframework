package WebElements;

import CommonPages.LoadProperty;
import CommonPages.Utils;
import CommonPages.*;
import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    LoadProperty loadProperty =new LoadProperty();

    private By _GenderMF = By.id("gender-male");
    private By _firstName = By.id("FirstName");
    private By _lastName =By.id("LastName");
    private By _DOBDAY = By.className("valid");
    private By _DOBMONTH = By.className("valid");
    private By _DOBYEAR = By.className("valid");
    private By _Email = By.id("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");


    private By _registerButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[5]/button");

    public void doRegister(){
        clickOnElement(_GenderMF);
        enterText(_firstName,loadProperty.getProperty("FirstName"));
        enterText(_lastName,loadProperty.getProperty("LastName"));
        enterText(_DOBDAY,loadProperty.getProperty("DateOfBirthDay"));
        enterText(_DOBMONTH,loadProperty.getProperty("DateOfBirthMonth"));
        enterText(_DOBYEAR,loadProperty.getProperty("DateOfBirthYear"));
        enterText(_Email,loadProperty.getProperty("Email"));
        enterText(_Password,loadProperty.getProperty("Password"));
        enterText(_ConfirmPassword,loadProperty.getProperty("ConfirmPassword"));

        clickOnElement(_registerButton);
    }
}
