import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CadastroProdutoPage;

public class CadastroProdutoTest extends BaseTest {
    @Test
    public void validarCadastro() {
        CadastroProdutoPage page = new CadastroProdutoPage(getDriver());
        String resultadoFinal = page.informarNomeProduto("detergente")
                .selecionarCategoria("Higiene")
                .selecionarCanalVenda("E-Commerce", "Loja Física", "Telefone")
                .informarEstoqueMinimo("5")
                .informarEstoqueMaximo("25")
                .selecionarVendaImediataSim()
                .selecionarFormaCaixa()
                .selecionarFormaUnidade()
                .clicarCadastrar()
                .buscarResultadoCadastro();
        Assert.assertTrue(resultadoFinal.contains("Nome: detergente"));
        Assert.assertTrue(resultadoFinal.contains("Categoria:higiene"));
       // Assert.assertTrue(resultadoFinal.contains("Canais de Venda:E-Commerce, Loja Física, Telefone"));
      //          Assert.assertTrue(resultadoFinal.contains("Estoque Minimo: 5"));
      //  Assert.assertTrue(resultadoFinal.contains("Estoque Máximo: 25"));
      //  Assert.assertTrue(resultadoFinal.contains("Disponibilizar para venda imediata?: sim"));
      //  Assert.assertTrue(resultadoFinal.contains("Formas de Venda: Unidade Caixa"));
    }

}
