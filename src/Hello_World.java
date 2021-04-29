import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello_World {

	public static void main(String[] args) {

		System.out.println("hello");
		
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
				
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("http://www.omayo.blogspot.com");
        
        driver.findElementByName("q").sendKeys("Seelnium 3-Firefox");
		
		
	}

}
