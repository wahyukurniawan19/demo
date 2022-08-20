import static org.junit.Assert.*;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	private WebDriver driver;

	@Test
	public void test() {
	    
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();	
	
	

	    driver.navigate().to("https://www.youtube.com/user/GlassBoxT");
        String title = driver.getTitle();
        assertTrue(title.contains("QAShahin"));

		driver.quit();	

		
	}

}
