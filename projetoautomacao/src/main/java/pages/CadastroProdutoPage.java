package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class CadastroProdutoPage extends BasePage{
    @FindBy(id = "txt01")
    private WebElement txNomeProduto;
    @FindBy(id = "categoria")
    private WebElement selCategoriaProduto;
    @FindBy(id = "venda")
    private WebElement selCanalVenda;
    @FindBy(id = "txt02")
    private WebElement txEstoqueMinimo;
    @FindBy(xpath = "/html/body/div/form/fieldset/div[5]/input")
    private WebElement txEstoqueMaximo;
    @FindBy(id = "sim")
    private WebElement rdSim;
    @FindBy(name = "nao")
    private WebElement rdNao;
    @FindBy(xpath = "/html/body/div/form/div[3]")
    private WebElement checkUnidade;
    @FindBy(xpath = "/html/body/div/form/div[4]")
    private WebElement checkCaixa;
    @FindBy(xpath = "/html/body/div/form/div[5]")
    private WebElement checkPacote;
    @FindBy(xpath = "/html/body/div/form/div[6]")
    private WebElement checkDuzia;
    @FindBy(id = "elementosForm:cadastrar")
    private WebElement btnCadastrar;
    @FindBy(linkText = "google")
    private WebElement linkGoogle;
    @FindBy(partialLinkText = "GZH")
    private WebElement linkZh;
    public CadastroProdutoPage(WebDriver driver) {
        super(driver);
    }

    public CadastroProdutoPage selecionarVendaImediataSim() {

        rdSim.click();
        return this;

    }
    public CadastroProdutoPage clicarCadastrar(){

        btnCadastrar.click();
        return this;

    }
    public String buscarResultadoCadastro() {
        return driver.getPageSource();

    }
    public CadastroProdutoPage informarNomeProduto (String nome){
        txNomeProduto.sendKeys(nome);
        return this;
    }
    public CadastroProdutoPage selecionarCategoria(String categoria) {

        Select dropdown = new Select(selCategoriaProduto);
        dropdown.selectByVisibleText(categoria);
        return this;

    }


    public CadastroProdutoPage selecionarCanalVenda (String canal1, String
            canal2, String canal3){

        Select dropdown = new Select(selCanalVenda);
        dropdown.selectByVisibleText(canal1);
        dropdown.selectByVisibleText(canal2);
        dropdown.selectByVisibleText(canal3);
        return this;

    }

    public CadastroProdutoPage informarEstoqueMinimo (String estoqueMin){
        txEstoqueMinimo.sendKeys(estoqueMin);
        return this;
    }
    public CadastroProdutoPage informarEstoqueMaximo (String estoqueMax){
        txEstoqueMaximo.sendKeys(estoqueMax);
        return this;
    }

    public CadastroProdutoPage selecionarVendaInediataSim() {
        rdSim.click();
        return this;
    }
    public CadastroProdutoPage selecionarFormaCaixa() {
        checkCaixa.click();
        return this;
    }
    public CadastroProdutoPage selecionarFormaUnidade() {
        checkUnidade.click();
        return this;
    }



}