  import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Sign_Up {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Majd Mustafa\\OneDrive\\Desktop\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.booking.com");

		driver.findElement(By.className("js-header-login-link")).click();
		
		driver.findElement(By.id("username")).sendKeys("raghadmohmmad@yahoo.com");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

//		web driver wait / explicit white
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("new_password")));	
		
		driver.findElement(By.id("new_password")).sendKeys("0785556657Mm");
		
		driver.findElement(By.id("confirmed_password")).sendKeys("0785556657Mm");
		
		driver.findElement(By.className("whxYYRnvyHGyGqxO4ici")).click();
		
//		driver.findElement(By.id("XBHAGwkBHEVuwLK")).click();
//		driver.findElement(By.xpath("//*[@id=\"DQGMOMtQIyvdtaC\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"wl252-onboard-name\"]/div[2]/div/a")).click();
		
//		driver.close();
		
				

	}

}
