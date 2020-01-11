package pages;

import drivers.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class FlipkartProductsPage extends BasePage {

    @FindBy(css = "")
    private List<WebElement> products;

    @FindBy(css = "")
    private List<WebElement> price;

    public FlipkartProductsPage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void verifyIPhoneWrtSearchOnFlipkart() {
        Assert.assertTrue(products.get(0).getText().contains("iPhone XR (64GB) - Yellow"));
        products.get(0).click();
    }

    public String getIPhonePriceOnFlipkart() {
        String priceOnFlipkart = price.get(0).getText();
        System.out.println(priceOnFlipkart);
        return priceOnFlipkart;
    }
}