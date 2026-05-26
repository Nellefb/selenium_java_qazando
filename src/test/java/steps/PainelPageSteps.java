package steps;

import io.cucumber.java.pt.Entao;
import pages.PainelPage;
import runner.RunCucumberTest;

public class PainelPageSteps extends RunCucumberTest {

    LoginSteps loginSteps = new LoginSteps();
    CadastroSteps cadastroSteps = new CadastroSteps();
    PainelPage painelPage = new PainelPage();

    @Entao("vejo a mensagem de cadastro realizado com sucesso")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {
        painelPage.validarMensagemCadastro(cadastroSteps.nome);
    }

    @Entao("vejo a mensagem de login realizado com sucesso")
    public void vejo_a_mensagem_de_login_realizado_com_sucesso() {
        painelPage.validarMensagemLogin(loginSteps.email);
    }
}
