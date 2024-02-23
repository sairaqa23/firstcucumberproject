package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AccountListPage;
import pages.TestBase;

public class AccountListStepDef extends TestBase{

   AccountListPage acctlistpage;
   
  @Then("User should be landing on Account List page")
  public void User_clicks_on_Account_List_link(){
	  acctlistpage= PageFactory.initElements(driver, AccountListPage.class);
      
	  String expectedTitle = "Account List";
	  String actualTitle = acctlistpage.validateListAccountPage();
	  Assert.assertEquals("Title does not match!", expectedTitle, actualTitle);
      
  }
  @When("User clicks on Add Account button")
  public void user_clicks_on_Add_Account_button() {
        acctlistpage.addAccountbutton();
  }

  @When("User enters Account name as {string}")
  public void user_enters_Account_name_as(String acctName) {
	  acctlistpage.enterAccountName(acctName);
     
  }

  @When("User enters description as {string}")
  public void user_enters_description_as(String description) {
     acctlistpage.enterDescription(description);
  }

 @When("User enters intial balance as {string}")
  public void User_enters_intial_balance(String balance) {
	 acctlistpage.enterIntialBalance(balance);
 }

 @When("User enters account Number as {string}")
 public void User_enters_account_Number_as(String acctNum ) {
	 acctlistpage.enterAcctNumber(acctNum);
 }
 @When("User enters contact Person as {string}")
 public void user_enters_contact_Person_as(String contactName) {
    acctlistpage.enterContactPerson(contactName);
 }

 @When("User clicks on save button")
 public void User_clicks_on_save_button() {
	  acctlistpage.clickOnSaveButton();
 }
@Then ("User should be able to see account added alert")
	public void User_should_be_able_to_see_account_added_alert() {
	
	String expectedtext = "Account Added Successfully.";
    String actualtext = acctlistpage.getAcctAddedAlertText();
	Assert.assertEquals("Alert not found!",expectedtext, actualtext);
}



}


