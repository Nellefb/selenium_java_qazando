package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;

public class CommandsTest extends RunCucumberTest {

    public static void clickElement(By element){
        try {
            System.out.println("Vai clicar no elemento : " + element);
            esperarElementoVisivel(element, 10);
            getDriver().findElement(element).click();
            System.out.println("Clicou no elemento : " + element);
        } catch (Exception error){
            System.out.println("Aconteceu um erro ao tentar clicar no elemento: " + element);
            new Exception(error);
        }
    }


    public static void fillField(By element, String value){
        try {
            System.out.println("Vai preencher o campo : " + element);
            esperarElementoVisivel(element, 10);
            getDriver().findElement(element).sendKeys(value);
            System.out.println("Preencheu o campo : " + element);
        } catch (Exception error){
            System.out.println("Aconteceu um erro ao tentar preencher o campo : " + element);
            new Exception(error);
        }
    }

    public static void esperarElementoClicavel(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement esperarElementoVisivel(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void checkMessage(By element, String expectedMessage){
        esperarElementoVisivel(element, 10);
        String actualMessage = getDriver().findElement(element).getText();
        Assert.assertEquals("Erro ao validar mensagem", expectedMessage, actualMessage);
    }
}
