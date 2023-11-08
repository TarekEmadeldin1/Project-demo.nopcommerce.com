import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.Callable;

public class RegisterPage extends Parent {
    public RegisterPage(WebDriver driver){
        super(driver);
    }

    private WebElement GenderElement;
    private By Gender = By.id("gender-male");
    private WebElement FirstNameElement;
    private By First = By.name("FirstName");
    private WebElement LastNameElement;
    private By Last = By.name("LastName");
    private WebElement BirthdayElement;
    private By Birthday = By.name("DateOfBirthDay");
    private WebElement BirthMonthElement;
    private By BirthMonth = By.name("DateOfBirthMonth");
    private WebElement BirthYearElement;
    private By BirthYear = By.name("DateOfBirthYear");
    private By email = By.name("Email");
    private WebElement EmailElement;
    private By companyname = By.name("Company");
    private WebElement CompanyNameElement;
    private By password = By.name("Password");
    private WebElement PassWordElement ;
    private By repassword = By.name("ConfirmPassword");
    private WebElement RePassWordElement;
    private By RePassword = By.name("ConfirmPassword");
    WebElement SubmitButtonElement ;
    private By SubmitButton = By.name("register-button");

    public void GenderSelect() {
        GenderElement = driver.findElement(Gender);
        Clicking(GenderElement);
    }

    public void Firstname(String text) {
        FirstNameElement = driver.findElement(First);
        Sending(FirstNameElement, text);
    }

    public void LastName(String Text) {
        LastNameElement = driver.findElement(Last);
        Sending(LastNameElement, Text);
    }

    public void Birthday() {
        BirthdayElement = driver.findElement(Birthday);
        Select select1 = new Select(BirthdayElement);
        select1.selectByIndex(8);
    }

    public void BirthMonth() {
        BirthMonthElement = driver.findElement(BirthMonth);
        Select select2 = new Select(BirthMonthElement);
        select2.selectByIndex(4);
    }
    public void BirthYear(){
        BirthYearElement = driver.findElement(BirthYear);
        Select select3 = new Select(BirthYearElement);
        select3.selectByValue("1997");
    }
    public void EmailArea(String Text){
        EmailElement=driver.findElement(email);
        Sending(EmailElement,Text);
    }
    public void CompanyNameArea(String CName){
        CompanyNameElement=driver.findElement(companyname);
        Sending(CompanyNameElement,CName);
    }
    public void PasswordArea(String Pass){
        PassWordElement= driver.findElement(password);
        Sending(PassWordElement,Pass);
    }
    public void ReenterPaaswordArea(String RePass){
        PassWordElement=driver.findElement(repassword);
        Sending(PassWordElement,RePass);
    }
    public void RegisterSubmitButton(){
        SubmitButtonElement = driver.findElement(SubmitButton);
        Clicking(SubmitButtonElement);


            }

}