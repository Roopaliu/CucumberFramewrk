package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {


    @Given(": User is on landing Page")
    public void user_is_on_landing_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Testng runner: On the landing Page");
    }

    @When(": User Login into application with username {string} and password {string}")
    public void user_login_into_application_with_username_and_password(String string, String string2) throws Throwable{
        // Write code here that turns the phrase above into concrete actions  
      System.out.println("Inside arguement login");
      System.out.println(string);
      System.out.println(string2);

    }


//    @When(": User Login into application with Username and Password")
//    public void user_login_into_application_with_username_and_password() throws Throwable{
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Enter the Credentials");
//    }
    @Then(": Home page is populated")
    public void home_page_is_populated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Inside the application");
    }
    
     
    
//    @Then(": Bank account details are displaying on the Page")
//    public void bank_account_details_are_displaying_on_the_page() throws Throwable{
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("Logout of the application");
//    }


    @Then(": Bank account details are not getting displaying {string}")
    public void bank_account_details_are_not_getting_displaying(String string) throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }

    @And(": Bank account details are displaying {string}")
    public void bankAccountDetailsAreDisplaying(String arg0) {
        System.out.println("Bank account details are displaying");
        System.out.println(arg0);
    }
}
