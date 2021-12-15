package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import gov.uk.check.visa.customlisteners.CustomListeners;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@id='current-question']//div[@class='gem-c-radio govuk-radios__item']/input[@id='response-0']")
    WebElement yesRB;
    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement noRB;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement next;

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "yes":
                clickOnElement(yesRB);
                log.info("Clicking on yes radio button");
                break;
            case "no":
                clickOnElement(noRB);
                log.info("Clicking on no radio button");
                break;
            default:
                System.out.println("Please select an option");
        }
    }

    public void clickOnContinue() {
        clickOnElement(next);
        log.info("Clicking on continue radio button");
    }
}
