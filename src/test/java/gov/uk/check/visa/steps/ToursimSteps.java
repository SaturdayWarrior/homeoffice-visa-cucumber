package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.pages.StartPage;

public class ToursimSteps {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User clicks on reject cookies$")
    public void userClicksOnRejectCookies() {
        new StartPage().clickOnRejectCookies();
    }

    @And("^User click on start now$")
    public void userClickOnStartNow() {
        new StartPage().clickStartNow();
    }

    @And("^User select nationality <\"([^\"]*)\">$")
    public void userSelectNationality(String nationality)  {
new SelectNationalityPage().selectNationality(nationality);
    }

    @And("^User click on next step after selecting nationality$")
    public void userClickOnNextStepAfterSelectingNationality() {
    new SelectNationalityPage().clickNextStepButton();
    }

    @And("^User select reason for visit <\"([^\"]*)\">$")
    public void userSelectReasonForVisit(String reason)  {
new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("^User click on next step after reason for travel$")
    public void userClickOnNextStepAfterReasonForTravel() {
        new ReasonForTravelPage().clickOnNextStepButton();
    }

    @Then("^User should get visa result message <\"([^\"]*)\">$")
    public void userShouldGetVisaResultMessage(String msg)  {
new ResultPage().confirmResultMessage(msg);
    }
}
