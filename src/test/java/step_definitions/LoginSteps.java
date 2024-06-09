package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
    @Given("User open the web sauce demo")
    public void userOpenTheWebSauceDemo() {
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("User input {string} as userName and {string} as password and click login")
    public void userInputAsUserNameAndAsPasswordAndClickLogin(String username, String password) {
        loginPage.inputFieldUserName(username);
        loginPage.inputFieldPassword(password);
        loginPage.clickButtonLogin();
    }

    @Then("User should be directed to the dashboard page")
    public void userShouldBeDirectedToTheDashboardPage() {
        Assert.assertTrue(loginPage.verifyLabelProduct());
    }

    @Given("User login with valid username {string} and password {string}")
    public void userLoginWithValidUsernameAndPassword(String username, String password) {
        loginPage.inputFieldUserName(username);
        loginPage.inputFieldPassword(password);
        loginPage.clickButtonLogin();

    }

    @Then("User should be see error message with title {string}")
    public void userShouldBeSeeErrorMessageWithTitle(String title) {
        String Title = loginPage.getTittleErrorMessage();
        System.out.println(Title);
        Assert.assertEquals(title, Title);
    }

    @When("User input {string} and {string} and click login")
    public void userInputAndAndClickLogin(String username, String password) {
        loginPage.inputFieldUserName(username);
        loginPage.inputFieldPassword(password);
        loginPage.clickButtonLogin();
    }

    @Then("User should see error message with title {string}")
    public void userShouldSeeErrorMessageWithTitle(String title) {
        String Title = loginPage.getTittleErrorMessageUsernameAndPassword();
        System.out.println(Title);
        Assert.assertEquals(title, Title);
    }
}
