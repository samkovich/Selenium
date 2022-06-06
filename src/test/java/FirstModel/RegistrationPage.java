package FirstModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    By RegLink = By.linkText("New customers click here");
    By FirstName =By.name("firstname");
    By LastName = By.name("lastname");
    By Phone = By.name("phone");
    By Email = By.name("email");
    By Address1 = By.name("address1");
    By Postcode =By.name("postcode");
    By City = By.name("city");
    By DesiredPassword = By.name("password");
    By ConfirmPassword = By.name("confirmed_password");
    By CreateAccountBtn = By.name("create_account");

    RegistrationPage(WebDriver d){
        driver =d;
    }

    public void clickNewCustomer(){
        driver.findElement(RegLink).click();
    }

    public void setFirstName(String fName){
        driver.findElement(FirstName).sendKeys(fName);
    }

    public void setLastName (String lName){
        driver.findElement(LastName).sendKeys(lName);
    }

    public void setPhone (String ph){
        driver.findElement(Phone).sendKeys(ph);
    }

    public void setEmail (String mail){
        driver.findElement(Email).sendKeys(mail);
    }

    public void setAddress1 (String address){
        driver.findElement(Address1).sendKeys(address);
    }

    public void setPostcode (String code){
        driver.findElement(Postcode).sendKeys(code);
    }

    public void setCity (String ct){
        driver.findElement(City).sendKeys(ct);
    }

    public void setDesiredPassword (String psw){
        driver.findElement(DesiredPassword).sendKeys(psw);
    }

    public void setConfirmPassword (String pswcnf){
        driver.findElement(ConfirmPassword).sendKeys(pswcnf);
    }

    public void clickCreateAccountBtn(){
        driver.findElement(CreateAccountBtn).click();
    }


}
