package Test.Java;
import cucumber.api.java.en.Given;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class CucumberTest {

@Given("^user provides \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
public void user_provides_(String Attraction_Name, String Attraction_Desc, String Attraction_Pic, String Attraction_Loc, String Attraction_Price) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^user clicks on \"([^\"]*)\"$")
public void user_clicks_on(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^\"([^\"]*)\" message is displayed and \"([^\"]*)\" button is displayed$")
public void message_is_displayed_and_button_is_displayed(String arg1, String arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^system redirects to \"([^\"]*)\" upon clicking \"([^\"]*)\" button.$")
public void system_redirects_to_upon_clicking_button(String arg1, String arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^user has provided Attraction name$")
public void user_has_provided_Attraction_name() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^user clicks \"([^\"]*)\" button$")
public void user_clicks_button(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^list of attraction with pictures is displayed to the user matching with criteria given by user$")
public void list_of_attraction_with_pictures_is_displayed_to_the_user_matching_with_criteria_given_by_user() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^user has provided special Burj% in attraction name field$")
public void user_has_provided_special_Burj_in_attraction_name_field() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^list of attraction with pictures is displayed starting with \"([^\"]*)\" word$")
public void list_of_attraction_with_pictures_is_displayed_starting_with_word(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

}
