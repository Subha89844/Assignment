package stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
	WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is on login page")
    public void user_on_login_page() {
        loginPage.openUrl();
    }

    @When("user enters username {string} and password {string}")
    public void enter_credentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("user should see secure area")
    public void validate_success() {
        String msg = loginPage.getMessage();
        Assert.assertTrue(msg.contains("You logged into a secure area!"));
    }

    @Then("error message {string} should be displayed")
    public void validate_error(String expectedMsg) {
        String msg = loginPage.getMessage();
        Assert.assertTrue(msg.contains(expectedMsg));
        driver.quit();
    }
}
