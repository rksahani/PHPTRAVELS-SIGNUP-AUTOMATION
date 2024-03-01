import Pages.DashboardPage;
import Pages.HomePage;
import Pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends baseTest{


    @Test
    public void user(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).Fill();
        Assert.assertTrue(driver.findElement(DashboardPage.loggedIn()).isDisplayed());
    }
}
