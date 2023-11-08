import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Parent{
    public LoginPage(WebDriver driver){
        super(driver);
    }

    WebElement EmailElement ;
    By Email = By.id("Email");
    WebElement PasswordElement ;
    By Password = By.name("Password");
    WebElement LoginElement ;
    By Login = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

    public void Emailaddress(String Text){
        EmailElement = driver.findElement(Email);
        Sending(EmailElement,Text);
    }
    public void PasswordArea(String Text){
        PasswordElement = driver.findElement(Password);
        Sending(PasswordElement,Text
        );
    }
    public void LoginButton(){
        LoginElement = driver.findElement(Login);
        Clicking(LoginElement);
    }
}

/*
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(PasswordElemnt)).clear();
 */