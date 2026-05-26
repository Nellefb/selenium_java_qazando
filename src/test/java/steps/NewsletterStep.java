package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class NewsletterStep extends RunCucumberTest {

    HomePage homePage = new HomePage();

    @Dado("que estou no site da Qazando")
    public void acessar_site_qazando() {
        homePage.acessarAplicacao();
    }

    @Quando("eu preencher meu e-mail na newsletter")
    public void eu_preencher_meu_e_mail_na_newsletter() throws InterruptedException {
        homePage.scroll();
        homePage.preencherEmail();
    }

    @Quando("clicar em Send Mail")
    public void clicar_em_send_mail() {
        homePage.clickSendMail();
    }

    @Então("eu vejo a mensagem de sucesso")
    public void eu_vejo_a_mensagem_de_sucesso() {
        homePage.verificarMensagemSucesso();
    }
}
