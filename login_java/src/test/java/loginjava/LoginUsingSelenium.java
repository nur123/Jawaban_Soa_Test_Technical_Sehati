	package loginjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;	

public class LoginUsingSelenium {

	@Test
    public void loginSuccess() {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\login_java\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.get("https://dasbor-rc.sehati.co/login");
        
        driver.findElement(By.id("btn-consent")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Fasilitas Kesehatan')]")).click();
        
        WebElement identifier = driver.findElement(By.name("identifier"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Masuk')]"));
        
        Assert.assertTrue(identifier.isDisplayed());
         identifier.sendKeys("puskesmasremu@mailinator.com");
         
         Assert.assertTrue(password.isDisplayed());
          password.sendKeys("qwerty");
        
        login.click();
        
        String actual_title = driver.getTitle();
        String expected_title = "Sehati Dashboard";
        
        
        Assert.assertEquals(actual_title, expected_title);
        System.out.println("Assert passed");
    }
}
