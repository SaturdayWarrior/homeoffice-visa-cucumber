package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import gov.uk.check.visa.pages.ResultPage;

public class JoinPartnerSteps {
    @And("^User select immigration status <\"([^\"]*)\">$")
    public void userSelectImmigrationStatus(String immStatus) {
       new FamilyImmigrationStatusPage().selectImmigrationStatus(immStatus);
    }

    @And("^User click on next step after immigration status$")
    public void userClickOnNextStepAfterImmigrationStatus() {
        new FamilyImmigrationStatusPage().clickOnContinue();
    }

    @Then("^User should get visa result for joining a partner <\"([^\"]*)\">$")
    public void userShouldGetVisaResultForJoiningAPartner(String result)  {
       new ResultPage().confirmJoinPartnerVisaMessage(result);
    }
}
