package project;


//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone14");
		WebElement yesbutton=driver.findElement(By.id("nav-search-submit-button"));
		yesbutton.click();
        WebElement checkbox =driver.findElement(By.xpath("//*[@id=\"p_90/6741118031\"]/span/a/div/label/i"));

        checkbox.click();
        List<WebElement> products = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
        for (int i = 0; i < 5; i++) {
            String productName = products.get(i).getText();
            System.out.println(productName);
        }
        }
        
     	}