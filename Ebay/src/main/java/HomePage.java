import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

//    @FindBy(className = "login")
//    private WebElement signInTab;
//
//    @FindBy(xpath = "//a[@title='Contact Us']")
//    private WebElement contactUsTab;
//
//    @FindBy(id = "search_query_top")
//    private WebElement searchBox;
//
//    @FindBy(name = "submit_search")
//    private WebElement searchButton;
//
//    @FindBy(xpath = "//a[@title='Women']")
//    private WebElement womenTab;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")
    private WebElement clickOnMotorTab;

    @FindBy (id="gh-ac")
    private WebElement ebaySearchBar;

    @FindBy(id="gh-btn")
    private WebElement getEbaySearchButton;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    private WebElement fashionTab;

    public void setClickOnMotorTab() {
        this.clickOnMotorTab.click();
    }

    public void searchOnEbay(String text){
        this.ebaySearchBar.sendKeys(text);
        this.getEbaySearchButton.click();
    }

    //
//    public void clickOnSignInTab() {
//        this.signInTab.click();
//    }
//
//    public void clickOnContactUsTab() {
//        this.contactUsTab.click();
//    }
//
//    public void searchFor(String text) {
//        this.searchBox.sendKeys(text);
//        this.searchButton.click();
//    }
//
//    public void navigateToWomenTab() {
//        this.womenTab.click();
//    }
}
