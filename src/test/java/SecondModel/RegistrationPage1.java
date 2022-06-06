package SecondModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage1 {

    WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "New customers click here")
    WebElement RegLink;

    @FindBy(name = "firstname")
    WebElement FirstName;

    @FindBy(name = "lastname")
    WebElement LastName;

    @FindBy(name = "phone")
    WebElement Phone;

    @FindBy(name = "email")
    WebElement Email;

    @FindBy(name = "address1")
    WebElement Address1;

    @FindBy(name = "postcode")
    WebElement Postcode;

    @FindBy(name = "city")
    WebElement City;

    @FindBy(name = "password")
    WebElement DesiredPassword;

    @FindBy(name = "confirmed_password")
    WebElement ConfirmPassword;

    @FindBy(name = "create_account")
    WebElement CreateAccountBtn;

    RegistrationPage1(WebDriver d){
        driver = d;
        PageFactory.initElements(d, this);

    }

    public void clickNewCustomer(){
        RegLink.click();
    }

    public void setFirstName(String fName){
        FirstName.sendKeys(fName);
    }

    public void setLastName(String lName){
        LastName.sendKeys(lName);
    }

    public void setEmail(String mail){
        Email.sendKeys(mail);
    }

    public void setAddress1(String address){
        Address1.sendKeys(address);
    }
    public void setPostcode(String code){
        Postcode.sendKeys(code);
    }

    public void setPhone(String ph){
        Phone.sendKeys(ph);
    }

    public void setCity(String ct){
        City.sendKeys(ct);
    }

    public void setDesiredPassword(String psw){
        DesiredPassword.sendKeys(psw);
    }

    public void setConfirmPassword(String pswcnf){
       ConfirmPassword.sendKeys(pswcnf);
    }

    public void clickCreateAccountBtn(){
        CreateAccountBtn.click();
    }

}
