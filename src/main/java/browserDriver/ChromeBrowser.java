package browserDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements BrowserFactory {

    @Override
    public WebDriver getDriver() {
        setBinaryPath();
        return new ChromeDriver();
    }

    @Override
    public void setBinaryPath() {
        WebDriverManager.chromedriver().setup();
    }
}
