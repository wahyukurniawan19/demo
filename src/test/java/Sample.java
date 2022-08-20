import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	private WebDriver driver;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();	
	}	
	
	@After
	public void tearDown() {
		driver.quit();	
	}	

	
	@Test
	public void test() {
        driver.navigate().to("https://www.youtube.com/user/GlassBoxT");
        String title = driver.getTitle();
        assertTrue(title.contains("QAShahin"));
		
	}

}
