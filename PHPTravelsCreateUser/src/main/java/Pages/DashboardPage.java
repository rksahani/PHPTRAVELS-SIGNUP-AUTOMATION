package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    public DashboardPage(WebDriver driver){
        this.driver =driver;
    }
    public static By loggedIn(){
        return By.xpath("//ol[@class=\"breadcrumb\"]");
    }

}
