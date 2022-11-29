package methods;


import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import static driverUtils.DriversFectory.driver;

public class MethodsWeb {

    public void btnBuyProduct(By btnBuy) {
        driver.findElement(btnBuy).click();

    }


    /// move a barra para baixo ou pra cima
    public void scrollPage(int n1, int n2) {
        JavascriptExecutor jsscroll = (JavascriptExecutor) driver;
        jsscroll.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");


    }
        public void waitElement(By elemento){
            WebElement webElement = new WebDriverWait(driver, Duration.ofMillis(1000)).until(ExpectedConditions.elementToBeClickable(elemento));
            webElement.click();


        }
        public void asercoes() {
            String textCapured =    driver.findElement(By.xpath("//h1[text()='Your bag total is $829.00.']")).getText();
            System.out.println(" o texto capturado é "+textCapured);

        }


        @After
        public void encerrarTest() {

            driver.quit();

        }
    }