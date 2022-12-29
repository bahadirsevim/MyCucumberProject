package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjectModels.RegisterPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class register_steps {

    RegisterPage registerPage = new RegisterPage();

    private WebDriver driver;

    @Given("Navigate to website")
    public void navigateToWebsite() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("click sign in button")
    public void clickSignInButton() {
        registerPage.clickOnSignInButton();
    }

    @And("type email {string}")
    public void typeEmail(String email) {
        registerPage.pressSpace();
        registerPage.typeEmail(email);
    }

    @And("click on Create an Account button")
    public void clickOnCreateAnAccountButton() {
        registerPage.clickOnSubmitButton();
    }

    @And("choose title")
    public void chooseTitle() {
        registerPage.clickOnGender();
    }

    @And("type firstname {string} and lastname {string}")
    public void typeFirstnameAndLastname(String firstname, String lastname) {
        registerPage.typeFirstnameAndLastName(firstname,lastname);
    }

    @And("type password {string}")
    public void typePassword(String password) {
        registerPage.typePassword(password);
    }

    @And("type Company {string}")
    public void typeCompany(String company) {
        registerPage.pressSpace();
        registerPage.typeCompany(company);
    }

    @And("type address {string}")
    public void typeAddress(String address) {
        registerPage.typeAddress(address);
    }

    @After
    public void qutDriver() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
