package pages;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;
import support.CommandsTest;
import support.ScreenshotUtils;
import support.Utils;

import static support.CommandsTest.checkMessage;

public class PainelPage extends RunCucumberTest {

    private By mensagemSucesso = By.id("swal2-title");
    private By dadoMensagemSucesso = By.id("swal2-html-container");

    public void validarMensagemCadastro(String nome){
        checkMessage(mensagemSucesso, "Cadastro realizado!" );
        WebElement nome_mensagem = getDriver().findElement(dadoMensagemSucesso);
        String nome_sucesso = nome_mensagem.getText();
        Assert.assertEquals( "Não apareceu","Bem-vindo " + nome, nome_sucesso);
    }

    public void  validarMensagemLogin(String email){
        checkMessage(mensagemSucesso, "Login realizado" );
        WebElement emailMensagem = getDriver().findElement(dadoMensagemSucesso);
        String email_text = emailMensagem.getText();
        Assert.assertEquals( "Não apareceu","Olá, " + email, email_text);
    }

}
