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
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void login() {
        //by tag name
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_2 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_3 = wd.findElement(By.xpath("//h1"));


        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));
        List<WebElement> list = wd.findElements(By.cssSelector("a"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));



    //by class

    WebElement el = wd.findElement(By.className("container"));
    WebElement el1 = wd.findElement(By.cssSelector(".container"));
    WebElement el_1 = wd.findElement(By.xpath("//*[@class='container']"));

    List<WebElement> a2 = wd.findElements(By.className("href"));
    List<WebElement> a3 = wd.findElements(By.cssSelector(".href"));

    //by id

        WebElement el2 = wd.findElement(By.id("root"));
        WebElement el3 = wd.findElement(By.cssSelector("#root"));
        WebElement el_2 = wd.findElement(By.xpath("//*[@id='root']"));

    //by attribute
        WebElement el4 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el_4 = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        WebElement el5 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement el_5 = wd.findElement(By.xpath("//*[@placeholder='Password']"));
        WebElement el6 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement el_6 = wd.findElement(By.xpath("//*[@name='login']"));
        WebElement el7 = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement el_7 = wd.findElement(By.xpath("//*[@name='registration']"));
        WebElement el8 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el_8 = wd.findElement(By.xpath("//*[@href='/home']"));
        WebElement el9 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement el_9 = wd.findElement(By.xpath("//*[@href='/about']"));
        WebElement el10 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement el_10 = wd.findElement(By.xpath("//*[@href='/login']"));
        WebElement el11 = wd.findElement(By.name("email"));
        WebElement el_11 = wd.findElement(By.xpath("//*[@name='email']"));
        WebElement el12 = wd.findElement(By.name("password"));
        WebElement el_12 = wd.findElement(By.xpath("//*[@name='password']"));


    //start
WebElement el13 = wd.findElement(By.cssSelector("[placeholder ^='Email']"));
        WebElement el_13 = wd.findElement(By.xpath("//*[@placeholder='Email']"));
WebElement el14 = wd.findElement(By.cssSelector("[placeholder ^='Password']"));
        WebElement el_14 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

    //end
        WebElement el15 = wd.findElement(By.cssSelector("[placeholder $='Email']"));
        WebElement el_15 = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        WebElement el16 = wd.findElement(By.cssSelector("[placeholder $='Password']"));
        WebElement el_16 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

    //contains
        WebElement el17 = wd.findElement(By.cssSelector("[placeholder *='Email']"));
        WebElement el_17 = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        WebElement el18 = wd.findElement(By.cssSelector("[placeholder *='Password']"));
        WebElement el_18 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

}
}
