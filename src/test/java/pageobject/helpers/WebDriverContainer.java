package pageobject.helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageobject.Browsers;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.OPERA;

public class WebDriverContainer {

    private static Logger LOG = Logger.getLogger(WebDriverContainer.class);
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(Platform.WINDOWS);

            switch (browser) {
                case chrome:
                    caps.setBrowserName(CHROME);
                    LOG.info("Instantiating Chrome driver");
                    break;
                case opera:
                    caps.setBrowserName(OPERA);
                    LOG.info("Instantiating Opera driver");
                    break;
            }

//            try {
                driver = new ChromeDriver();
//            } catch (MalformedURLException e) {
//                throw new RuntimeException(e);
//            }
            LOG.info("log1");

            driver.manage().window().maximize();

            LOG.info("log2");
            return driver;
        }
        return driver;
    }

    public static void closeDriver() {
        LOG.debug("Closing driver");
        if (driver != null) {
            driver.quit();
//            driver = null;
        }
    }
}
