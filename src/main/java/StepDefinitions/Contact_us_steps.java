package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModels.ContactUsPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Contact_us_steps {

    private WebDriver driver;
    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("navigate to website")
    public void navigate_to_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Given("click on contact us button")
    public void click_on_contact_us_button() {
        contactUsPage.clickContactUsButton();
    }
    @Given("select Subject Heading")
    public void select_subject_heading() {
        contactUsPage.pressSpace();
        contactUsPage.selectDropdown();
    }
    @Given("type Email")
    public void type_email() {
        contactUsPage.typeEmail();
    }
    @Given("type Order reference {string}")
    public void type_order_reference(String string) {
        contactUsPage.typeOrder();
    }
    @Given("type a message")
    public void type_a_message() {
        contactUsPage.typeMessage();
    }
    @When("click on send button")
    public void click_on_send_button() {
        contactUsPage.clickSendButton();
    }
    @Then("verify success message")
    public void verify_success_message() {
        contactUsPage.assertMyMessage();
    }

}
