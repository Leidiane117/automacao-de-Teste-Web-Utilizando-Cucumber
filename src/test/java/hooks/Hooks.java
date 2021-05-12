package hooks;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Hooks {
    @Before
    public void configurarNavegador() {
        WebDriverManager.chromedriver().setup();// webdrivermanage framework que gerencia meu arquivo executavel do browser
        Driver.setDriver(new ChromeDriver()); // instanciando um novo objeto
        Driver.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);// espera implícita para evitar que o webdriver não encontre algum elemento, a cada 5 segundos ele verifica se o elemento apareceu.
        Driver.getDriver().manage().window().maximize();//abrir com a tela maximinizada
        Driver.getDriver().get("https://seubarriga.wcaquino.me/login");
        //
    }

    @After
    public void fecharNavegador(){
        Driver.getDriver().close();


    }

}