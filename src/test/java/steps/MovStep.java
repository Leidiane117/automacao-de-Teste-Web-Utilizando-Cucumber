package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.MovPage;

public class MovStep {
    MovPage mov;

    @Dado("Que eu já seja um usuário cadastrado e deseje cadastrar uma movimentação")
    public void queEuJáSejaUmUsuárioCadastradoEDesejeCadastrarUmaMovimentação() throws Throwable  {
       mov= new MovPage();
        mov.login();
    }

    @Quando("Eu clicar no botão cadastrar movimentacao")
    public void euClicarNoBotãoCadastrarMovimentacao() throws Throwable  {
       mov.cadastrarMov();
    }

    @Então("Serei redirecionado para página de cadastro efetuarei o cadastro de uma movimentacao")
    public void sereiRedirecionadoParaPáginaDeCadastroEfetuareiOCadastroDeUmaMovimentacao() throws Throwable {
        mov.mensagem();
    }
}
