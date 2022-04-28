package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginObjects {
    private WebDriver driver;
    @FindBy(id = "login-email")
    public WebElement txtemail;
    @FindBy(id = "login-password")
    public WebElement txtpassword;
    @FindBy(css = "button[type='submit']")
    public WebElement btnSubmit;
    @FindBy(css = "div[style='color: red; margin-bottom: 15px;']")
    public WebElement WrongTitleOb;

    @FindBy(css = "h6[class='toast-title font-weight-bold']")
    public WebElement CorrectTileOb;
    @FindBy(css = "div[class='wrapper vertical-layout navbar-static footer-static vertical-overlay-menu menu-open']")
    public WebElement bnt1;
    @FindBy(css = "span[class='brand-logo']")
    public WebElement bnt2;
    @FindBy(css = "a[class='waves-effect btn btn-outline-danger']")
    public WebElement bntlogout;


    public loginObjects(WebDriver driver){
        PageFactory.initElements(driver,this );
    }
    public  void ContactUsForm(String email, String password){
        txtemail.sendKeys(email);
        txtpassword.sendKeys(password);
    }
}
