import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void MyLoginTest(){

        driver.findElement(By.xpath(locts.getProperty("login_email")))
                .sendKeys("nata@gmail.com");
        driver.findElement(By.xpath(locts.getProperty("login_password")))
                .sendKeys("qwerty");
        driver.findElement(By.name(locts.getProperty("login_button"))).click();

    }
}
