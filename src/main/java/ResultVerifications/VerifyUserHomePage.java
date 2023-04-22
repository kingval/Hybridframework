package ResultVerifications;

import CommonPages.Utils;
import org.testng.Assert;

    public class VerifyUserHomePage extends Utils {
        public void HomePageTitle(){
            String Title = driver.getTitle();
            Assert.assertEquals(Title,"nopCommerce demo store","Login Page title not matched");
        }
    }