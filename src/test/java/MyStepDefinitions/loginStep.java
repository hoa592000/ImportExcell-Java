package MyStepDefinitions;

import Data.ExcelHelpers;
import PageObjects.loginObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import setUp.setUp;

import java.time.Duration;

@RunWith(Cucumber.class)
public class loginStep<LoginHelpers>  {

    setUp setup = new setUp();
    loginObjects loginOb = new loginObjects(setup.driver);
    ExcelHelpers excel = new ExcelHelpers();


    @Given("^User go to page$")
    public void user_go_to_page() throws Throwable {
        setup.driver.manage().window().maximize();
        //excel.setExcelFile("src/test/resources/fileExcel/Book1.xlsx", "Sheet1");

    }

    @When("^User login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String email, String password) throws Throwable {
        //Setup đường dẫn của file excel
        excel.setExcelFile("src/test/resources/fileExcel/Book1.xlsx", "Sheet1");
        for (int i = 1; i < 6; i++) {
            loginOb.ContactUsForm(excel.getCellData("email", i), excel.getCellData("password", i));
            loginOb.btnSubmit.click();
            Thread.sleep(2000);
            //Assert.assertEquals(strArg1, loginOb.WrongTitle.getText());

            String WrongTile  = "Wrong email or password.";
            Assert.assertEquals(WrongTile, loginOb.WrongTitleOb.getText());
            loginOb.txtemail.clear();
            loginOb.txtpassword.clear();

        }
        // Ghi nhiều dòng vào file Để kiểm tra xem đã check được bao nhiêu dòng
        for (int i = 0; i < 6; i++) {
            excel.setCellData("Done", i, 3);

        }

  // kiem tra dung

/*        String CorrectTile = "Dashboard";
        loginOb.ContactUsForm(email, password);
//        loginOb.txtemail.sendKeys(email);
//        loginOb.txtpassword.sendKeys(password);
        loginOb.btnSubmit.click();
        Thread.sleep(2000);
        Assert.assertEquals(CorrectTile,loginOb.CorrectTileOb.getText());
*/

        excel.setExcelFile("src/test/resources/fileExcel/Book1.xlsx","Sheet2");
        for (int i = 1; i < 2; i++) {
            loginOb.ContactUsForm(excel.getCellData("email", i), excel.getCellData("password", i));
            loginOb.btnSubmit.click();
            //String CorrectTile = "Welcome, ";
           //Assert.assertEquals(CorrectTile, loginOb.CorrectTileOb.getText());
        }
        // Ghi nhiều dòng vào file Để kiểm tra xem đã check được bao nhiêu dòng
        for (int i = 1; i < 2; i++) {
            excel.setCellData("Done", i, 3);

        }

    }
    
    @Given("^User successfully login$")
    public void valid_login() throws Exception {
        excel.setExcelFile("src/test/resources/fileExcel/Book1.xlsx","Sheet2");
        for (int i = 1; i < 2; i++) {
            loginOb.ContactUsForm(excel.getCellData("email", i), excel.getCellData("password", i));
            loginOb.btnSubmit.click();
            //String CorrectTile = "Welcome, ";
            //Assert.assertEquals(CorrectTile, loginOb.CorrectTileOb.getText());
        }
        // Ghi nhiều dòng vào file Để kiểm tra xem đã check được bao nhiêu dòng
        for (int i = 1; i < 2; i++) {
            excel.setCellData("Done", i, 3);

        }
    }
    @Then("^The home page$")
    public void the_home_page_is_closed() throws Throwable {
        Thread.sleep(2000);
        setup.driver.close();
    }

}