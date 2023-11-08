import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Parent{
    public HomePage(WebDriver driver){
        super(driver);
    }

    WebElement RegisterButtonElement ;
    By Register = By.className("ico-register");
    WebElement LoginButtonElement;
    By Login = By.className("ico-login");

    public RegisterPage RegisterButton(){
        RegisterButtonElement = driver.findElement(Register);
        Clicking(RegisterButtonElement);
        return new RegisterPage(driver);
    }
    public LoginPage ClickonLoginButton(){
        LoginButtonElement = driver.findElement(Login);
        Clicking(LoginButtonElement);
        return new LoginPage(driver);
    }

}
