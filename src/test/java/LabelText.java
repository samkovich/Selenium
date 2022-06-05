import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.Test;

public class LabelText {
    @Test
    public void SaleLabel() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/yellow-duck-p-1");//open URL
        //boolean isDisplayed = driver.findElement(By.xpath("//*[@id=\"box-product\"]/div[2]/div[1]/a/div"))
                //.isDisplayed();
        //boolean isEnabled = driver.findElement(By.xpath("//*[@id=\"box-product\"]/div[2]/div[1]/a/div")).isEnabled();

//        if(isEnabled){
//            System.out.println("Not displayed.");
//        }else {
//            System.out.println("Label is displayed.");
//        }
//        if(isDisplayed){
//            System.out.println("Label is displayed.");
//        }else {
//            System.out.println("Label is not displayed.");
//        }

        try{
            driver.findElement(By.xpath("//*[@id='box-product']/div[2]/div[1]/a/div"));
            System.out.println("Element exists");
        }catch (NoSuchElementException e){
            System.out.println("Element not exist");

        }
    }

    @Test
    public void NewLabel() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/green-duck-p-2");//open URL
        //boolean isDisplayed = driver.findElement(By.xpath("//*[@id=\"box-product\"]/div[2]/div[1]/a/div"))
        //.isDisplayed();
        //boolean isEnabled = driver.findElement(By.xpath("//*[@id=\"box-product\"]/div[2]/div[1]/a/div")).isEnabled();

//        if(isEnabled){
//            System.out.println("Not displayed.");
//        }else {
//            System.out.println("Label is displayed.");
//        }
//        if(isDisplayed){
//            System.out.println("Label is displayed.");
//        }else {
//            System.out.println("Label is not displayed.");
//        }

        try{
            driver.findElement(By.className(".sticker new"));
            System.out.println("Element exists");
        }catch (NoSuchElementException e){
            System.out.println("Element not exist");

        }
    }
}
