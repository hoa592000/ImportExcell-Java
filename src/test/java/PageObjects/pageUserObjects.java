package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setUp.setUp;

public class pageUserObjects {
//    private WebDriver driver = new ChromeDriver();
    @FindBy(css = ".ficon")
    public WebElement btnMennu;
    @FindBy(xpath = "//li/a[@href='/user']")
    public WebElement btnRoleUser;
    @FindBy(css = "div[class='select__input-container css-ackcql']")
    public WebElement btnSekectRole;
    @FindBy(css = "div[class='select__single-value']")
    public WebElement actionValue;
    @FindBy(id= "react-select-2-option-2")
    public WebElement actionAdmin;
    @FindBy(css = "#react-select-2-option-3")
    public WebElement actionUser;
    @FindBy(css = "#react-select-2-option-1")
    public WebElement actionRecruiter;

    public pageUserObjects(){
        PageFactory.initElements(new setUp().driver, this);
    }


}
