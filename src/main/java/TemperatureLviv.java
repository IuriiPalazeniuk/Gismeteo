import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Acer on 13.08.2017.
 */
public class TemperatureLviv extends PageObject {

        String temp1 = ".//div[@class='temp']/dd[1]";
        String tempInLviv = "//h1[@class='wtitle']";

        public TemperatureLviv(WebDriver driver) {
            super(driver);
        }

        public void getTempLviv(){
            String temp = driver.findElement(By.xpath(temp1)).getText();
            System.out.print("Temperature in Lviv: " + temp);
        }


        public boolean isElementPresent() {
            return isElementPresent(By.xpath(tempInLviv));
        }

    }



