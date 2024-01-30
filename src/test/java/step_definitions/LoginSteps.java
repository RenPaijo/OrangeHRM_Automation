package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the website")
    public void userOpenTheWebsite() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.setLogin());
    }

    @When("User input {string} as username and {string} as password")
    public void userInputAsUsernameAndAsPassword(String user, String pass) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUser(user);
        loginPage.setPass(pass);
    }

    @And("Click button login")
    public void clickButtonLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setButton();
        Thread.sleep(3000);
    }

    @Then("user already on dashboard page")
    public void userAlreadyOnDashboardPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setImg();
    }

//    Error message
    @Then("Error message should show up")
    public void errorMessageShouldShowUp() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.setError());
    }

//    Required message
    @Then("Required message should show up")
    public void requiredMessageShouldShowUp() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.setRequired());
    }
}
