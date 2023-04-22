package StepDefinitions;

import ResultVerifications.RegistrationComplete;
import ResultVerifications.RegistrationVerification;
import WebElements.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Register {

    RegistrationVerification registrationVerification = new RegistrationVerification();
    RegistrationComplete registrationComplete = new RegistrationComplete();

    RegisterPage registerPage = new RegisterPage();

    @Given("^User is on register page and verify the Register page Title$")
    public void user_is_on_register_page_and_verify_the_Register_page_Title() {
    registrationVerification.RegisterPageTitle();
    }

    @Then("^User Enter Their Details and Clicks Register Button$")
    public void User_Enter_Their_Details_and_Clicks_Register_Button()   {registerPage.doRegister();
    }

    @Then("^User is on Complete Registration page$")
    public void user_is_on_Complete_Registration_page()   {
        registrationComplete.RegisterCompleteTitle();

    }


}


