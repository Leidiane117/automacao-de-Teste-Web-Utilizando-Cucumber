package pageObjects;
import com.github.javafaker.Faker;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Locale;

public class MovPage extends Driver {
    By email= By.id("email");
    By senha= By.id("senha");
    By button= By.xpath("//button[contains(text(),'Entrar')]");


    By botaoMov = By.xpath("//a[contains(text(),'Criar Movimentação')]");
    By data= By.id("data_transacao");
    By dataPag= By.id("data_pagamento");
    By descricao= By.id("descricao");
    By interessado= By.id("interessado");
    By valor= By.id("valor");
    By radius= By.xpath("//button[contains(text(),'Salvar')]");
    By succes= By.xpath("//div[contains(text(),'Movimentação adicionada com sucesso!')]");



    Faker faker = new  Faker(new Locale("pt-BR"));
    String desC= faker.finance().creditCard();
    String interessaD= faker.artist().name();
    //double valorP= faker.number().randomDouble(2,1,2000);

    public void login() {
        getDriver().findElement(email).sendKeys("leidiane.souza@gft.com");
        getDriver().findElement(senha).sendKeys("123");
        getDriver().findElement(button).click();

    }
    public void cadastrarMov (){

        getDriver().findElement(botaoMov).click();
        WebDriverWait wait = new WebDriverWait(getDriver(),30); // esperar até que apareça a tag formulario na tela
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("form")));
        Select tipo = new Select((getDriver().findElement(By.id("tipo")))); //selecionar a opção tipo
        tipo.selectByIndex(0); //selecionar a primeira opção de acordo com index
        getDriver().findElement(data).sendKeys("26/05/2021");
        getDriver().findElement(dataPag).sendKeys("25/05/2021");
        getDriver().findElement(descricao).sendKeys(desC);
        getDriver().findElement(interessado).sendKeys(interessaD);
        getDriver().findElement(valor).sendKeys("900.00");
        Select conta= new Select((getDriver().findElement(By.id("conta"))));
        conta.selectByIndex(1);// selecionar o index 1
        getDriver().findElement(radius).click();


    }

    public void mensagem(){
        getDriver().findElement(succes);
    }

}


