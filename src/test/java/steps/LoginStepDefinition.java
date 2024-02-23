package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginpage;

	@Before
	public void setUp() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("User is on codefios login page")
	public void userIsOnCodefiosLoginPage() {

		driver.get("https://codefios.com/ebilling");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {

		loginpage.enterUserName(username);

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginpage.enterPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginpage.clickSigInButton();
	}


	
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
