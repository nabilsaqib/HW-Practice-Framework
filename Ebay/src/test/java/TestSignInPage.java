import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSignInPage extends CommonAPI {

    String signInPageUrl = "https://www.ebay.com/signin/s";
    SignInPage signInPage;

    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.signInPageUrl);
        this.signInPage = PageFactory.initElements(this.driver, SignInPage.class);
    }

        @Test
        public void singInPageTitle(){
            String signInTitle = "Sign in or Register | eBay";
            Assert.assertEquals(this.driver.getTitle(), signInTitle);
        }

        @Test
        public void userInputSignIn(){
            this.signInPage.inputUsername("user@user.com");
        }

        @Test
        public void userInputPassword(){
        this.signInPage.inputPassword("password");
        }

        @Test
        public void signIn(){
        this.signInPage.clickSignIn();
        }
}

