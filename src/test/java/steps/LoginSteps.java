package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.LoginPage;
import runner.RunCucumberTest;
import support.Utils;

public class LoginSteps extends RunCucumberTest {

    HomePage homePage;
    LoginPage loginPage;

    public static String email;
    public static String senha;

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        homePage = new HomePage();
        homePage.acessarLoginPage();
        loginPage = new LoginPage();
    }

    @Quando("preencho email e senha")
    public void preencho_email_e_senha() {
        email = Utils.getRandomEmail();
        senha = "123456";
        loginPage.preencherEmail(email);
        loginPage.preencherPassword(senha);
    }

    @Quando("preencho login {string} e senha {string}")
    public void preencho_login_e_senha(String emailGherkin, String senhaGherkin) {
        email = emailGherkin;
        senha = senhaGherkin;
        loginPage.preencherEmail(emailGherkin);
        loginPage.preencherPassword(senhaGherkin);
    }

    @Quando("clico em login")
    public void clico_em_login() {
        loginPage.logar();
    }

    @Entao("vejo a mensagem {string} de campo não preenchido")
    public void vejo_a_mensagem_de_campo_não_preenchido(String message) {
        loginPage.verificaCampoVazio(message);
    }

}
