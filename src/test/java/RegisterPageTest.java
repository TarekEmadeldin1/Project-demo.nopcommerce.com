import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase{
    private HomePage homePage;
    private RegisterPage registerPage;
    @Test
    public void ValidRegister(){
        homePage = new HomePage(driver);
        registerPage =homePage.RegisterButton();
        registerPage.GenderSelect();
        registerPage.Firstname("Tarek");
        registerPage.LastName("Emad");
        registerPage.Birthday();
        registerPage.BirthMonth();
        registerPage.BirthYear();
        registerPage.EmailArea("tarekgem@hotmail.com");
        registerPage.CompanyNameArea("keen");
        registerPage.PasswordArea("TarekTata");
        registerPage.ReenterPaaswordArea("TarekTata");
        registerPage.RegisterSubmitButton();
    }
}
