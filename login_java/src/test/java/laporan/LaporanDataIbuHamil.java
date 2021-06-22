package laporan;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;	

public class LaporanDataIbuHamil {

	@Test
    public void data_ibu_hamil_Success() {
        
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
        
        driver.findElement(By.xpath("//span[contains(text(),'Data Ibu')]")).click();
        
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/div[2]/div[1]/a[1]")).click();

        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")).click();
      
        driver.findElement(By.xpath("//option[contains(text(),'Faskes yang dikunjungi')]")).click();
         
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("a");
        
        driver.findElement(By.xpath("//button[contains(text(),'Tampilkan')]")).click();
        
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]")).click();
        
        driver.findElement(By.xpath("//option[contains(text(),'Umur')]")).click();
        
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/select[1]")).click();
        
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//option[contains(text(),'20 sampai 35 tahun')]")).click();
        
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        
        Assert.assertEquals("Nama Ibu", driver.findElement(By.xpath("//th[contains(text(),'Nama Ibu')]")).getText()); 
        Assert.assertEquals("Bu Anc One", driver.findElement(By.xpath("//span[contains(text(),'Bu Anc One')]")).getText());
        Assert.assertEquals("Bu Bara", driver.findElement(By.xpath("//span[contains(text(),'Bu Bara')]")).getText());
        Assert.assertEquals("Bu Back", driver.findElement(By.xpath("//span[contains(text(),'Bu Back')]")).getText());
        Assert.assertEquals("Bu Diinika", driver.findElement(By.xpath("//span[contains(text(),'Bu Diinika')]")).getText());
        Assert.assertEquals("Belum Gajian", driver.findElement(By.xpath("//span[contains(text(),'Belum Gajian')]")).getText());
        Assert.assertEquals("27", driver.findElement(By.xpath("//h2[contains(text(),'27')]")).getText());
        
        System.out.println(driver.findElement(By.xpath("//th[contains(text(),'Nama Ibu')]")).getText());
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Bu Anc One')]")).getText());
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Bu Bara')]")).getText());
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Bu Back')]")).getText());
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Bu Diinika')]")).getText());
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Belum Gajian')]")).getText());
        System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'27')]")).getText());	
        

        
        
        
        
//      String expectedText = "Tanda Bahaya :  + Anemia postpartum, Sesak Napas, Protein urine positif dua(++)"; 
//        
//        System.out.println("Your message : " + expectedText);
//        
//        Assert.assertEquals("Tanda Bahaya :  + Anemia postpartum, Sesak Napas, Protein urine positif dua(++)", expectedText);
//        //driver.quit();
    }
}
