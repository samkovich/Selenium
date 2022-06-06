package FirstModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    @Test
    public void Registration() {
        WebDriver driver = new EdgeDriver();
        RegistrationPage RegPage = new RegistrationPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
        driver.get("https://litecart.stqa.ru/en/");

        RegPage.clickNewCustomer();
        RegPage.setFirstName("nata");
        RegPage.setLastName("sam");
        RegPage.setAddress1("101 Cameilla");
        RegPage.setCity("Miami");
        RegPage.setPostcode("117042");
        RegPage.setPhone("3031112233");
        RegPage.setEmail("nata@gmail.com");
        RegPage.setDesiredPassword("qwerty");
        RegPage.setConfirmPassword("qwerty");
        RegPage.clickCreateAccountBtn();

        //Validation
        if(driver.getPageSource().contains("Your customer account has been created.")){
            System.out.println("You have registered");
        }else {
            System.out.println("Your registration failed");
        }

    }




}
