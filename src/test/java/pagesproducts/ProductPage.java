package pages;

import org.openqa.selenium.By;

import static driverUtils.DriversFectory.driver;

public class ProductPage {


    public void selecionarProdutoMacPage(String produto) {



        if (produto.equalsIgnoreCase("iphone 14 pro")) {
            produto = "iphone-14-pro";
        }

        if (produto.equalsIgnoreCase("Macbook pro")) {
            produto = "macbook-pro";
        }

        if (produto.equalsIgnoreCase("Macbook air")) {
            produto = "macbook-air";
        }

        if (produto.equalsIgnoreCase("Imac 24")) {
            produto = "imac-24";
        }


        driver.findElement(By.xpath("//a[@href='/"+produto+"/']")).click();

    }

}


