import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LoginPageTest extends TestBase{
    private HomePage homePage;
    private LoginPage loginPage;

    @Test(groups = "Regression",priority = 1)
    public void ValidLogin(){
        homePage = new HomePage(driver);
        loginPage= homePage.ClickonLoginButton();
        loginPage.Emailaddress("tarekgem@hotmail.com");
        loginPage.PasswordArea("TarekTata");
        loginPage.LoginButton();
        /*WebElement Search = driver.findElement(By.className("ico-logout"));
        System.out.println(Search.isDisplayed());*/
        String actual = driver.findElement(By.className("ico-logout")).getText();
        String expected = "Log out";
        Assert.assertEquals(actual,expected);
    }

    @DataProvider(name = "Test data")
        public static Object [][] Data()
    {
        return new Object[][]{
                {"T", "gnjkgnsj" },
                {"Tarekfwm@hotmail.com", "gnjkgsj" },
                {"Tarekfwm@gns", "gnjkgnj" }
        };
    }
    
    @Test(dataProvider = "Test data", groups = "Regression",priority = 2)
    public void InvalidLogin(String user , String Pass){
        homePage = new HomePage(driver);
        loginPage = homePage.ClickonLoginButton();
        loginPage.Emailaddress(user);
        loginPage.PasswordArea(Pass);
        loginPage.LoginButton();









    }
}
