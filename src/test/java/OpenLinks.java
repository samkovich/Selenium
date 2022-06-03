import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpenLinks {
//    @Test
//    public void AllLinksNewTabs() {
//
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\asamk\\Downloads\\Selenium\\edgedriver_win64\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        //open URL
//        driver.get("http://litecart.stqa.ru/en/");
//
//        WebElement openLinks = driver.findElement(By.xpath("//nav[@id='site-menu']"));
//        System.out.println(openLinks.findElements(By.tagName("a")).size());//to see the number of links
//        //open links in separate windows
//        for (int i = 1; i < openLinks.findElements(By.tagName("a")).size(); i++) {
//            String openLinksAgain = Keys.chord(Keys.CONTROL, Keys.ENTER);
//            openLinks.findElements(By.tagName("a")).get(i).sendKeys(openLinksAgain);
//        }
//    }

   @Test
    public void LinksOpen () {

       System.setProperty("webdriver.edge.driver", "C:\\Users\\asamk\\Downloads\\Selenium\\edgedriver_win64\\msedgedriver.exe");
       WebDriver driver = new EdgeDriver();
       driver.manage().window().maximize();
       //open URL
       driver.get("http://litecart.stqa.ru/en/");
       driver.findElement(By.linkText("Rubber Ducks")).click();
       driver.findElement(By.linkText("Delivery Information")).click();
       driver.findElement(By.linkText("Terms & Conditions")).click();
       driver.findElement(By.linkText("Скидки и акции")).click();
       driver.findElement(By.xpath("//li[@class='general-0']")).click();

    }

}
