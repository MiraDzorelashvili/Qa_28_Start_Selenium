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
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));
        WebElement body2= wd.findElement(By.xpath("//body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));


        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));

        List<WebElement> a =wd.findElements(By.tagName("a"));
        List<WebElement> a1 =wd.findElements(By.cssSelector("a"));

        //by class
        WebElement el5 = wd.findElement(By.cssSelector(".container"));
        WebElement el = wd.findElement(By.xpath("//*[@class='container']"));

        //by id
        WebElement el6 = wd.findElement(By.cssSelector("#root"));
        WebElement el1 = wd.findElement(By.xpath("//*[@id = 'root']"));

        //by attribute
        WebElement el7 = wd.findElement(By.cssSelector("input[placeholder ='Password']"));
        WebElement el2 = wd.findElement(By.xpath("//input[@placeholder='Password']"));

        //by attribute --> start & end & contains

        //start
        WebElement el8 = wd.findElement(By.cssSelector("input[placeholder^='Pa']"));
        WebElement el3 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Pa')]"));

        //end


        //contains
        WebElement el9 = wd.findElement(By.cssSelector("input[placeholder*='ss']"));
        WebElement el4 = wd.findElement(By.xpath("//input[contains(@placeholder,'ss')]"));


    }
}
