package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.amazon.in/Spigen-Urban-Fabric-Compatible-MacBook/dp/B09R2KCXD2/?_encoding=UTF8&pd_rd_w=hN3t9&content-id=amzn1.sym.e0e8ce89-ede3-4c51-b6ad-44989efc8536&pf_rd_p=e0e8ce89-ede3-4c51-b6ad-44989efc8536&pf_rd_r=10MH3SN3ES208H0RRNSQ&pd_rd_wg=wPWJi&pd_rd_r=13f23fa2-e355-40ad-a989-abace7275caf&ref_=pd_gw_ci_mcx_mr_hp_d");
		driver.manage().window().maximize() ;
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Spigen Urban Fit Fabric Case Cover Compatible with MacBook Pro 14 inch (2021) - Black - Buy Spigen Urban Fit Fabric Case Cover Compatible with MacBook Pro 14 inch (2021) - Black Online at Low Price in India - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"quantity_4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		txtBoxl.sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		WebElement txtBox2=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		txtBox2.sendKeys("abcde");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
	}

}