# Automacao de Teste para Web utilizando cucumber🥒

Projeto desenvolvido com proposito de ser um modelo base para teste para interface web

## PRÉ-REQUISITOS

Requisitos de software e hardware necessários para executar este projeto de automação

*   Java 1.8 JDK
*   Maven 3.5.*
*   Navegador Web (Chrome, Opera, FireFox, Edge ou Safari)
*   Intellij IDE
*   Plugins do Intellij
    * Cumcuber for java
    
## ESTRUTURA DO PROJETO

| Diretório                    	| Finalidade       	                                                                                        | 
|------------------------------	|---------------------------------------------------------------------------------------------------------- |
| src\main\java\driver 			| Responsável por fabricar os drivers para rodar local e remoto para varios navegadores                    	|
| src\main\java\pagesObjects			| Local onde deve ser criado as pages objects para facilitar a manutenção do projeto                       	|
| src\main\java\report			| Metodo responsável pela criação de screenshot anexada no Report Alure                                		|
| src\test\java\hooks          	| Metodos que executam antes e depois de cada teste (@Before, @After)                                   	|
| src\test\java\runner         	| Metodo prinicipal que inicia os testes via cucumber                                                      	|
| src\test\java\steps         	| Local onde deve ser criado as classes que representam os steps definition do cucumber                    	|
| src\test\resources\features 	| Funcionalidade e cenários de teste escritos em linguagem DSL (Gherkin language)                        	|   


## FRAMEWORKS UTILIZADOS

* Selenium - Responsável pela interação com páginas web
* Cucumber - Responsável pela especificação executável de cenários
* Cucumber Junit - Responsável por validar as condições de teste

 
