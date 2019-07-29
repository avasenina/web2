import com.google.gson.Gson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CatalogTest {
    @Test
    public void addRemovalElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("C:\\Users\\ASUS\\IdeaProjects\\web2\\src\\main\\resources\\Catalog.html");
        WebElement pre = driver.findElement(By.tagName("pre"));

        String json = driver.findElementByTagName("pre").getText()
                ;

        Gson gson = new Gson();

    }
}
