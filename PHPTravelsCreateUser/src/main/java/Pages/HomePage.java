
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By SignUp = By.xpath("//div/a/strong[text()=\"Signup\"]");

    public SignupPage Sign() {
        driver.findElement(SignUp).click();
        ArrayList<String> tab= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        return new SignupPage(driver);
    }
}