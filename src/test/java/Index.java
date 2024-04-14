import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("file:///C:/KVAZAR/Programming/Tel%20Ran/80%20Lesson/21.index.html");
    }
    @Test
    public void cssLocators(){
        //by tag name
        WebElement buttton = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        list.size();
        List<WebElement> a = wd.findElements(By.cssSelector("a"));


        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

    }


}
