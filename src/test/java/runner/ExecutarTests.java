package runner;

import driverUtils.DriversFectory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/driverUtils/features",
        glue = "steps",
        tags = "@iphone",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-report.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class executarTests extends DriversFectory {

    public void BeginTest() {
        String browser = ("chrome");
        if (browser.contains("chrome")) {
            System.out.println(" you are opening the browser"+browser);
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--disable.gpu");
           chromeOptions.addArguments("window-size=1000,500");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println(" you are opening the browser"+browser);
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--start-maximized");
            driver = new FirefoxDriver(firefoxOptions);

        }
actionBroswers();

    }
}
