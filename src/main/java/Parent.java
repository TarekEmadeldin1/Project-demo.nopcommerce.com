import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Parent {
    protected WebDriver driver;
    public Parent(WebDriver driver){
        this.driver = driver ;
    }

    public void Clicking(WebElement element){
        element.click();
    }

    public void Sending(WebElement element , String Text){
        element.sendKeys(Text);
    }
}
