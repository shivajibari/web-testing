package seleniumProjectCognizant;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Data {
	
	@Given("^User is with blank page$")
	public void user_is_with_blank_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("G");
		System.out.println("Ghajini item");
		
		//throw new PendingException();
	}

	@When("^User enter URL$")
	public void user_enter_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("w");
		System.out.println("whne ");
		//throw new PendingException();
	}

	@Then("^Google WebSite should open$")
	public void google_WebSite_should_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("T");
		System.out.println("then");
		//throw new PendingException();
	}

	

}
