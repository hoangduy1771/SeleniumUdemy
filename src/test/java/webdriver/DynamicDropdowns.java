package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@value='Departure City'])[1]")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
//        driver.findElement(By.xpath("(//input[@value='Arrival City'])[1]"));
        driver.findElement(By.xpath("//a[@value='MAA']")).click();


        driver.quit();

    }
}
