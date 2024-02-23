package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Dashboard')]")
	WebElement DASHBOARD;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'List Accounts')]")
	WebElement LISTACCOUNTS;

	public String validateDashboardTtile() {

		return DASHBOARD.getText();

	}

	public void clickListAccounts() {

		LISTACCOUNTS.click();

	}

}
