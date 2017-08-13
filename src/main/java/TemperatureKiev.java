import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Acer on 13.08.2017.
 */
public class TemperatureKiev extends PageObject{
    String temp1 = ".//div[@class='temp']/dd[1]";
    String tempInKiev = "//h1[@class='wtitle']";

    public TemperatureKiev(WebDriver driver) {
        super(driver);
    }

    public void getTempKiev(){
        String temp = driver.findElement(By.xpath(temp1)).getText();
        System.out.print("Temperature in Kiev: " + temp);
    }


    public boolean isElementPresent() {
        return isElementPresent(By.xpath(tempInKiev));
    }

}
