package pageObjectModels;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage extends BasePage{
    private WebDriver driver;

    public RegisterPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "html")
    private WebElement html;
    @FindBy(css = "a.login")
    private WebElement signInButton;
    @FindBy(name = "email_create")
    private WebElement emailTextBox;
    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;
    @FindBy(id = "id_gender1")
    private WebElement gender;
    @FindBy(id = "customer_firstname")
    private WebElement firstname;
    @FindBy(id = "customer_lastname")
    private WebElement lastname;
    @FindBy(name = "passwd")
    private WebElement password;
    @FindBy(id = "company")
    private WebElement company;
    @FindBy(name = "address1")
    private WebElement address;

    public void clickOnSignInButton(){
        click(signInButton);
    }

    public void typeEmail(String email){
        type(emailTextBox, email);
    }

    public void clickOnSubmitButton(){
        click(submitButton);
    }

    public void pressSpace(){
        html.sendKeys(Keys.SPACE);
    }

    public void clickOnGender(){
        click(gender);
    }

    public void typeFirstnameAndLastName(String firstName, String lastName){
        type(firstname, firstName);
        type(lastname, lastName);
    }

    public void typePassword(String passwordText){
        type(password,passwordText);
    }

    public void typeCompany(String companyText){
        type(company,companyText);
    }

    public void typeAddress(String addressText){
        type(address,addressText);
    }
}
