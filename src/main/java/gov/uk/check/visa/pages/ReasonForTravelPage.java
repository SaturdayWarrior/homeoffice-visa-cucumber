package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import gov.uk.check.visa.customlisteners.CustomListeners;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Tourism')]")
    WebElement tourism;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Work, academic visit or business')]")
    WebElement workAcademic;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Join partner or family for a long stay')]")
    WebElement joinFamily;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueAfterReason;

    public void selectReasonForVisit(String reason) {
        clickOnElement(By.xpath("//div[@id='current-question']//label[contains(.,'" + reason + "')]"));
        log.info("Clicking on " + reason.toString() + " button");
    }

    public void clickOnNextStepButton() {
        clickOnElement(continueAfterReason);
        log.info("Clicking on continue button " + continueAfterReason.toString());
    }
}
