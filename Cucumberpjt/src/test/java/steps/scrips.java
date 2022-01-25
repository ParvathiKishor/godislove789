package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scrips {

	
	@Given("User is on netbanking landing page.")
	public void user_is_on_netbanking_landing_page() {
	    System.out.println("******");
	}

	 @When("^User login into app with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_app_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	      System.out.println(strArg1);
	      System.out.println(strArg2);
	    }

	@Then("Home page is popullated")
	public void home_page_is_popullated() {
		System.out.println("melcow");
	    
	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg3) throws Throwable {
		System.out.println(strArg3);
    }



	

}
