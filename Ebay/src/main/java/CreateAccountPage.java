import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends CommonAPI {

    @FindBy(id="firstname")
    private WebElement firstnameInput;

    @FindBy (xpath = "//*[@id=\"agreeComp\"]/div/a[1]")
    private WebElement privacy;

    @FindBy (id="reg_sfk_btn_ggl")
    private WebElement signInGoogle;

    public void inputFirstName(String text){
        this.firstnameInput.sendKeys(text);
    }

    public void readPrivacy(){
        this.privacy.click();
    }

    public void signInWithGoogle(){
        this.signInGoogle.click();
    }

}
