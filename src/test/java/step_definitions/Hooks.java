package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
        String appUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();
    }
}