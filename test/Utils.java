import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    private static final String configFile = "config.properties";
    static WebDriver driver;
    public static WebDriver getDriver() {

        Properties configProps = new Properties();
        String browser = "";

        try {
            configProps.load(new FileInputStream(configFile));
            browser = configProps.getProperty("browser");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        switch(browser) {
            case "chrome": {
                driver = new ChromeDriver();
            }
            case "firefox":
            {
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }
}
