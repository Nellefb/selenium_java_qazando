package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;
import support.Utils;

import static support.CommandsTest.clickElement;
import static support.CommandsTest.fillField;

public class CadastroPage extends RunCucumberTest {

    private By createNameField = By.id("user");
    private By createEmailField = By.id("email");
    private By createPasswordField = By.id("password");
    private By cadastrarButton = By.id("btnRegister");
    private By mensagemErro = By.id("errorMessageFirstName");

    public void preencheNome(String name){
        fillField(createNameField, name);
    }
    public void preencheEmail(String email){
        fillField(createEmailField, email);
    }
    public void preenchePassword(String password){
        fillField(createPasswordField, password);
    }
    public void cadastrarUsuario(){
        clickElement(cadastrarButton);
    }

    public void verificaCampo(String message){
        String msgInvalida = getDriver().findElement(mensagemErro).getText();
        Assert.assertEquals(message, msgInvalida);
    }



}
