package base;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class StepImplemation extends BaseTest{
    Method komut = new Method();
    private Logger logger = LoggerFactory.getLogger(getClass());
    HashMap<String, String> keyMap = new HashMap<String, String>();



    @Step("Wait <second> Seconds")
    public void wait(int second) throws InterruptedException {
        Thread.sleep(1000 * second);
        logger.info("Waited " + second + " Seconds. ");
    }

    @Step("Go To <url> Address")
    public void goToUrl(String url) {
        driver.get(url);
        logger.info("Navigated to " + url + " Address");
    }



    @Step("Click The <locatorName> Element")
    public void clickElement(String locatorName) throws Exception {

        komut.clickkbot(locatorName);
    }


    @Step("Check If <locatorName> Element's Attribute <attribute> Contains The Value <expectedValue>")
    public void checkElementAttributeContains(String locatorName, String attribute, String expectedValue) throws Exception {

        String actualValue = komut.checkElementAttributeContains(locatorName,attribute);
        if (actualValue.contains(expectedValue)) {
            logger.info("The " + attribute + " attribute in the " + locatorName + " element contains the expected " + expectedValue + " value.");
        } else {
            Assertions.fail("The " + attribute + " attribute in the " + locatorName + " element doesn't contains the expected " + expectedValue + " value.");
        }
    }

    @Step("Check If Element <locatorName> Contains Text <expectedText>")
    public void checkElementContainsText(String locatorName, String expectedText) throws Exception {
        Boolean containsText = komut.checkElementContainsText(locatorName,expectedText);
        Assertions.assertTrue(containsText, "Expected text is not contained");
        logger.info(locatorName + " Element Contains The " + expectedText + " Value");
    }


    @Step("Send <text> Value To Element <locatorName>")
    public void sendKeys(String text, String locatorName) throws Exception {
        //findElement(locatorName).sendKeys(text);
        System.out.println("stepIml calıstı");
        komut.sendText(locatorName, text);
        logger.info(text + " Value Writed To The " + locatorName + " Element.");
    }
    @Step("Check <locatorName> locator isDisplayed")
    public void checkIsDisplayed(String locatorName) throws Exception {
        Assertions.assertTrue(komut.checkIsElementVisible(locatorName),"locator isNotDisplayed");
        logger.info(locatorName + "is displayed");
    }
    @Step("Select <text> for Element <locatorName>")
    public void selectCheck(String text, String locatorName) throws Exception{
        komut.selectDropdownByVisibleText(text,locatorName);
    }
    @Step("Clear <locatorName> text area")
    public void clearArea(String locatorName) throws Exception{
        komut.clearTextArea(locatorName);
    }
}
