import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Lenovo on 9/2/2016.
 */
public class exampleTest {

    public static final String URL_SL = "http://" + "kalelevla" + ":" + "b812aa06-4521-469b-a4bc-8c82370faaa8" + "@ondemand.saucelabs.com:80/wd/hub";
    WebDriver driver;


    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "34.0");

        caps.setCapability("screenSesoltion", "1920x1080");
        caps.setCapability("passed", "true");
        caps.setCapability("name", "OnlinerTest");
        driver = new RemoteWebDriver(new URL(URL_SL), caps);
        caps.setCapability("seleniumVersion", "2.33.0");
    }

    @Test
    public void exampleFirstTest() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.onliner.by/");

        driver.findElement(By.id("currency-informer")).click();
        Thread.sleep(5000);
        driver.quit();


    }

}
