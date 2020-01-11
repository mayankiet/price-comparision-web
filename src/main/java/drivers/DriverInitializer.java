package drivers;

import browserDriver.ChromeBrowser;
import browserDriver.FirefoxBrowser;
import org.openqa.selenium.WebDriver;
import utils.Browsers;

public class DriverInitializer {

    private String browser;

    public DriverInitializer(String browser) {
        this.browser = browser;
    }

    public WebDriver init() throws Exception {

        WebDriver webDriver = null;

        if (Browsers.FIREFOX.equals(browser)) {
            webDriver = new FirefoxBrowser().getDriver();
        }

        if(Browsers.CHROME.equals(browser)){
            webDriver = new ChromeBrowser().getDriver();
        }
        DriverProvider.setDriver(webDriver);
        return webDriver;
    }


}
