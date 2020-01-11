package pages;

import drivers.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FlipkartProductsPage extends BasePage {

    @FindBy(css = "._3wU53n")
    private WebElement products;

    @FindBy(className = "_1vC4OE")
    private WebElement price;

    public FlipkartProductsPage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void verifyIPhoneWrtSearchOnFlipkart() {
        Assert.assertTrue(products.getText().contains("iPhone XR (64GB) - Yellow"));
    }

    public String getIPhonePriceOnFlipkart() {
        String priceOnFlipkart = price.getText();
        System.out.println(priceOnFlipkart);
        return priceOnFlipkart;
    }

    public void comparePrice(String priceAmazon, String priceFlipkart){
        int amazonPrice = Integer.parseInt(priceAmazon);
        int flipkartPrice = Integer.parseInt(priceFlipkart);

        if(amazonPrice<flipkartPrice){
            System.out.println(amazonPrice);
        }
        else {
            System.out.println(flipkartPrice);
        }
    }
}