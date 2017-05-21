import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class InnaaAnton {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void InnaaAnton() {
        wd.get("https://docs.google.com/forms/d/e/1FAIpQLScbPsFpc9s_ZVDyd7DroDuuvyPKosyH4mge_JVz3MmOeZGUzw/viewform");
        wd.findElement(By.cssSelector("div.exportLabelWrapper")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemsItemItem']/div[2]/div/content/div/label[1]/div/div[1]")).click();
        wd.findElement(By.cssSelector("div.quantumWizButtonPaperbuttonFocusOverlay.exportOverlay")).click();
        wd.findElement(By.name("entry.1725813868")).click();
        wd.findElement(By.name("entry.1725813868")).clear();
        wd.findElement(By.name("entry.1725813868")).sendKeys();
        wd.findElement(By.name("entry.1725813868")).click();
        wd.findElement(By.name("entry.1725813868")).clear();
        wd.findElement(By.name("entry.1725813868")).sendKeys("Inna Maloman");
        wd.findElement(By.name("entry.1562041366")).click();
        wd.findElement(By.name("entry.1562041366")).clear();
        wd.findElement(By.name("entry.1562041366")).sendKeys("Iloveobolon@gmail.com");
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']/div[4]/div[2]/div/div[1]")).click();
        wd.findElement(By.name("entry.1442227447")).click();
        wd.findElement(By.name("entry.1442227447")).clear();
        wd.findElement(By.name("entry.1442227447")).sendKeys("Anton Vidishchev");
        wd.findElement(By.name("entry.645987724")).click();
        wd.findElement(By.name("entry.645987724")).clear();
        wd.findElement(By.name("entry.645987724")).sendKeys("antonvidishchev@gmail.com");
        wd.findElement(By.name("entry.1570401082")).click();
        wd.findElement(By.name("entry.1570401082")).clear();
        wd.findElement(By.name("entry.1570401082")).sendKeys("NJ");
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']//span[.='15']")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']/div[7]/div[2]/div/content/div/label[3]/div/div[1]")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']//span[.='Male']")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']/div[8]/div[2]/div/content/div/label[1]/div/div[1]")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']//div[.='iOS']")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']/div[9]/div[2]/div/content/div/label[2]/div/div[1]")).click();
        wd.findElement(By.name("entry.1479309704")).click();
        wd.findElement(By.name("entry.1479309704")).clear();
        wd.findElement(By.name("entry.1479309704")).sendKeys("iPnone");
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']//span[.='iOS 10.x']")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']/div[11]/div[2]/div/content/div/label[4]/div/div[1]")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']//span[.='English']")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']/div[12]/div[2]/div/content/div/label[1]/div/div[1]")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']//span[.='Yes']")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']/div[13]/div[2]/div/content/div/label[1]/div/div[1]")).click();
        wd.findElement(By.name("entry.1562041366")).click();
        wd.findElement(By.name("entry.1562041366")).clear();
        wd.findElement(By.name("entry.1562041366")).sendKeys("Iloveobolon@gmail.com");
        wd.findElement(By.name("entry.1984407298")).click();
        wd.findElement(By.name("entry.1984407298")).clear();
        wd.findElement(By.name("entry.1984407298")).sendKeys("Iloveobolon@gmail.com");
        wd.findElement(By.name("entry.1393847975")).click();
        wd.findElement(By.name("entry.1393847975")).clear();
        wd.findElement(By.name("entry.1393847975")).sendKeys("alexsamara200@gmail.com");
        wd.findElement(By.cssSelector("div.quantumWizTogglePapercheckboxInnerBox.exportInnerBox")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewItemList']/div[19]/div[2]/div/div/label/div/div[1]/div[2]")).click();
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewNavigationButtons']//content[.='Далі']")).click();
        wd.findElement(By.cssSelector("div.quantumWizTogglePapercheckboxInnerBox.exportInnerBox")).click();
        wd.findElement(By.name("entry.2045693415")).click();
        wd.findElement(By.name("entry.2045693415")).clear();
        wd.findElement(By.name("entry.2045693415")).sendKeys("Inna Maloman");
        wd.findElement(By.xpath("//div[@class='freebirdFormviewerViewNavigationButtons']//span[.='Надіслати']")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
