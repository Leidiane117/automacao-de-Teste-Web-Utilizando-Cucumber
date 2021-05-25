package steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import pageObjects.CadastroPage;

public class CadastroStep {


    CadastroPage cadastro;


    @Dado("^que eu seja um usuario novo$")
    public void que_eu_seja_um_usuario_novo() throws Throwable {
        cadastro = new CadastroPage();// Write code here that turns the phrase above into concrete actions

    }

    @Quando("^eu acessar o site do seu barriga e clicar em Nâo tenho cadastro$")
    public void eu_acessar_o_site_do_seu_barriga_e_clicar_em_Nâo_tenho_cadastro() throws Throwable {
        cadastro.redirecionar(); // Write code here that turns the phrase above into concrete actions

    }

    @Entao("^Serei redirecionado para página de cadastro efetuarei o cadastro$")
    public void serei_redirecionado_para_página_de_cadastro() throws Throwable {
        cadastro.cadastrarNovoUsuario();

    }
}

