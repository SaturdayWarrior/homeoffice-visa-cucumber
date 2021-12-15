package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@id='result-info']//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement result;

    public String getResultMsg() {
        String resultMsg = getTextFromElement(result);
        log.info("Get text from " + result.toString());
        return resultMsg;
    }

    public void confirmResultMessage(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equals(getResultMsg()));
        log.info("Verifying result message: " + expectedMessage);
    }

    public void confirmJoinPartnerVisaMessage(String partnerVisaResult) {
        getTextFromElement(result);
        log.info("Verifying partner visa result" + result.toString());
    }

}
