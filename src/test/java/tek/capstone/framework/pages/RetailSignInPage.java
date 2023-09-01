package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	public RetailSignInPage() {
      PageFactory.initElements(getDriver(),this);
	}
	
	// SignIn
	
	
 
   @FindBy(id= "signinLink")
   public WebElement signInLink;
   
   
 
    @FindBy(id ="logoutBtn")
    public WebElement logoutBtn;
 
    @FindBy(id="email")
    public WebElement emailField;
 
     @FindBy (id = "password")
    public WebElement passwordField;
 
    @FindBy(id="loginBtn")
    public WebElement loginBtn;
 
    @FindBy(id="newAccountBtn")
    public WebElement newAccountBtn;
  
    @FindBy(id="nameInput")
    public WebElement nameInput;
 
    
    @FindBy(id ="emailInput")
    public WebElement emailInput;
 
    @FindBy(id ="passwordInput")
    public WebElement passwordInput;
 
    @FindBy(id="confirmPasswordInput")
    public WebElement confirmPasswordInput;
 
    @FindBy(id="signupBtn")
    public WebElement signupBtn;
    
   // @FindBy(xpath ="//div[text()='Personal Information Updated Successfully']")
   // public WebElement personalInfoUpdateSuccessMssg;
    
    @FindBy(id = "accountLink")
    public WebElement accountLink;
    
    @FindBy(id ="newCompanyAccount")
    public WebElement sellSomethingLink;
    
    
}


