package ResultVerifications;

import CommonPages.Utils;
import org.testng.Assert;

public class VerifyUserLoginPage extends Utils {

    public void LoginPageTitle(){
        String Title = driver.getTitle();
        Assert.assertEquals(Title,"nopCommerce demo store. Login1","Login Page title not matched");
    }
}