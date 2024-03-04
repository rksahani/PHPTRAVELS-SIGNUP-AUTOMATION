package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SignupPage {
    WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }
    public static By register() {
        return By.xpath("(//div[@class=\"card-body p-4\"])[1]");
    }

    private final By Firstname = By.xpath("//input[@placeholder=\"First Name\"]");
    private final By Lastname = By.xpath("//input[@placeholder=\"Last Name\"]");
    private final By Email = By.xpath("//input[@placeholder=\"Email Address\"]");
    private final By code = By.xpath("//div[@class=\"iti-arrow\"]");
    private final By India = By.xpath("(//span[@class=\"country-name\"])[101]");
    private final By PhoneNo = By.xpath("//input[@placeholder=\"Phone Number\"]");
    private final By Company = By.xpath("//input[@placeholder=\"Company Name (Optional)\"]");
    private final By street = By.xpath("//input[@placeholder=\"Street Address\"]");
    private final By street1 = By.xpath("//input[@placeholder=\"Street Address 2\"]");
    private final By City = By.xpath("//input[@placeholder=\"City\"]");
    private final By State = By.xpath("//input[@placeholder=\"State\"]");
    private final By Postcode = By.xpath("//input[@placeholder=\"Postcode\"]");
    private final By country = By.xpath("//select");
    private final By whatsapp = By.xpath("(//input[@class=\"form-control\"])[2]");
    private final By Password = By.xpath("//input[@placeholder=\"Password\"]");
    private final By password2  = By.xpath("//input[@placeholder=\"Confirm Password\"]");
    private final By mailing = By.xpath("//span[@class=\"bootstrap-switch-handle-on bootstrap-switch-success\"]");

  //  private final By Captcha = By.xpath("//iframe[@title=\"reCAPTCHA\"]");
    private final By Submit = By.xpath("//input[@type=\"submit\"]");

    public DashboardPage Fill() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Firstname).sendKeys("Raj");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Lastname).sendKeys("Kumar");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Email).sendKeys("rkss1234@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(code).click();
        driver.findElement(India).click();
        driver.findElement(PhoneNo).sendKeys("7453521657");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Company).sendKeys("Vodafone");
        driver.findElement(street).sendKeys("TD Road");
        driver.findElement(street1).sendKeys("EON Park");
        driver.findElement(City).sendKeys("Pune");
        driver.findElement(State).sendKeys("Maharashtra");
        driver.findElement(Postcode).sendKeys("411001");
        driver.findElement(country).sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)"); // scroll down by 350 pixels
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(whatsapp).sendKeys("7485818931");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Password).sendKeys("R_Xyz24*9898");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(password2).sendKeys("R_Xyz24*9898");
        driver.findElement(mailing).click();

       //  driver.findElement(Captcha).click();

        //Captcha verification is blocking the automation
        //Need to change the test environment and disable the Captcha.
        //If captcha is verified somehow, the further automation process is blocked ,and then we need to do that manually.

        driver.findElement(Submit).click();
        return new DashboardPage(driver);
    }

public  SignupPage FnameWarning(){
    driver.findElement(Firstname).getAttribute("Please fill out this field");
    return new SignupPage(driver);
}
    public  SignupPage LnameWarning(){
        driver.findElement(Lastname).getAttribute("Please fill out this field");
        return new SignupPage(driver);
    }

   public static By noemailerror(){
        return By.xpath("//li[text()=\"You did not enter your email address\"]");
   }
    public static By noMobNoerror(){
        return By.xpath("//li[text()=\"You did not enter your phone number\"]");
    }

    public  SignupPage streetWarning(){
        driver.findElement(street).getAttribute("Please fill out this field");
        return new SignupPage(driver);
    }

    public static By nopasserror(){
        return By.xpath("//li[text()=\"You did not enter a password\"]");
    }
    public static By weakpasserror(){
        return By.xpath("//li[text()=\"The password you entered is not strong enough - please enter a more complex password\"]");
    }

    public DashboardPage blankfname() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Lastname).sendKeys("Kumar");
        driver.findElement(Email).sendKeys("rkss1234@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(code).click();
        driver.findElement(India).click();
        driver.findElement(PhoneNo).sendKeys("7453521657");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Company).sendKeys("Vodafone");
        driver.findElement(street).sendKeys("TD Road");
        driver.findElement(street1).sendKeys("EON Park");
        driver.findElement(City).sendKeys("Pune");
        driver.findElement(State).sendKeys("Maharashtra");
        driver.findElement(Postcode).sendKeys("411001");
        driver.findElement(country).sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)"); // scroll down by 350 pixels
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(whatsapp).sendKeys("7485818931");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Password).sendKeys("R_Xyz24*9898");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(password2).sendKeys("R_Xyz24*9898");
        driver.findElement(mailing).click();

        //  driver.findElement(Captcha).click();

        //Captcha verification is blocking the automation
        //Need to change the test environment and disable the Captcha.
        //If captcha is verified somehow, the further automation process is blocked ,and then we need to do that manually.

        driver.findElement(Submit).click();
        return new DashboardPage(driver);
    }

    public DashboardPage blanklname() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Firstname).sendKeys("Raj");
        driver.findElement(Email).sendKeys("rkss1234@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(code).click();
        driver.findElement(India).click();
        driver.findElement(PhoneNo).sendKeys("7453521657");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Company).sendKeys("Vodafone");
        driver.findElement(street).sendKeys("TD Road");
        driver.findElement(street1).sendKeys("EON Park");
        driver.findElement(City).sendKeys("Pune");
        driver.findElement(State).sendKeys("Maharashtra");
        driver.findElement(Postcode).sendKeys("411001");
        driver.findElement(country).sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)"); // scroll down by 350 pixels
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(whatsapp).sendKeys("7485818931");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Password).sendKeys("R_Xyz24*9898");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(password2).sendKeys("R_Xyz24*9898");
        driver.findElement(mailing).click();

        //  driver.findElement(Captcha).click();

        //Captcha verification is blocking the automation
        //Need to change the test environment and disable the Captcha.
        //If captcha is verified somehow, the further automation process is blocked ,and then we need to do that manually.

        driver.findElement(Submit).click();
        return new DashboardPage(driver);
    }
    public DashboardPage blankemail() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Firstname).sendKeys("Raj");
        driver.findElement(Lastname).sendKeys("Kumar");
        driver.findElement(code).click();
        driver.findElement(India).click();
        driver.findElement(PhoneNo).sendKeys("7453521657");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Company).sendKeys("Vodafone");
        driver.findElement(street).sendKeys("TD Road");
        driver.findElement(street1).sendKeys("EON Park");
        driver.findElement(City).sendKeys("Pune");
        driver.findElement(State).sendKeys("Maharashtra");
        driver.findElement(Postcode).sendKeys("411001");
        driver.findElement(country).sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)"); // scroll down by 350 pixels
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(whatsapp).sendKeys("7485818931");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Password).sendKeys("R_Xyz24*9898");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(password2).sendKeys("R_Xyz24*9898");
        driver.findElement(mailing).click();

        //  driver.findElement(Captcha).click();

        //Captcha verification is blocking the automation
        //Need to change the test environment and disable the Captcha.
        //If captcha is verified somehow, the further automation process is blocked ,and then we need to do that manually.
        driver.findElement(Submit).click();
        return new DashboardPage(driver);
    }

    public DashboardPage blankstreet() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Firstname).sendKeys("Raj");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Lastname).sendKeys("Kumar");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Email).sendKeys("rkss1234@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(code).click();
        driver.findElement(India).click();
        driver.findElement(PhoneNo).sendKeys("7453521657");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Company).sendKeys("Vodafone");
        driver.findElement(street1).sendKeys("EON Park");
        driver.findElement(City).sendKeys("Pune");
        driver.findElement(State).sendKeys("Maharashtra");
        driver.findElement(Postcode).sendKeys("411001");
        driver.findElement(country).sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)"); // scroll down by 350 pixels
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(whatsapp).sendKeys("7485818931");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Password).sendKeys("R_Xyz24*9898");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(password2).sendKeys("R_Xyz24*9898");
        driver.findElement(mailing).click();

        //  driver.findElement(Captcha).click();

        //Captcha verification is blocking the automation
        //Need to change the test environment and disable the Captcha.
        //If captcha is verified somehow, the further automation process is blocked ,and then we need to do that manually.

        driver.findElement(Submit).click();
        return new DashboardPage(driver);
    }


    public static By InvalidMobNoerror(){
        return By.xpath("//li[text()=\"Your phone number is not valid\"]");
    }
    public DashboardPage blankmobilenumber() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Firstname).sendKeys("Raj");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Lastname).sendKeys("Kumar");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Email).sendKeys("rkss1234@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(code).click();
        driver.findElement(India).click();
        driver.findElement(Company).sendKeys("Vodafone");
        driver.findElement(street).sendKeys("TD Road");
        driver.findElement(street1).sendKeys("EON Park");
        driver.findElement(City).sendKeys("Pune");
        driver.findElement(State).sendKeys("Maharashtra");
        driver.findElement(Postcode).sendKeys("411001");
        driver.findElement(country).sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)"); // scroll down by 350 pixels
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(whatsapp).sendKeys("7485818931");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Password).sendKeys("R_Xyz24*9898");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(password2).sendKeys("R_Xyz24*9898");
        driver.findElement(mailing).click();

        //  driver.findElement(Captcha).click();

        //Captcha verification is blocking the automation
        //Need to change the test environment and disable the Captcha.
        //If captcha is verified somehow, the further automation process is blocked ,and then we need to do that manually.

        driver.findElement(Submit).click();
        return new DashboardPage(driver);
    }

    public DashboardPage Invalidmobilenumber() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Firstname).sendKeys("Raj");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Lastname).sendKeys("Kumar");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Email).sendKeys("rkss1234@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(code).click();
        driver.findElement(India).click();
        driver.findElement(PhoneNo).sendKeys("74535@#657*");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Company).sendKeys("Vodafone");
        driver.findElement(street).sendKeys("TD Road");
        driver.findElement(street1).sendKeys("EON Park");
        driver.findElement(City).sendKeys("Pune");
        driver.findElement(State).sendKeys("Maharashtra");
        driver.findElement(Postcode).sendKeys("411001");
        driver.findElement(country).sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)"); // scroll down by 350 pixels
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(whatsapp).sendKeys("7485818931");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Password).sendKeys("R_Xyz24*9898");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(password2).sendKeys("R_Xyz24*9898");
        driver.findElement(mailing).click();

        //  driver.findElement(Captcha).click();

        //Captcha verification is blocking the automation
        //Need to change the test environment and disable the Captcha.
        //If captcha is verified somehow, the further automation process is blocked ,and then we need to do that manually.

        driver.findElement(Submit).click();
        return new DashboardPage(driver);
    }
    public DashboardPage blankpassword() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Firstname).sendKeys("Raj");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Lastname).sendKeys("Kumar");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Email).sendKeys("rkss1234@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(code).click();
        driver.findElement(India).click();
        driver.findElement(PhoneNo).sendKeys("7453521657");
        driver.findElement(Company).sendKeys("Vodafone");
        driver.findElement(street).sendKeys("TD Road");
        driver.findElement(street1).sendKeys("EON Park");
        driver.findElement(City).sendKeys("Pune");
        driver.findElement(State).sendKeys("Maharashtra");
        driver.findElement(Postcode).sendKeys("411001");
        driver.findElement(country).sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)"); // scroll down by 350 pixels
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(whatsapp).sendKeys("7485818931");
        driver.findElement(mailing).click();

        //  driver.findElement(Captcha).click();

        //Captcha verification is blocking the automation
        //Need to change the test environment and disable the Captcha.
        //If captcha is verified somehow, the further automation process is blocked ,and then we need to do that manually.

        driver.findElement(Submit).click();
        return new DashboardPage(driver);
    }

    public DashboardPage weakpassword() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Firstname).sendKeys("Raj");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Lastname).sendKeys("Kumar");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Email).sendKeys("rkss1234@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(code).click();
        driver.findElement(India).click();
        driver.findElement(PhoneNo).sendKeys("7453521657");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Company).sendKeys("Vodafone");
        driver.findElement(street).sendKeys("TD Road");
        driver.findElement(street1).sendKeys("EON Park");
        driver.findElement(City).sendKeys("Pune");
        driver.findElement(State).sendKeys("Maharashtra");
        driver.findElement(Postcode).sendKeys("411001");
        driver.findElement(country).sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)"); // scroll down by 350 pixels
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(whatsapp).sendKeys("7485818931");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Password).sendKeys("989");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(password2).sendKeys("989");
        driver.findElement(mailing).click();

        //  driver.findElement(Captcha).click();

        //Captcha verification is blocking the automation
        //Need to change the test environment and disable the Captcha.
        //If captcha is verified somehow, the further automation process is blocked ,and then we need to do that manually.

        driver.findElement(Submit).click();
        return new DashboardPage(driver);
    }


}
