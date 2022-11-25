package driverUtils.pages;

import driverUtils.DriversFectory;
import org.openqa.selenium.By;

public class productpage {

    public void chooseProductMacPage(String product) {

        if (product.equalsIgnoreCase("iphone14 pro")) {
product = "iphone-14-pro";

        }
        if (product.equalsIgnoreCase("Macbook pro")) {
        product = "macbook-pro";

        }


        if (product.equalsIgnoreCase("Macbook air")) {
product = "macbook - air";

        }
        if (product.equalsIgnoreCase("Imac 24")){
           product = "imac-24";

        }
        // drop Off method click
        DriversFectory.driver.findElement(By.xpath("//a[@href='/" + product + "/']")).click();




    }
}