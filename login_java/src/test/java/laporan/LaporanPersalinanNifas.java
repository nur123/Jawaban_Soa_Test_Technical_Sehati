package laporan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;	



public class LaporanPersalinanNifas {

	@Test
    public void persalinanSuccess() {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\login_java\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
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
        
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Laporan Tahunan')]")).click();
        
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/div[1]/div[1]/a[2]")).click();
      
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]/option[2]")).click();
         
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
        
        driver.findElement(By.id("react-select-3-input")).sendKeys("a");
        
        driver.findElement(By.xpath("//div[contains(text(),'Kelurahan Klaligi')]")).click();
        
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/button[1]")).click();
          
        Assert.assertEquals("Tanda Bahaya", driver.findElement(By.xpath("//th[contains(text(),'Tanda Bahaya')]")).getText());
        Assert.assertEquals("Anemia postpartum", driver.findElement(By.xpath("//span[contains(text(),'Anemia postpartum')]")).getText());
        Assert.assertEquals("Sesak napas", driver.findElement(By.xpath("//span[contains(text(),'Sesak napas')]")).getText());
        Assert.assertEquals("Protein urine positif dua (++)", driver.findElement(By.xpath("//span[contains(text(),'Protein urine positif dua (++)')]")).getText());	
        
        System.out.println(driver.findElement(By.xpath("//th[contains(text(),'Tanda Bahaya')]")).getText());
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Anemia postpartum')]")).getText());
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Sesak napas')]")).getText());
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Protein urine positif dua (++)')]")).getText());
        
    }
}
