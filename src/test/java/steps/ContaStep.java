package steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.CriarContaPage;

public class ContaStep {
    CriarContaPage conta;


    @Dado("Que eu já seja um usuário cadastrado e deseje cadastrar uma conta")
    public void queEuJáSejaUmUsuárioCadastradoEDesejeCadastrarUmaConta() throws Throwable {
    conta = new CriarContaPage();
    }

    @Quando("Eu clicar no botão cadastrar conta")
    public void euClicarNoBotãoCadastrarConta() throws Throwable {
    conta.entrar();
    }

    @Então("Serei redirecionado para página de cadastro efetuarei o cadastro de uma conta")
    public void sereiRedirecionadoParaPáginaDeCadastroEfetuareiOCadastroDeUmaConta() throws Throwable {
    conta.criarConta();
    System.out.print("TESTE @ OK");
    }
}
