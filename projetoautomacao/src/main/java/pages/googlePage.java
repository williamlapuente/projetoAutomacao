package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class googlePage extends BasePage {
    public googlePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")
    private WebElement txtArea;

    public String buscarTxtArea() {
        return driver.getPageSource();

    }
    public googlePage informarTxtArea (String nome){
        txtArea.sendKeys(nome);
        txtArea.sendKeys(Keys.ENTER);
        return this;
    }

}
