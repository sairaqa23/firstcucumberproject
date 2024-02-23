package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.TestBase;

public class DashboardStepDef extends TestBase {

	DashboardPage dashboardpage;
	
	@Then("User should be landing  on dashboard page")
	public void user_should_be_landing_on_dashboard_page() {
		 dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		String expectedtitle = "Dashboard";
		String actualtitle = dashboardpage.validateDashboardTtile();
	  Assert.assertEquals("Title does not match!", expectedtitle, actualtitle);
	}

	@When("User clicks on Account List link")
	public void user_clicks_on_Account_List_link() {
	     dashboardpage.clickListAccounts();
	}

	
	





}
