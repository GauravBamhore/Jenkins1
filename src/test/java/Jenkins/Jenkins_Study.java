package Jenkins;

import static org.testng.Assert.expectThrows;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jenkins_Study {
	@Test
	public void TC_001() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bamho\\eclipse-workspace\\JenkinPush\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--remote-allow-origins=*");

		// option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://www.seleniumframework.com/Practiceform/");
		WebElement alert = driver.findElement(By.xpath("//button[@id='alert']"));
		alert.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		

	}
}
