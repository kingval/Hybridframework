package StepDefinitions;


import ResultVerifications.VerifyUserHomePage;
import ResultVerifications.VerifyUserLoginPage;
import WebElements.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginUser {
    VerifyUserLoginPage verifyUserLoginPage = new VerifyUserLoginPage();
    LoginPage loginPage =new LoginPage();
    VerifyUserHomePage verifyUserHomePage = new VerifyUserHomePage();

    @Given("^User is on login page and verify the Login page Title$")
    public void user_is_on_login_page_and_verify_the_Login_page_Title()  {
        verifyUserLoginPage.LoginPageTitle();

    }

    @Then("^User Enter Username and Password and click on Login$")
    public void user_Enter_Username_and_Password_and_click_on_Login()  {
        loginPage.doLogin();

    }

    @Then("^User is on Homepage of User$")
    public void user_is_on_Homepage_of_User()  { verifyUserHomePage.HomePageTitle(); }


}