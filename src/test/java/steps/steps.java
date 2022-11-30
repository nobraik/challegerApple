package steps;


import driverUtils.HomePages;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import methods.MethodsWeb;

import pagesElementsElements.Web;
import pagesproducts.ProductPage;
import runner.executarTests;


import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;


public class steps  {
   Web el = new Web();
   MethodsWeb methodsWeb = new MethodsWeb();
HomePages homePage = new HomePages();
ProductPage productPage = new ProductPage();
executarTests tests = new executarTests();
@Before
public void startOfHere(){
tests.BeginTest();



}
    @Given("que selecione Mac na home")
    public void queSelecioneMacNaHome() {
    homePage.chooseCategory("mac");

    }
    @Given("clicar em Macbook pro")
    public void clicarEmMacbookPro() {
    productPage.selecionarProdutoMacPage("Macbook Pro");

    }
    @Given("selecionar macbook13")
    public void selecionarMacbook13()  {
    methodsWeb.btnBuyProduct(el.btnBuy);
    methodsWeb.btnBuyProduct(el.typeTela);
     methodsWeb.scrollPage(0,600);
     methodsWeb.waitElement(el.bollSelectcolor);

    }
    @Given("clicar em select")
    public void clicarEmSelect() {
    methodsWeb.scrollPage(0,800);
methodsWeb.btnBuyProduct(el.btnselect);

    }
    @Given("clicar em add to bag")
    public void clicarEmAddToBag() {
      methodsWeb.btnBuyProduct(el.bntaddBag);

    }
    @When("clicar em review bag")
    public void clicarEmReviewBag() {
        methodsWeb.btnBuyProduct(el.reviewbtn);
    }
    @Then("produto adicionado na bag")
    public void produtoAdicionadoNaBag()  {
    Evidencia.takeScreen("photo product on carrinho");



    }

  ///senario do com iphone

    @Given("que selecione iphone na home")
    public void queSelecioneIphoneNaHome() {
homePage.chooseCategory("iphone");


    }
    @Given("clicar em iphone  pro")
    public void clicarEmIphonePro() {

     productPage.selecionarIphoneSeEmDiante("iPhone 13");
    }
    @Given("selecionar Iphone")
    public void selecionarIphone() {

methodsWeb.btnBuyProduct(el.btntipoiphone);

    }
    @Given("selecionar a cor do aparelho")
    public void selecionarACorDoAparelho()throws Exception  {
       TimeUnit.MILLISECONDS.sleep(2000);
       methodsWeb.waitElement(el.btnColor);

    }
    @Given("clicar em select apos a escolha")
    public void clicarEmSelectAposAEscolha() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(2000);
       methodsWeb.waitElement(el.Storege2);
 TimeUnit.MILLISECONDS.sleep(2000);
        methodsWeb.waitElement(el.SelectNotrade);
        TimeUnit.MILLISECONDS.sleep(2000);
        methodsWeb.waitElement(el.BuyOption);
        TimeUnit.MILLISECONDS.sleep(2000);
       methodsWeb.waitElement(el.connectcarrinho);
      TimeUnit.MILLISECONDS.sleep(2000);
     methodsWeb.waitElement(el.noApplecare);

    }
    @Given("clicar em add to bag de produtos")
    public void clicarEmAddToBagDeProdutos() {

    methodsWeb.waitElement(el.addbtnBag);

    }
    @When("clicar em review bag de produto")
    public void clicarEmReviewBagDeProduto() {
        methodsWeb.waitElement(el.ReviewBag);
    }
    @Then("produto adicionado na bag com sucesso")
    public void produtoAdicionadoNaBagComSucesso() throws InterruptedException {
methodsWeb.asercoes();
Evidencia.takeScreen("bag iphone");
        TimeUnit.SECONDS.sleep(1);
methodsWeb.encerrarTest();
    }



}
