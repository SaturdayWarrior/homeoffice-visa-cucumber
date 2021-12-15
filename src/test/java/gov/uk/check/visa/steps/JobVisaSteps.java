package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.DurationOfStayPage;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.WorkTypePage;

public class JobVisaSteps {
    @And("^User select length of stay <\"([^\"]*)\">$")
    public void userSelectLengthOfStay(String length) {
        new DurationOfStayPage().selectLengthOfStay(length);
    }

    @And("^User click on next step after length of stay$")
    public void userClickOnNextStepAfterLengthOfStay() {
        new DurationOfStayPage().clickNextStep();
    }

    @And("^User select job type <\"([^\"]*)\">$")
    public void userSelectJobType(String job) {
        new WorkTypePage().selectJobType(job);
    }

    @And("^User click on next step after job type$")
    public void userClickOnNextStepAfterJobType() {
        new WorkTypePage().clickOnNextStep();
    }

    @Then("^User should get visa result <\"([^\"]*)\">$")
    public void userShouldGetVisaResult(String result) {
        new ResultPage().confirmResultMessage(result);
    }
}
