import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void cssLocators() {
        //by tag name
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h2 = wd.findElement(By.cssSelector("h1"));

        WebElement b = wd.findElement(By.tagName("a"));
        WebElement b1 = wd.findElement(By.cssSelector("a"));

        List<WebElement> listB = wd.findElements(By.tagName("a"));
        List<WebElement> listB1 = wd.findElements(By.cssSelector("a"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));


    }
}
