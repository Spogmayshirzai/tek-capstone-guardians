package tek.capstone.framework.steps;



import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;
import tek.capstone.framework.utilities.DataGenerator;


public class RetailAccountSteps extends CommonUtility {
	
//	private static final Object nameOnCard = null;
	POMFactory pomFactory = new POMFactory ();
	//private String expectedMssg;	
	

@When("User update Name {string} and Phone {string}")
public void userUpdateNameAndPhone(String name, String phoneNumber) {
    clearTextUsingSendKeys(pomFactory.retailAccountPage().nameField);
    sendText(pomFactory.retailAccountPage().nameField,name);
     logger.info("Name was entered successfully");
     clearTextUsingSendKeys(pomFactory.retailAccountPage().phoneInput);
     sendText(pomFactory.retailAccountPage().phoneInput, phoneNumber);
     logger.info("Phone number was entered successfully");
}

@When("User click on Update button")
public void userClickOnUpdateButton() {
    click(pomFactory.retailAccountPage().updateBttn);
    logger.info("Update butten was clicked");
}
@Then("user profile information should be updated {string}")
public void userProfileInformationShouldBeUpdated(String actualMssg) {
    waitTillPresence(pomFactory.retailAccountPage().updateMssg);
    String expectedMssg = "Personal Information Updated Successfully";
  //  String actualMssg = pomFactory.retailAccountPage().updateMssg.getText();
    Assert.assertEquals(expectedMssg, actualMssg);
    logger.info("Account information was updated successfully");            
}
@When("User click on Add a payment method link")
public void userClickOnAddAPaymentMethodLink() {
    click (pomFactory.retailAccountPage().addPaymentMethodLink);
    logger.info("Add Payment Method link was clicked successfully");
}
@When("User fill Debit or credit card information")
public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
    List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
    sendText(pomFactory.retailAccountPage().cardNumberFiled, paymentInfo.get(0).get("cardNumber"));
    sendText(pomFactory.retailAccountPage().nameOnCardFiled, paymentInfo.get(0).get("nameOnCard"));
    selectByVisibleText(pomFactory.retailAccountPage().expirationMonthFiled, paymentInfo.get(0).get("expirationMonth"));
    selectByVisibleText(pomFactory.retailAccountPage().expiratoinYearFiled, paymentInfo.get(0).get("expirationYear"));
    sendText(pomFactory.retailAccountPage().securityCodeInput, paymentInfo.get(0).get("securityCode"));
    logger.info("Payment Information was added successrully");
}
@When("User click on Add your card button")
public void userClickOnAddYourCardButton() {
    click(pomFactory.retailAccountPage().payementSubmitBttn);
    logger.info("Payment Method submit bttn clicked successfully");
}
@Then("a message should be displayed {string}")
public void aMessageShouldBeDisplayed(String expectedMssg) {
    
//    if(expectedMssg.contains("Payment Method added")) {
        waitTillPresence(pomFactory.retailAccountPage().paymentMethodSuccessMssge);
        Assert.assertTrue(pomFactory.retailAccountPage().paymentMethodSuccessMssge.isDisplayed());
        expectedMssg = pomFactory.retailAccountPage().paymentMethodSuccessMssge.getText();
       logger.info("Expected Message: " + expectedMssg);                
}
//Edit Card
@When("User click on Edit option of card section")
public void userClickOnEditOptionOfCardSection() {
    click(pomFactory.retailAccountPage().clickOnCard);
    click(pomFactory.retailAccountPage().editCrdeBttn);
    logger.info("Edit button clicked sucessfully");
}
@When("user edit information with below data")
public void userEditInformationWithBelowData(DataTable dataTable) {
    List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
    clearTextUsingSendKeys(pomFactory.retailAccountPage().cardNumberFiled);
    sendText(pomFactory.retailAccountPage().cardNumberFiled, paymentInfo.get(0).get("cardNumber"));
    clearTextUsingSendKeys(pomFactory.retailAccountPage().nameOnCardFiled);
    sendText(pomFactory.retailAccountPage().nameOnCardFiled, paymentInfo.get(0).get("nameOnCard"));
    selectByVisibleText(pomFactory.retailAccountPage().expirationMonthFiled, paymentInfo.get(0).get("expirationMonth"));
    selectByVisibleText(pomFactory.retailAccountPage().expiratoinYearFiled, paymentInfo.get(0).get("expirationYear"));
    clearTextUsingSendKeys(pomFactory.retailAccountPage().securityCodeInput);
    sendText(pomFactory.retailAccountPage().securityCodeInput, paymentInfo.get(0).get("securityCode"));
    logger.info("Information has been edited");        
}
@When("user click on Update Your Card button")
public void userClickOnUpdateYourCardButton() {
    click(pomFactory.retailAccountPage().updatePaymentBttn);
    logger.info("Update Card button clicked");
}
@Then("message should be displayed {string}")
public void messageShouldBeDisplayed(String actualmssg) {        
    waitTillPresence(pomFactory.retailAccountPage().updatePaymentSuccessMsg);
    Assert.assertTrue(pomFactory.retailAccountPage().updatePaymentSuccessMsg.isDisplayed());
    actualmssg = pomFactory.retailAccountPage().updatePaymentSuccessMsg.getText();
    logger.info("Messge is: " + actualmssg);    
}
//Remove Card
@When("User click on remove option of card section")
public void userClickOnRemoveOptionOfCardSection() {

click(pomFactory.retailAccountPage().clickOnCard);

click(pomFactory.retailAccountPage().removeCard);

logger.info("Remove button clicked");
}
@Then("payment details should be removed")
public void paymentDetailsShouldBeRemoved() {
Assert.assertTrue(pomFactory.retailAccountPage().addCardBoxHeader.isDisplayed());
logger.info("Payment details removed");    
}
//Add Address

@When("User click on Add address option")
public void userClickOnAddAddressOption() {
click(pomFactory.retailAccountPage().addAddressLink);
logger.info("Add address link was clicked");
}
@When("user fill new address form with below information")
public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
List<Map<String, String>> addressInfo = dataTable.asMaps();
selectByVisibleText(pomFactory.retailAccountPage().AddresscountryDropDown,
     DataGenerator.addressGenerator(addressInfo.get(0).get("country")));
sendText(pomFactory.retailAccountPage().fullNameInput,
     DataGenerator.addressGenerator(addressInfo.get(0).get("fullName")));
sendText(pomFactory.retailAccountPage().phoneNumber,
     DataGenerator.addressGenerator(addressInfo.get(0).get("phoneNumber")));
sendText(pomFactory.retailAccountPage().streetInput,
     DataGenerator.addressGenerator(addressInfo.get(0).get("streetAddress")));
sendText(pomFactory.retailAccountPage().apartmentInput,
     DataGenerator.addressGenerator(addressInfo.get(0).get("apt")));
sendText(pomFactory.retailAccountPage().cityInput,
     DataGenerator.addressGenerator(addressInfo.get(0).get("city")));
selectByVisibleText(pomFactory.retailAccountPage().stateSelect,
     DataGenerator.addressGenerator(addressInfo.get(0).get("state")));
sendText(pomFactory.retailAccountPage().zipCodeInput,
     DataGenerator.addressGenerator(addressInfo.get(0).get("zipCode")));
logger.info("Address form wass filled");
}
@When("User click Add Your Address button")
public void userClickAddYourAddressButton() {
click(pomFactory.retailAccountPage().addressAddBttn);
logger.info("Add your address button was clicked");
}

@Then("the message should be displayed {string}")
public void theMessageShouldBeDisplayed(String actualmssg) {
waitTillPresence(pomFactory.retailAccountPage().addressAddedMssg);
Assert.assertTrue(pomFactory.retailAccountPage().addressAddedMssg.isDisplayed());
actualmssg = pomFactory.retailAccountPage().addressAddedMssg.getText();
logger.info("Message is: " + actualmssg);
}

//Edit address
@When("User click on edit address option")
public void userClickOnEditAddressOption() {
click(pomFactory.retailAccountPage().editAddressLink);
logger.info("User clicked on edit address button");
}
@When("user edit new address form with below information")
public void userEditNewAddressFormWithBelowInformation(DataTable dataTable) {
List<Map<String, String>> updateAddress = dataTable.asMaps(String.class, String.class);
sendText(pomFactory.retailAccountPage().AddresscountryDropDown, updateAddress.get(0).get("country"));
clearTextUsingSendKeys(pomFactory.retailAccountPage().nameField);
sendText(pomFactory.retailAccountPage().nameField, updateAddress.get(0).get("fullName"));
clearTextUsingSendKeys(pomFactory.retailAccountPage().phoneInput);
sendText(pomFactory.retailAccountPage().phoneInput, updateAddress.get(0).get("phoneNumber"));
clearTextUsingSendKeys(pomFactory.retailAccountPage().streetInput);
sendText(pomFactory.retailAccountPage().streetInput, updateAddress.get(0).get("streetAddress"));
clearTextUsingSendKeys(pomFactory.retailAccountPage().apartmentInput);
sendText(pomFactory.retailAccountPage().apartmentInput, updateAddress.get(0).get("apt"));
clearTextUsingSendKeys(pomFactory.retailAccountPage().cityInput);
sendText(pomFactory.retailAccountPage().cityInput, updateAddress.get(0).get("city"));
clearTextUsingSendKeys(pomFactory.retailAccountPage().stateSelect);
sendText(pomFactory.retailAccountPage().stateSelect, updateAddress.get(0).get("state"));
clearTextUsingSendKeys(pomFactory.retailAccountPage().zipCodeInput);
sendText(pomFactory.retailAccountPage().zipCodeInput, updateAddress.get(0).get("zipCode"));
logger.info("User edited the new address information");
}
@When("User click update Your Address button")
public void userClickUpdateYourAddressButton() {
click(pomFactory.retailAccountPage().updateAddressBtn);
logger.info("Update button was clicked");
}
@Then("messages should be displayed {string}")
public void messagesShouldBeDisplayed(String actualmssg) {
waitTillPresence(pomFactory.retailAccountPage().addressUpdatedSuccessfully);
Assert.assertTrue(pomFactory.retailAccountPage().addressUpdatedSuccessfully.isDisplayed());
actualmssg = pomFactory.retailAccountPage().addressUpdatedSuccessfully.getText();
logger.info("Message is: " + actualmssg);
}

//User can remove address from account
@When("User click on remove option of Address section")
public void userClickOnRemoveOptionOfAddressSection() {
click(pomFactory.retailAccountPage().removeAddBttn);
logger.info("Remove option of address section was clicked");
}
@Then("Address details should be removed")
public void addressDetailsShouldBeRemoved() {
if(!isElementDisplayed(pomFactory.retailAccountPage().addressBr));
  logger.info("Address removed successfully");
}
}