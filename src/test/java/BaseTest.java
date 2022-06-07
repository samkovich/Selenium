import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static Properties locts = new Properties();
    public static FileReader fr;
    public static FileReader frl;
   @BeforeTest
    public void setUp() throws IOException {

        if(driver == null){
            fr = new FileReader(System.
                    getProperty("user.dir") + "\\src\\test\\java\\ConfigFiles\\config_properties");
            frl = new FileReader(System.
                    getProperty("user.dir") + "\\src\\test\\java\\ConfigFiles\\locators_properties");

            prop.load(fr);//config
            locts.load(frl);//locators

        }

        if(prop.getProperty("browser").equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
            driver.get(prop.getProperty("testURL"));
        }
        else if (prop.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            driver.get(prop.getProperty("testURL"));
        }

    }

    @AfterTest
    public void tearDown(){
        driver.close();
        System.out.println("Browser closed successfully");
    }
}
