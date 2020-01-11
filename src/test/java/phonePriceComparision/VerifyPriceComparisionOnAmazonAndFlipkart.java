package phonePriceComparision;

import annotation.Author;
import annotation.TestCaseNotes;
import annotation.Tester;
import org.testng.annotations.Test;
import testBase.TestBase;

public class VerifyPriceComparisionOnAmazonAndFlipkart extends TestBase {

    String priceOnAmazon;
    String priceOnFlipkart;

    @Author(name = Tester.MAYANK)
    @TestCaseNotes(steps = "1. Go to https://www.amazon.in.\n" +
            "2. Once page is loaded, search for iPhone XR (64GB) - Yellow.\n" +
            "3. Select the matching iPhone once list appears.\n" +
            "4. Get the price of the selected iPhone.\n" +
            "5. Now, go to https://www.flipkart.com/.\n" +
            "6. Repeat steps 2 to 4 and get the price.\n" +
            "7. Compare the price on both the website and determine which website.\n" +
            "has lesser value for the iPhone and print the final result on the console.")
    @Test(priority = 1)
    public void verifyGetIphonePriceFromAmazon(){
        navigateToAmazon();
        amazonHomePage.searchPhone();
        amazonProductsPage.verifyIPhoneWrtSearch();
        priceOnAmazon = amazonProductsPage.getIPhonePrice();
    }


    @Author(name = Tester.MAYANK)
    @TestCaseNotes(steps = "1. Go to https://www.amazon.in.\n" +
            "2. Once page is loaded, search for iPhone XR (64GB) - Yellow.\n" +
            "3. Select the matching iPhone once list appears.\n" +
            "4. Get the price of the selected iPhone.\n" +
            "5. Now, go to https://www.flipkart.com/.\n" +
            "6. Repeat steps 2 to 4 and get the price.\n" +
            "7. Compare the price on both the website and determine which website.\n" +
            "has lesser value for the iPhone and print the final result on the console.")
    @Test(priority = 2)
    public void verifyGetIphonePriceFromFlipkart(){
        navigateToFlipkart();
        flipkartHomePage.searchIPhone();
        flipkartProductsPage.verifyIPhoneWrtSearchOnFlipkart();
        priceOnFlipkart = flipkartProductsPage.getIPhonePriceOnFlipkart();
        
        flipkartProductsPage.comparePrice(priceOnAmazon, priceOnFlipkart);
    }
}

