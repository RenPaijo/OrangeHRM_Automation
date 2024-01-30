package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        LoginPage.driver = driver;
    }

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    private WebElement login;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement user;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement pass;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    private WebElement button;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    private WebElement required;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement error;

    @FindBy(xpath = "//img[@alt='client brand banner']")
    private WebElement img;

    public boolean setLogin(){
        login.isDisplayed();
        return true;
    }

    public void setUser(String name){
        user.sendKeys(name);
    }

    public void setPass(String word){
        pass.sendKeys(word);
    }

    public void setButton(){
        button.click();
    }

    public boolean setRequired(){
        required.isDisplayed();
        return true;
    }

    public boolean setError(){
        error.isDisplayed();
        return true;
    }

    public boolean setImg(){
        img.isDisplayed();
        return true;
    }
}