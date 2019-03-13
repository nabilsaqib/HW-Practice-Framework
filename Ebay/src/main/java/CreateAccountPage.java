import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends CommonAPI {


    //Find input box for the first name
    @FindBy(id="firstname")
    private WebElement firstnameInput;

    //The link to privacy agreement
    @FindBy (xpath = "//*[@id=\"agreeComp\"]/div/a[1]")
    private WebElement privacy;


    //When creating an account, it can click on sign in with Google
    @FindBy (id="reg_sfk_btn_ggl")
    private WebElement signInGoogle;


    //Method to input text for first name box
    public void inputFirstName(String text){
        this.firstnameInput.sendKeys(text);
    }


    //Clicks on the privacy agreement
    public void readPrivacy(){
        this.privacy.click();
    }


    //click on the sign in with Google tab
    public void signInWithGoogle(){
        this.signInGoogle.click();
    }

}
