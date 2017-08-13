import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Acer on 13.08.2017.
 */
public class TemperatureVinnitsa extends PageObject{

    String temp1 = ".//div[@class='temp']/dd[1]";
    String tempInVin = "//h1[@class='wtitle']";

    public TemperatureVinnitsa(WebDriver driver) {
        super(driver);
    }

    public void getTempVin(){
        String temp = driver.findElement(By.xpath(temp1)).getText();
        System.out.print("Temperature in Vinnitsa: " + temp);
    }


    public boolean isElementPresent() {
        return isElementPresent(By.xpath(tempInVin));
    }
}
