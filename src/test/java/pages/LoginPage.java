package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;

import static support.CommandsTest.*;

public class LoginPage extends RunCucumberTest {

    private By emailField = By.id("user");
    private By passwordField = By.id("password");
    private By loginButton = By.id("btnLogin");
    private By mensagemInvalida = By.className("invalid_input");

    public void preencherEmail(String email) {
        fillField(emailField, email);
    }

    public  void preencherPassword(String senha){
        fillField(passwordField, senha);
    }

    public void logar(){
        clickElement(loginButton);
    }

    public void verificaCampoVazio(String message){
        checkMessage(mensagemInvalida, message);
    }
}
