import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Subcategory {

    @Test
    public void NestedLinks(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://litecart.stqa.ru/en/");//open URL
        WebElement RubberDucksTitle = driver.findElement(By.xpath("//*[@id='site-menu']/ul/li[3]/a"));

        Actions action = new Actions (driver);
        action.moveToElement(RubberDucksTitle).perform();//show the list of subcategories
        driver.findElement(By.partialLinkText("Subc")).click();//open the subcategory link

    }

}
