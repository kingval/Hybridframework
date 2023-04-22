package ResultVerifications;

import CommonPages.Utils;
import org.testng.Assert;

public class RegistrationVerification extends Utils {
    public void RegisterPageTitle(){
        String Title = driver.getTitle();
        Assert.assertEquals(Title,"nopCommerce demo store. Register","Register completed Page Title not Matched");
    }

}
