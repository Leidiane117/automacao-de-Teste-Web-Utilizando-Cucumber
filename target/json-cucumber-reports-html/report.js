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
});