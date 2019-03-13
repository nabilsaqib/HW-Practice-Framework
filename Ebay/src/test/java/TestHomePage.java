import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    String homepageUrl = "http://www.ebay.com";

    HomePage homePage;

    /**
     * Will navigate to the url before running all tests
     */
    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
    }
//
//    @Test
//    public void testUserCanNavigateToHomePage() {
//        String homepageTitle = "My Store";
//        Assert.assertEquals(this.driver.getTitle(), homepageTitle);
//    }
//
//    @Test
//    public void testUserCanNavigateToTheSignInPage() {
//        this.homePage.clickOnSignInTab();
//        String signInPageUrl =
//                "http://automationpractice.com/index.php?controller=authentication&back=my-account";
//        Assert.assertEquals(this.driver.getCurrentUrl(), signInPageUrl);
//    }
//
//    @Test
//    public void testUserCanSearchForDresses() {
//        this.homePage.searchFor("books");
//    }

    @Test
    public void ebayTitle(){
        String homepageTitle = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
        Assert.assertEquals(this.driver.getTitle(), homepageTitle);
    }

    @Test
    public void motorsTab(){
        this.homePage.setClickOnMotorTab();
        String motorUrl = "https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334";
        Assert.assertEquals(this.driver.getCurrentUrl(), motorUrl);
    }

    @Test
    public void userSearchOnEbay(){
        this.homePage.searchOnEbay("books");
    }

}