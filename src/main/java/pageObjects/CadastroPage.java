package pageObjects;
import com.github.javafaker.Faker;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;

public class CadastroPage extends Driver {

    By buttonNovoUsuario = By.xpath("//a[contains(text(),'Novo usuário?')]");
    By inputNome = By.id("nome");
    By inputEmail= By.id("email");
    By inputSenha= By.id("senha");
    By buttonCadastrar= By.xpath("//input[@type='submit']");


    Faker faker = new Faker(new Locale("pt-BR"));
    String nome= faker.name().name();
    String email= faker.internet().emailAddress();
    String senha= faker.internet().password(4,6); // senha com mínimo 3 caracteres e no máximo 5



    public void redirecionar(){

        getDriver().findElement(buttonNovoUsuario).click();
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='jumbotron col-lg-4']")));
    }

    public void cadastrarNovoUsuario(){
        getDriver().findElement(inputNome).sendKeys(nome);
        getDriver().findElement(inputEmail).sendKeys(email);
        getDriver().findElement(inputSenha).sendKeys(senha);
        getDriver().findElement(buttonCadastrar).click();
        WebDriverWait wait = new WebDriverWait(getDriver(),30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success']")));

    }


}