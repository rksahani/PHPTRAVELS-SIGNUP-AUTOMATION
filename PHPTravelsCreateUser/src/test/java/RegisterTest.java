import Pages.DashboardPage;
import Pages.HomePage;
import Pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RegisterTest extends baseTest{

//Negative scenario

    @Test
    public void Nofirstname(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).blankfname();
        new SignupPage(driver).FnameWarning();
    }

    @Test
    public void Nolastname(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).blanklname();
        new SignupPage(driver).LnameWarning();
    }

    @Test
    public void Noemail(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).blankemail();
        Assert.assertTrue(driver.findElement(SignupPage.noemailerror()).isDisplayed());
    }
    @Test
    public void NoMobileNumber(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).blankmobilenumber();
        Assert.assertTrue(driver.findElement(SignupPage.noMobNoerror()).isDisplayed());
    }
    @Test
    public void InvalidMobileNumber(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).Invalidmobilenumber();
        Assert.assertTrue(driver.findElement(SignupPage.InvalidMobNoerror()).isDisplayed());
    }


    @Test
    public void Nostreet(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).blankstreet();
        new SignupPage(driver).streetWarning();
    }
    @Test
    public void Nopassword(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).blankpassword();
       Assert.assertTrue(driver.findElement(SignupPage.nopasserror()).isDisplayed());
    }
    @Test
    public void weakpassword(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).weakpassword();
        Assert.assertTrue(driver.findElement(SignupPage.weakpasserror()).isDisplayed());
    }



//Positive scenario
    @Test
    public void user(){
        new HomePage(driver).Sign();
        Assert.assertTrue(driver.findElement(SignupPage.register()).isDisplayed());
        new SignupPage(driver).Fill();
        Assert.assertTrue(driver.findElement(DashboardPage.loggedIn()).isDisplayed());
    }
}
