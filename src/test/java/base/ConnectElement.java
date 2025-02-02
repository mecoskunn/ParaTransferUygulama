package base;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;

public class ConnectElement extends BaseTest{
    public static WebElement connection (String element1) throws Exception {

        System.out.println("istek1 : "+ element1);

        WebElement donus = null;

        try {
            File input = new File("src/test/resources/Elements.json");
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();
            JsonArray element = fileObject.get("element").getAsJsonArray();
            for (JsonElement linkElement : element) {
                JsonObject linkJson = linkElement.getAsJsonObject();
                String key = linkJson.get("key").getAsString();
                String value = linkJson.get("value").getAsString();
                String type = linkJson.get("type").getAsString();
                if (key.equals(element1)) {
                    if(type.equals("xpath")){
                        donus = checkelement(By.xpath(value));
                        break;
                    }
                    else if(type.equals("css")){
                        donus = checkelement(By.cssSelector(value));
                        break;
                    }
                    else{
                        donus = checkelement(By.id(value));
                        break;
                    }



                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("donus :"+donus);
        return donus;
    }

    public static WebElement checkelement(By by) {
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            element = null;
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            element = driver.findElement(by);
        } catch (Exception e) {

            System.out.println("Element Bulunmadı : " + e);
        }
        return element;
    }
}
