import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/carva/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        //Envie uma key diretamente:
        dateField.sendKeys("03/03/2023");
        //Apenas enviar um campo ao datepicker não fecha o ciclo, para funcionar preciso selecionar enter, logo:
        dateField.sendKeys(Keys.RETURN);

        driver.quit();
    }
}