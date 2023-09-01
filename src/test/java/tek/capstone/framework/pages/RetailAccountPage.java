package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
	PageFactory.initElements(getDriver(), this);
	
	}	
//@userInfoUpdate

    @FindBy(id="accountLink")
    public WebElement AccountLink;

   // @FindBy(linkText="Account")
  //  public WebElement accountBttn;

    @FindBy(id="nameInput")
    public WebElement nameField;
   
    @FindBy(id="personalPhoneInput")
    public WebElement phoneInput;
  
    @FindBy(xpath = "//button[text()='Update']")
    public WebElement updateBttn;
   
    @FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
    public WebElement updateMssg;

    //    @userAddPaymentMethod
    
    @FindBy(xpath="//p[text()='Add a payment method']")
    public WebElement addPaymentMethodLink;
  
    @FindBy(id="cardNumberInput")
    public WebElement cardNumberFiled;

    @FindBy(id="nameOnCardInput")
    public WebElement nameOnCardFiled;
   
    @FindBy(id="expirationMonthInput")
    public WebElement expirationMonthFiled;
    
    @FindBy(id="expirationYearInput")
    public WebElement expiratoinYearFiled;
    
    @FindBy(id="securityCodeInput")
    public WebElement securityCodeInput;
    
    @FindBy(id="paymentSubmitBtn")
    public WebElement payementSubmitBttn;
    
    @FindBy(xpath ="//div[text()='Payment Method added sucessfully']")
    public WebElement paymentMethodSuccessMssge;
 
    
    @FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
    public WebElement updatePaymentSuccessMsg;
    
    @FindBy(xpath = "//button[@class='text-blue-800 cursor-pointer hover:underline' and text()='Edit']")
    public WebElement editCrdeBttn;
    
    @FindBy(id = "paymentSubmitBtn")
    public WebElement updatePaymentBttn;
    
   
    @FindBy(xpath = "//div[@class='false account__payment-item']")
    public WebElement clickOnCard;
    
     @FindBy(xpath = "//button[text()='remove']")
        public WebElement removeCard;
     
     @FindBy(xpath = "//h1[@class='account__payment-new-title']")
        public WebElement addCardBoxHeader;
     
     @FindBy(xpath = "//div[starts-with(@class,'account__address-new-')]")
     public WebElement addAddressLink;
    
    @FindBy(id="countryDropdown")
    public WebElement AddresscountryDropDown;
  
    @FindBy(id="fullNameInput")
    public WebElement fullNameInput;
    
    @FindBy(id="phoneNumberInput")
    public WebElement phoneNumber;
    
    @FindBy(id="streetInput")
    public WebElement streetInput;
    
    @FindBy(id="apartmentInput")
    public WebElement apartmentInput;
    
    @FindBy(id="cityInput")
    public WebElement cityInput;
    
    @FindBy(name="state")
    public WebElement stateSelect;
   
    @FindBy(id="zipCodeInput")
    public WebElement zipCodeInput;
    
    @FindBy(id = "addressBtn")
    public WebElement  addressAddBttn;
   
    @FindBy(xpath="//div[text()='Address Added Successfully']")
    public WebElement addressAddedMssg;

    //    update address button is here and we have used the add addresses locators
//    so for the ones that already have locators
//    we don't need a new locator
    @FindBy(xpath = "//button[@class='account__address-btn' and text()='Edit'][1]")
    public WebElement editAddressLink;
    
    @FindBy(id = "addressBtn")
    public WebElement updateAddressBtn;
    
    @FindBy(xpath = "//div[text()='Address Updated Successfully']")
    public WebElement addressUpdatedSuccessfully;
    
    @FindBy(xpath = "//button[text()='Remove']")
    public WebElement removeAddBttn;
    
    @FindBy(css = "div.account__address-single")
    public WebElement addressBr;
    

   
} 