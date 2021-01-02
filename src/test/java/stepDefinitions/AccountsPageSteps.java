package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps {
	
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountspage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
	   
		List<Map<String,String>> credList=dataTable.asMaps();
		String userName=credList.get(0).get("username");
		String password=credList.get(0).get("password");   
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountspage=loginpage.doLogin(userName, password);
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
	    String title=accountspage.getAccountspageTitle();   
	    System.out.println("Accounts Page title is: " + title);
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionsTable) {
		List<String>expAccountSectionsList=sectionsTable.asList();
		System.out.println("Expected accounts section list: "+ expAccountSectionsList);
		
		List<String>actualAccountSectionList=accountspage.getAccountsSectionsList();
		System.out.println("Actual accounts section list: " + actualAccountSectionList);
		
		Assert.assertTrue(expAccountSectionsList.containsAll(actualAccountSectionList));
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedSectionCount) {
	  Assert.assertTrue(accountspage.getAccountsSectionCount() == expectedSectionCount);
	}

}
