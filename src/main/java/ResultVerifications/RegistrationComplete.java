package ResultVerifications;

import CommonPages.Utils;
import org.testng.Assert;

public class RegistrationComplete extends Utils {
    public void RegisterCompleteTitle(){
        String Title = driver.getTitle();
        Assert.assertEquals(Title,"nopCommerce demo store. Register","Register completed Page Title not Matched");
    }

}
