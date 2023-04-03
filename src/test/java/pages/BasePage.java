package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "https://www.zara.com/ro/en/";
        driver.get(url);

        LOG.info("Open browser maximmize");
        driver.manage().window().maximize();
//        Dimension dimension = new Dimension(1366, 768);
//        driver.manage().window().setSize(dimension);
    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static String returnBaseUrl() {
        return "https://www.zara.com/ro/en/";
    }

    public static String getBaseUrl() {
        String baseUrl = returnBaseUrl();
        if (baseUrl != null) {
            return baseUrl.replace("Index.html", "");
        }
        return baseUrl;

    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

