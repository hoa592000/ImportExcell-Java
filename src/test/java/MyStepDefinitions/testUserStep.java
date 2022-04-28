package MyStepDefinitions;
import PageObjects.pageUserObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import setUp.setUp;


@RunWith(Cucumber.class)
public class testUserStep {
    setUp setup = new setUp();
    pageUserObjects userObjects= new pageUserObjects();

    @When("^User go to function User$")
    public void user_go_to_function_user() throws Throwable {
        userObjects.btnMennu.click();
        userObjects.actionUser.click();
    }

    @Then("^User go to Dashboard$")
    public void user_go_to_dashboard() throws Throwable {
        System.out.println("hehe");
    }

    @And("^User check select with \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_check_select_with_something_something_and_something(String strArg1, String strArg2, String strArg3) throws Throwable {
        System.out.println("hehe");
    }


}