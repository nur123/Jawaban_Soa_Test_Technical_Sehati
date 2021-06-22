package loginjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginFailedUsingSelenium {

	@Test
    public void loginError() {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\login_java\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        driver.get("https://dasbor-rc.sehati.co/login");
        
        driver.findElement(By.id("btn-consent")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Instansi Kesehatan')]")).click();
        
        WebElement identifier = driver.findElement(By.name("identifier"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Masuk')]"));
        
        Assert.assertTrue(identifier.isDisplayed());
         identifier.sendKeys("puskesmasremu123@mailinator.com");
        
        Assert.assertTrue(password.isDisplayed());
         password.sendKeys("qwerty123");
        
        login.click();
        
          
        // Store message in variable
        String actualerorrmessage;
        String expectederrormessage = "Mohon Masukkan Email dan Kata Sandi Yang Benar";
        
        actualerorrmessage = driver.findElement(By.xpath("//div[contains(text(),'Tidak dapat menemukan pengguna.')]")).getText();
            
        //verify error message
        Assert.assertEquals(actualerorrmessage, expectederrormessage);
        
        System.out.println("Assert fail : " + actualerorrmessage);
    }
}
