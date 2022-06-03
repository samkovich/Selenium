import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumHW11 {

    @Test
    public void webDriverTest(){

        System.setProperty("webdriver.edge.driver", "C:\\Users\\asamk\\Downloads\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com");//open URL

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));//get all available links
        //total links
        int size = allLinks.size();
        System.out.println("Total links are " + size);
        //print all links
        for (int i = 0; i < size; i++){
            System.out.print((i+1) + " ");//link number
            System.out.println(allLinks.get(i).getText());//link name
        }
        driver.findElement(By.linkText("Drag and Drop")).click();//click on the link #11



    }




}
