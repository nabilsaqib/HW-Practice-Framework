import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCreateAccountPage extends CommonAPI {

    String createAccountUrl = "https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F";
    CreateAccountPage createAccountPage;

    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.createAccountUrl);
        this.createAccountPage = PageFactory.initElements(this.driver, CreateAccountPage.class);
    }

    @Test
    public void InputFirstName(){
        this.createAccountPage.inputFirstName("Bob");
    }

    @Test
    public void clickPrivacy(){
        this.createAccountPage.readPrivacy();
    }

    @Test
    public void createAccountWithGoogle(){
        this.createAccountPage.signInWithGoogle();
    }

}
