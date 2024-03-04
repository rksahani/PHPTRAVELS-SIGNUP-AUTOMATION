import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {
    WebDriver driver;
    @BeforeMethod
    public void init()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://phptravels.com/integrations");
    }

  @AfterMethod
      public void flush()
     {
          driver.quit();
     }

}
