package tek.capstone.framework.pages;

import tek.capstone.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	
	// we do here in we will initialize this page object class inside this poem factory class.
//basically we are using encapsulation.
	//First, we will create a a private variable.for each class 
	
	private RetailHomePage homepage;
	private RetailSignInPage retailSignInPage ;
	private RetailAccountPage  retailAccountPage;
	private RetailOrderPage  retailOrderPage;
	
	public POMFactory() {
		this.homepage = new RetailHomePage();
this.retailSignInPage = new RetailSignInPage();
	this.retailOrderPage = new RetailOrderPage();
	this.retailAccountPage = new RetailAccountPage();
}
	// we create the get method(){
		public  RetailHomePage homepage(){
			return this.homepage;
		
	}
		public RetailSignInPage retailSigninPage() {
			return this.retailSignInPage;
		}
		
		public RetailAccountPage retailAccountPage() {
			return this.retailAccountPage;
		}
		public RetailOrderPage retailOrderPage() {
			return this.retailOrderPage;
			
		}
    }
    



