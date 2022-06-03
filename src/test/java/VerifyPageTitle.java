import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPageTitle {


    @Test
    public void page1TitleVerification (){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\asamk\\Downloads\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //open URL
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/");

        //Actual title
        String actualTitle = driver.getTitle();
        //Expected title
        String expectedTitle = "Rubber Ducks | My Store1";

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void page2TitleVerification () {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\asamk\\Downloads\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //open URL
        driver.get("https://litecart.stqa.ru/en/delivery-information-i-2");

        //Actual title
        String actualTitle2 = driver.getTitle();
        //Expected title
        String expectedTitle2 = "Delivery Information | My Store1";

        Assert.assertEquals(actualTitle2, expectedTitle2);
    }

    @Test
    public void page3TitleVerification () {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\asamk\\Downloads\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //open URL
        driver.get("https://litecart.stqa.ru/en/terms-conditions-i-4");

        //Actual title
        String actualTitle3 = driver.getTitle();
        //Expected title
        String expectedTitle3 = "Terms & Conditions | My Store1";

        Assert.assertEquals(actualTitle3, expectedTitle3);
    }

    @Test
    public void page4TitleVerification () {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\asamk\\Downloads\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //open URL
        driver.get("https://litecart.stqa.ru/en/skidki-i-akcii-i-5");

        //Actual title
        String actualTitle4 = driver.getTitle();
        //Expected title
        String expectedTitle4 = "4 | My Store1";

        Assert.assertEquals(actualTitle4, expectedTitle4);
    }

    @Test
    public void homePageTitleVerification () {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\asamk\\Downloads\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        //open URL
        driver.get("https://litecart.stqa.ru/en/");

        //Actual title
        String actualTitle5 = driver.getTitle();

        Assert.assertTrue(actualTitle5.contains("Online Store"));


    }
}
