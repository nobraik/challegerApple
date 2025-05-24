package pagesElementsWEB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPage {

    WebDriver driver;

    // Constructor para inicializar os elementos
    public WebPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ----- Elementos Gerais -----

    @FindBy(xpath = "(//a[text()='Buy'])[1]")
    public WebElement btnBuy;
    @FindBy(xpath = "//span[text()='14-inch']")
    public WebElement typeTela;
    @FindBy(xpath = "(//img[@height='32'])[6]")
    public WebElement bollSelectcolor;
    @FindBy(css = "button[data-autom='proceed-14inch-better']")
    public WebElement btnSelect;
    @FindBy(xpath = "//button[text()='Add to Bag']")
    public WebElement btnAddBag;
    @FindBy(xpath = "//button[text()='Review Bag']")
    public WebElement reviewBtn;

    // ----- Elementos iPhone -----

    @FindBy(xpath = "(//span[@class='row'])[2]")
    public WebElement btnTipoIphone;
    @FindBy(xpath = "(//img[@class='colornav-swatch'])[1]")
    public WebElement btnColor;
    @FindBy(xpath = "(//span[@class='column form-selector-left-col rf-bfe-selector-left-col'])[4]")
    public WebElement storege2;
    @FindBy(xpath = "//span[text()='No trade-in']")
    public WebElement selectNoTrade;
    @FindBy(xpath = "(//label[@class='form-selector-label rf-po-bfe-dimension-base-label'])[1]")
    public WebElement buyOption;
    @FindBy(xpath = "(//label[@class='form-selector-label'])[12]")
    public WebElement connectCarrinho;
    @FindBy(xpath = "(//span[text()='No AppleCare+ coverage'])[2]")
    public WebElement noApplecare;
    @FindBy(xpath = "(//span[text()='Add to Bag'])[1]")
    public WebElement addBtnBag;
    @FindBy(xpath = "//button[text()='Review Bag']")
    public WebElement reviewBag;
}













