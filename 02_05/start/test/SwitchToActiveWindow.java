import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/carva/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        //.getWindowHandle garante a permanência na janela de navegação, mesmo quando uma nova abre.
        String originalHandle = driver.getWindowHandle();

        //Isso garante que o teste troque para a outra janela aberta:
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }

        //agora eu tenho que trocar novamente para a janela original:
        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
