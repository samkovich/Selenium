import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    @Test
    public void SortPriceLowToHigh(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/");//open URL

        //capture the price before sort
        List<WebElement> beforeSortPrice = driver.findElements(By.className(".campaign-price"));

        //remove the "$" symbol and convert String into double
        List<Double> beforeSortPriceList = new ArrayList<>();
        for(WebElement p: beforeSortPrice) {
          beforeSortPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }
        //sorting the prices
        driver.findElement(By.xpath("//*[@id='box-category']/nav/a[2]")).click();

        //capture after sort price
        List<WebElement>afterSortPrice = driver.findElements(By.className(".campaign-price"));
        //remove "$" symbol from the price and convert String into the Double
        List<Double> afterSortPriceList = new ArrayList<>();
        for(WebElement p: afterSortPrice) {
            afterSortPriceList.add(Double.valueOf(p.getText().replace("$", "")));
        }
        //compare the values

        Collections.sort(beforeSortPriceList);//sort prices
        Assert.assertEquals(beforeSortPriceList,afterSortPriceList);

        //driver.quit();
    }
    @Test
    public void SortNameAZ(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/");//open URL

        //capture before sort names
        List<WebElement> beforeSortName = driver.findElements(By.className("name"));
        int size = beforeSortName.size();

        //print list of names before sort
        for (int i = 0; i < size; i++){
            System.out.print((i+1) + " ");//link number
            System.out.println(beforeSortName.get(i).getText());//link name
        }

        //sorting names
        driver.findElement(By.xpath("//*[@id='box-category']/nav/a[1]")).click();

        //capture after sort names
        List<WebElement>afterSortName = driver.findElements(By.className("name"));
        int sizeNew = afterSortName.size();

        //print list of sorting names
        for (int i = 0; i < sizeNew; i++){
            System.out.print((i+1) + " ");//link number
            System.out.println(afterSortName.get(i).getText());//link name
        }

        //compare the values
        Assert.assertNotEquals(beforeSortName,afterSortName);

        //driver.quit();
    }
}
