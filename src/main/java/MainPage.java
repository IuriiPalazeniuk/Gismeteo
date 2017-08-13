import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Acer on 13.08.2017.
 */
public class MainPage extends PageObject{

    private String tempVin = ".//*[@id='cities-teaser']/div[1]/ul[1]/li[4]/a";
    private String tempKiev = ".//*[@id='cities-teaser']/div[1]/ul[1]/li[1]/a";
    private String tempLviv = ".//*[@id='cities1']/div/ul[2]/li[2]/a";
    private String tempDonetsk = ".//*[@id='cities-teaser']/div[1]/ul[2]/li[2]/a";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public TemperatureVinnitsa openPage(){
        driver.findElement(By.xpath(tempVin)).click();
        return new TemperatureVinnitsa(driver);
    }
    public TemperatureKiev openPage1(){
        driver.findElement(By.xpath(tempKiev)).click();
        return new TemperatureKiev(driver);
    }
    public TemperatureLviv openPage2(){
        driver.findElement(By.xpath(tempLviv)).click();
        return new TemperatureLviv(driver);
    }
    public TemperatureDonetsk openPage3(){
        driver.findElement(By.xpath(tempDonetsk)).click();
        return new TemperatureDonetsk(driver);
    }




}
