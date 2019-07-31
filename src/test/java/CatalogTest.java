import com.google.gson.Gson;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CatalogTest {
    @Test
    public void addRemovalElement() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("C:\\Users\\ASUS\\IdeaProjects\\web2\\src\\main\\resources\\Catalog.html");

        String json = driver.findElementByTagName("code").getText();
        driver.quit();

        Gson gson = new Gson();
        Catalog catalog = gson.fromJson(json, Catalog.class);
        Catalog catalog2 = new Catalog ("Рожковая помповая кофеварка DeLonghi ECP 31.21", "рожковая помповая кофеварка, 1100 Вт, корпус пластик, капучинатор ручной, цвет черный", "Нет объявлений на товар", "product-specs__table-title-inner", true, 18);
        boolean equal = catalog.equals(catalog2);
        System.out.println("Result" + equal);
    }
}
