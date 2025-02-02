package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Method extends ConnectElement{
    private static final Logger log = Logger.getLogger(String.valueOf(StepImplemation.class));
    public void clickkbot(String key) throws Exception {
        connection(key).click();
        log.info(key+ " Adresine Tiklandi");

    }
    public void clickkbot(String key,String key1) throws Exception {
        connection(key).sendKeys(key1);
        log.info(key+ " Adresine " + key1 + " Degeri Girildi");
    }

    public void dur(String key) throws Exception {
        Actions action = new Actions(driver);
        action.moveToElement(connection(key)).build().perform();
        log.info(key+ " Üzerinden Duruldu");

    }

    public void kontrolEquals(String key,String text) throws Exception {
        WebElement title = connection(key);

        String titleText = title.getText();
        assertEquals(titleText,text);
        log.info(key +" kontrol edildi");

    }
    public void degerKontrol(String element1,String element2) throws Exception {
        WebElement product1 = connection(element1);
        String price1 = product1.getText();
        System.out.println(price1);
        String cleanedPriceString1 = price1.replaceAll("[^\\d.]+", "");
        double priceDouble1 = Double.parseDouble(cleanedPriceString1);

        WebElement product2 =connection(element2);
        String price2 = product2.getText();
        String cleanedPriceString2 = price2.replaceAll("[^\\d.]+", "");
        double priceDouble2 = Double.parseDouble(cleanedPriceString2);

        assertTrue(priceDouble2>=priceDouble1);
        log.info(priceDouble2 +"'nin degerinin  "+ priceDouble1+"'ın degerinden buyuk oldugu kontrol edildi");

    }

    public void assagiKaydir(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        log.info("assagi kaydirildi");
    }

    public void yukariKaydir(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)");
        log.info("yukari kaydirildi");
    }


    public String checkElementAttributeContains(String locatorName, String attribute) throws Exception {
        String value = connection(locatorName).getAttribute(attribute).trim();
        return value;
    }
    public Boolean checkElementContainsText(String locatorName, String expectedText) throws Exception {
        Boolean value = connection(locatorName).getText().contains(expectedText);
        return value;
    }
    public void sendText(String text, String locatorName) throws Exception {
        System.out.println("metod1 calıstı");
        connection(locatorName).sendKeys(text);
        System.out.println("metod3 calıstı");
    }
    public Boolean checkIsElementVisible(String locatorName) throws Exception {
        Boolean value = connection(locatorName).isDisplayed();
        return value;
    }
}
