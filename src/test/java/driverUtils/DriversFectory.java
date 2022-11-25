package driverUtils;

import org.openqa.selenium.WebDriver;

public class DriversFectory {
 public static WebDriver driver;

 public static void actionBroswers(){
  String sitebase=("https://www.apple.com/");
  driver.manage().window().maximize();
  driver.get(sitebase);


 }


}
