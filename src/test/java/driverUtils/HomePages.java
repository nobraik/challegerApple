package driverUtils;

import org.openqa.selenium.By;

public class HomePages extends DriversFectory {

   public void chooseCategory(String product){

       String productselectend = product.toLowerCase();

       driver.findElement(By.xpath("//ul[@class='ac-gn-list']//a[@data-analytics-title='" + productselectend + "']")).click();
   }

}
