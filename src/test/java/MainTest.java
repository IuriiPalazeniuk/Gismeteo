import org.junit.Assert;
import org.junit.Test;


public class MainTest extends BaseTest{

    @Test
    public void temperatureVinnitsa() throws Exception {
        MainPage main = new MainPage(driver);
        TemperatureVinnitsa tempVin = main.openPage();
        tempVin.getTempVin();
        Assert.assertTrue(tempVin.isElementPresent());
    }
    @Test
    public void temperatureKiev(){
        MainPage main = new MainPage(driver);
        TemperatureKiev tempKiev = main.openPage1();
        tempKiev.getTempKiev();
        Assert.assertTrue(tempKiev.isElementPresent());
    }

    @Test
    public void temperatureLviv(){
        MainPage main = new MainPage(driver);
        TemperatureLviv tempLviv = main.openPage2();
        tempLviv.getTempLviv();
        Assert.assertTrue(tempLviv.isElementPresent());
    }

    @Test
    public void temperatureDonetsk(){
        MainPage main = new MainPage(driver);
        TemperatureDonetsk tempDonetsk = main.openPage3();
        tempDonetsk.getTempDonetsk();
        Assert.assertTrue(tempDonetsk.isElementPresent());
    }
}
