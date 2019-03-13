import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends CommonAPI {

    @FindBy (id = "sgnBt")
     private WebElement singInButton;

    @FindBy (id="userid")
    private WebElement username;

    @FindBy (id="pass")
    private WebElement password;

    @FindBy (id="InLineCreateAnAccount")
    private WebElement createAccount;

    public void clickSignIn(){
        this.singInButton.click();
    }

    public void inputUsername(String text){
        this.username.sendKeys(text);
    }

    public void inputPassword(String text){
        this.password.sendKeys(text);
    }

}
