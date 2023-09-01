package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	// we will create on consturctor and by using the initelements method from POMFactory class we will
	// initialize our page object in this class
	
public RetailHomePage() {
	PageFactory.initElements(getDriver(),this);
}
// we will use the @findBy annotation from selenium to find elements instead of findelement() or findelements()methods
// example:
@FindBy(linkText="TEKSCHOOL")
public WebElement tekschoolLogo;

@FindBy(id="hamburgerBtn")
public WebElement Alloption;

@FindBy(xpath = "//div[@class='sidebar__content']//span")
public List<WebElement> sidebaroption ;

@FindBy(xpath = "//div[@class='sidebar_content-item']//span")
public List<WebElement> sideBarAllOptions;

@FindBy(id="contentHeader")
public WebElement departmentHeader;

@FindBy(id ="signinBtn")
public WebElement signIn;

@FindBy(xpath ="//a[@id='accountLink']")
public WebElement accountInput;

}
