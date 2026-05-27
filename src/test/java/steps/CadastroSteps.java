package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroPage;
import pages.HomePage;
import runner.RunCucumberTest;
import support.ScreenshotUtils;

public class CadastroSteps extends RunCucumberTest {

    HomePage homePage;
    CadastroPage cadastroPage;
    public static String nome;


    @Dado("que estou na tela de cadastro")
    public void que_estou_na_tela_de_cadastro() {
        homePage = new HomePage();
        homePage.acessarCadastroPage();
        cadastroPage = new CadastroPage();
    }

    @Quando("eu preencho o formulario de cadastro com nome {string} email {string} e senha {string}")
    public void eu_preencho_todo_o_formulario_de_cadastro(String nomeGherkin, String emailGherkin, String senhaGherkin) {
        nome = nomeGherkin;
        cadastroPage.preencheNome(nomeGherkin);
        cadastroPage.preencheEmail(emailGherkin);
        cadastroPage.preenchePassword(senhaGherkin);
    }

    @Quando("clico em cadastrar")
    public void clico_em_cadastrar() {
        cadastroPage.cadastrarUsuario();
    }

    @Entao("vejo a mensagem de {string} de campo inválido")
    public void vejo_a_mensagem_de_de_campo_inválido(String message) {
        cadastroPage.verificaCampo(message);
    }

    @After
    public void afterScenario(Scenario scenario){
        ScreenshotUtils.addScreenshotOnScenario(scenario);
    }
}

