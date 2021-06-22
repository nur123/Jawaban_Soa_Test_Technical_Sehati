package profil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;	



public class ProfileSumberDayaManusia {

	@Test
    public void profilesumberdayamanusiaSuccess() {
        
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
        
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[1]/section[1]/div[1]/div[7]/a[1]")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Sumber Daya Manusia')]")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'Letak Geografis')]")).click();
      
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        
        driver.findElement(By.name("an_area")).sendKeys("100");
        
        driver.findElement(By.name("working_area_village")).sendKeys("10");
         
        driver.findElement(By.name("north")).sendKeys("Utara");
        
        driver.findElement(By.name("west")).sendKeys("Barat");
        
        driver.findElement(By.xpath("//button[contains(text(),'Simpan')]")).click();
        
        driver.findElement(By.xpath("//button[contains(text(),'Kembali')]")).click();
             
        Assert.assertEquals("100 m2", driver.findElement(By.xpath("//div[contains(text(),'100 m2')]")).getText());
        Assert.assertEquals("10 Desa/Kelurahan", driver.findElement(By.xpath("//div[contains(text(),'10 Desa/Kelurahan')]")).getText());
        Assert.assertEquals("Utara", driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")).getText());
        Assert.assertEquals("Barat", driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]")).getText());	
        
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'100 m2')]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'10 Desa/Kelurahan')]")).getText());
        System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]")).getText());        
    }
}
