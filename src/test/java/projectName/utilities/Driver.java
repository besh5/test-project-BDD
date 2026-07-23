package projectName.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //create a private constructor
    private Driver() {

    }

    //We make a WebDriver private because we want to close access from outside.
    //We are making it static because we will use it in a static method.
    private static WebDriver driver;


    //Create a reusable utility method which will return the same driver instance once we call it.
    //If an instance doesn't exist, it will create first, and then it will always return the same instance.
    public static WebDriver getDriver() {

        if (driver == null) {

            //We will read our browser type from the .properties file
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType.toLowerCase()) {
                case "chrome" -> {
                    driver = new ChromeDriver();
                }
                case "firefox" -> {
                    driver = new FirefoxDriver();
                }
                default -> {
                    System.err.println("Not accepted browser type.");
                    System.err.println("Either that browser not exist or not currently supported");

                    //driver = null;

                }
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;

    }

    //
    public static void closeDriver() {

        if (driver != null) {
            //this line will terminate a currently existed driver completely. It will not exist going forward;
            driver.quit();
            //assign a value back to null so my "singleton" can create a newer one if needed
            driver = null;
        }

    }
}
