package pagesproducts;


import org.openqa.selenium.By;

import static driverUtils.DriversFectory.driver;

public class ProductPage {


    public void selecionarProdutoMacPage(String produto) {


        if (produto.equalsIgnoreCase("iphone 14 pro")) {
            produto = "iphone-14-pro";
        }
        if (produto.equalsIgnoreCase("iphone 14")) {
            produto = "iphone-14";
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


        driver.findElement(By.xpath("//a[@href='/" + produto + "/']")).click();




    }

    public  void selecionarIphoneSeEmDiante(String Product) {
        if (Product.equalsIgnoreCase("iPhone 13")) {
            Product = "iPhone 13";

        }
        if (Product.equalsIgnoreCase("iPhone 12")) {
            Product = "iPhone 12";

        }
        if (Product.equalsIgnoreCase("iPhone SE")) {
            Product = "iPhone SE";


        }
        driver.findElement(By.xpath("(//span[text()='"+Product+"'])[1]")).click();
    }
}
