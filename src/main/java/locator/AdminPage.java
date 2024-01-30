package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
    public static WebDriver driver;

    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        AdminPage.driver = driver;
    }

    @FindBy(xpath = "//a[.='Admin']")
    private WebElement admin;

    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//input[@class='oxd-input oxd-input--active']")
    private WebElement user;

    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]//div[@class='oxd-select-text" +
            " oxd-select-text--active']")
    private WebElement role;

    @FindBy(xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input[1]")
    private WebElement employee;

    @FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[4]//div[@class='oxd-select-text" +
            " oxd-select-text--active']")
    private WebElement status;

    public void setAdmin(){
        admin.click();
    }

    public void setUser(String name){
        user.sendKeys(name);
    }

    public void setRole(String roles){
        Select elor =new Select(role);
        elor.selectByVisibleText(roles);
    }

    public void setEmployee(String gedung){
        employee.sendKeys(gedung);
    }

    public void setStatus(String peran){
        Select ranpe = new Select(status);
        ranpe.selectByVisibleText(peran);
    }
}
