package kitapyurdu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    public Methods() {
        driver = BaseTest.driver;
        wait=new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(200)).ignoring(NoSuchFieldException.class);
        jsdriver=(JavascriptExecutor) driver;
    }
    public WebElement findElement(By by ){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void click(By by){findElement(by).click();   }
    public void waitBySecond(long second){
        try {
            Thread.sleep(second*500);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void sendKeys(By by,String text){
        findElement(by).sendKeys((text));
    }


    public void random() {
        Random random = new Random();
        List<WebElement> links = driver.findElements(By.xpath("//[@class='product-cr']"));
        int value = links.size();
        System.out.println(value);
        links.get(random.nextInt(value)).click();
    }

}
