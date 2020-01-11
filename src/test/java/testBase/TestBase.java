package testBase;

import drivers.DriverInitializer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import pages.AmazonHomePage;
import pages.AmazonProductsPage;
import pages.FlipkartHomePage;
import pages.FlipkartProductsPage;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected ConfigReader configReader;
    protected AmazonHomePage amazonHomePage;
    protected AmazonProductsPage amazonProductsPage;
    protected FlipkartHomePage flipkartHomePage;
    protected FlipkartProductsPage flipkartProductsPage;
    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new DriverInitializer("chrome").init();
        amazonHomePage = new AmazonHomePage();
        amazonProductsPage = new AmazonProductsPage();
        flipkartHomePage = new FlipkartHomePage();
        flipkartProductsPage = new FlipkartProductsPage();
        configReader = new ConfigReader();
    }

    public void navigateToAmazon() {
        driver.get(configReader.getAmazonUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void navigateToFlipkart() {
        driver.get(configReader.getFlipkartUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

   // @AfterMethod
    public void quitBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
}
