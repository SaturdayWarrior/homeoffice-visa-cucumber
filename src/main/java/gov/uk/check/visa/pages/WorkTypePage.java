package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextPage;

    public void selectJobType(String jobType) {
        log.info("Clicking on :" + jobType + " job");
        clickOnElement(By.xpath("//label[contains(text(),'" + jobType.toString() + "')]"));
    }

    public void clickOnNextStep() {
        clickOnElement(nextPage);
        log.info("Clicking on :" + nextPage.toString());
    }

}
