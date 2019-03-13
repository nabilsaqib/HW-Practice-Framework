import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    WebDriver driver = null;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "../common/driver/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void cleanUp() {
        this.driver.quit();
    }

}