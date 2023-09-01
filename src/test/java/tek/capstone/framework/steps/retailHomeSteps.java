package tek.capstone.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class retailHomeSteps extends CommonUtility {
	
	
// we will create obect of POMFactory class to access the page objects in page object classess
	//using the get method  we create in the POMFactory class
	
	//@Given("user is on retail website homepage")
	
	POMFactory pomFactory = new POMFactory();
		
	// becacuse we have this method under the signin
	//@Given("User is on retail website homepage")
//	public void userIsOnRetailWebsiteHomepage() {
		//Assert.assertTrue(pomFactory.homepage().tekschoolLogo.isDisplayed());
	//logger.info("tek school logo is displayed");
	//}
	@When("User click on All section")
	public void userClickOnAllSection() {
	    click(pomFactory.homepage().Alloption);
	    logger.info("All Option was clicked ");
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		
		
		List<List<String>> ShopByDepartment = dataTable.asLists(String.class);
		
		for(int i =0; i < ShopByDepartment.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(
					getDriver().findElement(By.xpath("//div[@class='sidebar__content']//span[text()='"+ShopByDepartment.get(0).get(i)+"']"))));
			
			logger.info("Option " + ShopByDepartment.get(0).get(i) + " is displayed") ;
		}
		}
	@When("User on {string}")
 public void userOn(String department) {
 List<WebElement> departments = pomFactory.homepage().sidebaroption;
 for(int i = 0; i < departments.size(); i++) {
            if(departments.get(i).getText().equalsIgnoreCase(department)) {
                departments.get(i).click();
                break;
            }
        }
    }

    @Then("below options are present in department")

    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
        List<List<String>> departmentOptions = dataTable.asLists(String.class);
        List<WebElement> options = pomFactory.homepage().sideBarAllOptions;
        for(int i = 0; i < departmentOptions.get(0).size(); i++) {
            for(WebElement elements : options) {
                if(elements.getText().equalsIgnoreCase(departmentOptions.get(0).get(i))) {
                    Assert.assertTrue(elements.isDisplayed());
                    logger.info("The option " + elements.getText() + " is present");
                }
            }
        }
        
    }
}
