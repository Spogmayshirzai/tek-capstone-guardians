package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	POMFactory pomFactory = new POMFactory();
	
	
	
	@Given("User is on retail website")
    public void userIsOnRetailWebsite() {
        Assert.assertTrue(pomFactory.homepage().tekschoolLogo.isDisplayed());
        logger.info("TekSchool logo is displayed");
   
    }
    @When("User click on Sign in option")
    public void userClickOnSignInOption()  {
        click(pomFactory.retailSigninPage().signInLink);
        logger.info("User clicked on signin butten");
       }
    @When("User enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String email, String password) {
        sendText(pomFactory.retailSigninPage().emailField,email);
        sendText(pomFactory.retailSigninPage().passwordField,password);
        logger.info("User entered email and password");
        
        }
    @And("User click on login button")
    public void userClickOnLoginButton()  {
        click(pomFactory.retailSigninPage().loginBtn);
        logger.info("User clicked on login button");
       
    }
    @Then("User should be logged in into Account")
    public void userShouldBeLoggedInIntoAccount() {
        Assert.assertTrue(pomFactory.homepage().accountInput.isDisplayed());
        logger.info("User is in account page");
        }
    
    @When("User click on Create New Account button")
    public void userClickOnCreateNewAccountButton() {
        click(pomFactory.retailSigninPage().newAccountBtn);
        logger.info("New account buttun is clicked");
        }

    @When("User fill the signUp information with below data")
    public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
        List<Map<String, String>>accountinfo = dataTable.asMaps(String.class,String.class);
        sendText(pomFactory.retailSigninPage().nameInput,accountinfo.get(0).get("name"));
        sendText(pomFactory.retailSigninPage().emailInput,accountinfo.get(0).get("email"));
        sendText(pomFactory.retailSigninPage().passwordInput,accountinfo.get(0).get("password"));
        sendText(pomFactory.retailSigninPage().confirmPasswordInput,accountinfo.get(0).get("confirmPassword"));
        logger.info("User filled the signUp information");
        
         }
    @When("User click on SignUp button")
    public void userClickOnSignUpButton() {
        click(pomFactory.retailSigninPage().signupBtn);
        logger.info("Uer clicked on signup buttu");
 }
    
    @Then("User should be logged into account page")
    public void userShouldBeLoggedIntoAccountPage() {
        Assert.assertTrue(pomFactory.retailSigninPage().accountLink.isDisplayed());
        logger.info("User is into account page");
    }
}
