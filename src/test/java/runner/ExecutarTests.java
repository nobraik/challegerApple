package runner;

import driverUtils.DriversFectory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps",
        tags = "@addproducts",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-report.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class ExecutarTests extends DriversFectory {

    public void BeginTest() {
        String browser = ("chrome");
        if (browser.contains("chrome")) {
            System.out.println(" you are openning the browser"+browser);
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            driver = new ChromeDriver(chromeOptions);

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println(" you are openning the browser"+browser);
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--start-maximizend");
            driver = new FirefoxDriver(firefoxOptions);

        }
actionBroswers();
    }
}
