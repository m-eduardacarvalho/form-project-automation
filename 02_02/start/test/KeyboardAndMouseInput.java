import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        //Set the location to chrome driver:
        System.setProperty("webdriver.chrome.driver", "/Users/carva/Downloads/chromedriver.exe");

        //New instance of driver:
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        //1st: define a web element:
        WebElement name = driver.findElement(By.id("name"));

        //2nd: send keys or type a name into the name field:
        name.click(); //para clicar antes no campo de preenchimento. Tem que simular uma UI!
        name.sendKeys("Maria Eduarda");

        //3rd: after send the keys, we have to press the button to submit the field
        WebElement button = driver.findElement(By.id("button"));
        button.click(); //to order to click the button

        driver.quit();
    }
}
