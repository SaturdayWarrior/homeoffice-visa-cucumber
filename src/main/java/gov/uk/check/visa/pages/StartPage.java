package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reject additional cookies']")
    WebElement rejectCookies;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNow;

    public void clickOnRejectCookies() {
        Reporter.log("Clicking on " + rejectCookies.getText() + "<br>");
        clickOnElement(rejectCookies);
        log.info("Clicking on reject cookies");
    }

    public void clickStartNow() {
        Reporter.log("Clicking on start button " + startNow.getText() + "<br>");
        clickOnElement(startNow);
        log.info("Clicking on start now button");
    }

}
