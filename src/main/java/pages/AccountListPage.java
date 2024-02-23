package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountListPage {

	WebDriver driver;

	public AccountListPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//strong[contains(text(), 'Account List')]")
	WebElement ACCOUNT_LIST_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement ADD_ACCOUNT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id ='account_name']")
	WebElement ACCOUNT_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//textarea[@id='description']")
	WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='accountSave']")
	WebElement SAVE_BUTTON_ELEMENT;
   @FindBy(how = How.XPATH, using = "//div[contains(text(),'Account Added Successfully')]") 
   WebElement ACCOUNT_ADDED_ALERT_ELEMENT;  

	public String validateListAccountPage() {
		return ACCOUNT_LIST_ELEMENT.getText();

	}

	public void addAccountbutton() {
		ADD_ACCOUNT_ELEMENT.click();
	}

	public void enterAccountName(String acctName) {
		ACCOUNT_NAME_ELEMENT.sendKeys(acctName);

	}

	public void enterDescription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description);
	}

 public void enterIntialBalance( String balance) {
	   INITIAL_BALANCE_ELEMENT.sendKeys(balance);
 }
 public void enterAcctNumber(String acctNum) {
	 ACCT_NUMBER_ELEMENT.sendKeys(acctNum);
 }

   public void enterContactPerson(String contactName) {
	   CONTACT_PERSON_ELEMENT.sendKeys(contactName);
   }

   public void clickOnSaveButton() {
	   SAVE_BUTTON_ELEMENT.click();
   }

 public String getAcctAddedAlertText() {
	return ACCOUNT_ADDED_ALERT_ELEMENT.getText();
	 
 }




}