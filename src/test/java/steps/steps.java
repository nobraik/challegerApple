package steps;


import driverUtils.HomePages;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import runner.ExecutarTests;

public class steps {
HomePages homePage = new HomePages();
ProductPage productPage = new ProductPage();
ExecutarTests tests = new ExecutarTests();
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
    productPage.selecionarProdutoMacPage("ipad");

    }
    @Given("selecionar macbook13")
    public void selecionarMacbook13() {

    }
    @Given("clicar em select")
    public void clicarEmSelect() {

    }
    @Given("clicar em add to bag")
    public void clicarEmAddToBag() {

    }
    @When("clicar em review bag")
    public void clicarEmReviewBag() {

    }
    @Then("produto adicionado na bag")
    public void produtoAdicionadoNaBag() {

    }

}
