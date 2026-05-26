package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.RunCucumberTest;
import support.CommandsTest;
import support.Utils;

import static support.CommandsTest.*;

public class HomePage extends RunCucumberTest {

    private String URL = "https://automationpratice.com.br/";
    private By botaoAcessarCadastro = By.className("fa-lock");
    private By botaoAcessarLogin = By.className("fa-user");
    private By campoEmail = By.className("form-control");
    private By btnSendMail = By.cssSelector(".clear > button");

    public void acessarAplicacao(){
        getDriver(System.getProperty("browser")).get(URL);
        esperarElementoClicavel(By.className("top_header_left"), 10);
        Assert.assertEquals( "Não acessou a aplicação",true,getDriver().findElement(By.className("top_header_left")).isDisplayed());
    }

    public void acessarCadastroPage(){
        acessarAplicacao();
        clickElement(botaoAcessarCadastro);
        esperarElementoVisivel(By.id("login_area"), 10);
    }

    public void acessarLoginPage(){
        acessarAplicacao();
        clickElement(botaoAcessarLogin);
        esperarElementoVisivel(By.id("user"), 10);
    }

    public void scroll() throws InterruptedException {
        Utils.scrollDown();
    }

    public void preencherEmail(){
        fillField(campoEmail, "nala@gmail.com" );
    }

    public void clickSendMail(){
        clickElement(btnSendMail);
    }

    public void verificarMensagemSucesso(){
        WebElement mensagem = esperarElementoVisivel(By.id("swal2-title"), 10);
        String mensagem_sucesso = mensagem.getText();
        Assert.assertEquals( "Não aparreceu","Success", mensagem_sucesso);

    }




//Código desconto (pagina 404)
    /*public void acessarAplicacao(){
        driver.get("https://qazando.com.br/curso.html");
        esperarElementoEstarPresente(By.id("btn-ver-cursos"), 10);
        Assert.assertEquals( "Não acessou a aplicação",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void preencherEmail(){
        driver.findElement(By.id("email")).sendKeys("nala@gmail.com");
    }

    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }

    public void verificarCupomDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals( "O Cupom está errado","QAZANDO15OFF", texto_cupom);

    }*/
}
