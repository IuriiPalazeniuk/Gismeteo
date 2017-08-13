import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Acer on 13.08.2017.
 */
public class TemperatureDonetsk extends PageObject{
    public TemperatureDonetsk(WebDriver driver) {
        super(driver);
    }

    String temp1 = ".//div[@class='temp']/dd[1]";
    String tempInDonetsk = "//h1[@class='wtitle']";

    public void getTempDonetsk(){
        String temp = driver.findElement(By.xpath(temp1)).getText();
        System.out.print("Temperature in Donetsk: " + temp);
    }


    public boolean isElementPresent() {
        return isElementPresent(By.xpath(tempInDonetsk));
    }
}
