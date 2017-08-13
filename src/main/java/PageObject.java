import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Acer on 13.08.2017.
 */
public class PageObject {
    WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    public boolean isElementPresent(By by) {
        if (driver.findElements(by).size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
