$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Cadastro.feature");
formatter.feature({
  "name": "Cadastro",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu seja um usuario novo",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroStep.que_eu_seja_um_usuario_novo()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Criar cadastro",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "eu acessar o site do seu barriga e clicar em Nâo tenho cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroStep.eu_acessar_o_site_do_seu_barriga_e_clicar_em_Nâo_tenho_cadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Serei redirecionado para página de cadastro efetuarei o cadastro",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroStep.serei_redirecionado_para_página_de_cadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/Conta.feature");
formatter.feature({
  "name": "Criar conta",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Que eu já seja um usuário cadastrado e deseje cadastrar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "ContaStep.queEuJáSejaUmUsuárioCadastradoEDesejeCadastrarUmaConta()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar uma conta",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "Eu clicar no botão cadastrar conta",
  "keyword": "Quando "
});
formatter.match({
  "location": "ContaStep.euClicarNoBotãoCadastrarConta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Serei redirecionado para página de cadastro efetuarei o cadastro de uma conta",
  "keyword": "Então "
});
formatter.match({
  "location": "ContaStep.sereiRedirecionadoParaPáginaDeCadastroEfetuareiOCadastroDeUmaConta()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});