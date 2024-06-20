import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.googlePage;

public class googlePageTest extends BaseTest {
    @Test
    public void serchGoogle(){
        googlePage page = new googlePage(getDriver());
        String busca = page.informarTxtArea("fadergs").buscarTxtArea();
        String resultadoFinal = page.buscarTxtArea();
        Assert.assertTrue(resultadoFinal.contains("Aproximadamente"));
    }
    @Test
    public void verificarPalavra(){
        googlePage page = new googlePage(getDriver());

    }
}
