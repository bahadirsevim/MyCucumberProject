package pageObjectModels;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage extends BasePage{

    WebDriver driver;

    public ContactUsPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;

    public void clickContactUsButton(){
        click(contactUsButton);
    }

    @FindBy(tagName = "html")
    private WebElement html;

    public void pressSpace(){
        html.sendKeys(Keys.SPACE);
    }

    @FindBy(name = "id_contact")
    private WebElement subjectHeadingDropdown;

    public void selectDropdown(){
        selectFromDropdown(subjectHeadingDropdown, "Webmaster");
    }

    @FindBy(id = "email")
    private WebElement emailTextArea;

    public void typeEmail(){
        type(emailTextArea, "bahadirsevim@gmail.com");
    }

    @FindBy(name = "id_order")
    private WebElement order;

    public void typeOrder(){
        type(order, "order123");
    }

    @FindBy(id = "message")
    private WebElement messageBox;

    public void typeMessage(){
        type(messageBox, "just a sample message");
    }

    @FindBy(id = "submitMessage")
    private WebElement submitButton;

    public void clickSendButton(){
        click(submitButton);
    }

    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    public void assertMyMessage(){
        assertion(successMessage, "Your message has been successfully sent to our team.");
    }

}
