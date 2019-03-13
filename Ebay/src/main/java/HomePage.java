import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")
    private WebElement clickOnMotorTab;

    @FindBy (id="gh-ac")
    private WebElement ebaySearchBar;

    @FindBy(id="gh-btn")
    private WebElement getEbaySearchButton;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    private WebElement fashionTab;


    //click on the motor tab on ebay options on top
    public void setClickOnMotorTab() {
        this.clickOnMotorTab.click();
    }


    //send text on the search bar on ebay homepage
    public void searchOnEbay(String text){
        this.ebaySearchBar.sendKeys(text);
        this.getEbaySearchButton.click();
    }

}
