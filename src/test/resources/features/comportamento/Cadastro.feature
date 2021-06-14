#coding:utf-8
#language: pt

@Plan_Id=1
@Qa_Suite_Id=4   # Id do suite de teste no azure para regressão da suite de teste de qa>
@Hom_Suite_Id=4   #<Id do suite de teste no azure para regressão da suite de teste de homologação>
@Des_Suite_Id=3

Funcionalidade: Cadastro

  Contexto:
    Dado que eu seja um usuario novo

  @Test_Id=4
  Cenario: Criar cadastro
    Quando eu acessar o site do seu barriga e clicar em Nâo tenho cadastro
    Entao Serei redirecionado para página de cadastro efetuarei o cadastro


