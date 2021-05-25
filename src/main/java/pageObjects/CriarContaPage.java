package pageObjects;
import com.github.javafaker.Faker;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Locale;


public class CriarContaPage extends Driver {

    By email= By.id("email");
    By senha= By.id("senha");
    By button= By.xpath("//button[contains(text(),'Entrar')]");
    By buttonConta= By.xpath("//body/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]");
    By buttonAdicionar= By.xpath("//a[contains(text(),'Adicionar')]");
    By idNome= By.id("nome");
    By buttonSalvar= By.xpath("//button[contains(text(),'Salvar')]");

    Faker faker = new Faker(new Locale("pt-BR"));
    String nome= faker.name().title();

    public void entrar(){
        getDriver().findElement(email).sendKeys("leidiane.souza@gft.com");
        getDriver().findElement(senha).sendKeys("123");
        getDriver().findElement(button).click();

    }


    public void criarConta(){
    getDriver().findElement(buttonConta).click();
    getDriver().findElement(buttonAdicionar).click();
    getDriver().findElement(idNome).sendKeys(nome);
    getDriver().findElement(buttonSalvar).click();
    WebDriverWait wait = new WebDriverWait(getDriver(),30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Conta adicionada com sucesso!')]")));// colocar espera explicita


    }



}
