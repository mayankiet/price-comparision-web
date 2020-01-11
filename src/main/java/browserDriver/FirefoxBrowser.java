package browserDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements BrowserFactory {

    @Override
    public WebDriver getDriver() {
        setBinaryPath();
        return new FirefoxDriver();
    }

    @Override
    public void setBinaryPath() {
        WebDriverManager.firefoxdriver().setup();
    }
}
