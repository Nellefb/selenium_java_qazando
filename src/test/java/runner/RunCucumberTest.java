package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "json:target/cucumber-report/report.json","html:target/reports/report.html"},
        features = "src/test/resources/features",
        tags = "@cadastro_sucesso",
        glue = "steps"
)
public class RunCucumberTest extends RunBase{


    @AfterClass
    public static void stop(){
        System.out.println("Finalizou");

        driver.quit();
    }

}
