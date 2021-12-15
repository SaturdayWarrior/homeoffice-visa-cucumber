package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'6 months or less')]")
    WebElement lessThan6months;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'longer than 6 months')]")
    WebElement moreThan6months;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueAfterDuration;

    public void selectLengthOfStay(String moreOrLess) {
        moreOrLess = "more than 6 months";
        switch (moreOrLess) {
            case "more than 6 months":

                clickOnElement(moreThan6months);
                log.info("Selecting more than 6 months radio button ");
                break;
            case "6 months or less":
                clickOnElement(lessThan6months);
                log.info("Selecting less than 6 months radio button");
                break;
            default:
                System.out.println("nothing selected");
        }
    }

    public void clickNextStep() {
        //CustomListeners.node.log(Status.PASS, "Click on continue'" + continueAfterDuration + "' link");
        //Reporter.log("Click on continue'" + continueAfterDuration + "' link <br>");
        clickOnElement(continueAfterDuration);
        log.info("Clicking on next step button");
    }
}
