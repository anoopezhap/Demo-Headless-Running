import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Headless {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/");
        System.out.println(driver.getTitle());
        List<WebElement> titles = driver.findElements(By.xpath("//div/h5"));
        titles.forEach(t-> System.out.println(t.getText()));
        driver.quit();

    }
}
