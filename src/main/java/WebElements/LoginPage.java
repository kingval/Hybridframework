package WebElements;

import CommonPages.LoadProperty;
import CommonPages.Utils;
import org.openqa.selenium.By;

import javax.rmi.CORBA.Util;

public class LoginPage extends Utils {
    LoadProperty loadProperty =new LoadProperty();
    private By _emailId = By.id("Email");
    private By _password =By.id("Password");
    private By _loginButton =By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

    public void doLogin(){
        enterText(_emailId,loadProperty.getProperty("username"));
        enterText(_password,loadProperty.getProperty("password"));
        clickOnElement(_loginButton);
    }

}