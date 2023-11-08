import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    protected WebDriver driver ;
    @BeforeTest
    public void OpenBrowser(){
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void Quit(){
        driver.quit();
    }

}
