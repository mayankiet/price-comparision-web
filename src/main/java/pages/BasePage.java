package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
}
