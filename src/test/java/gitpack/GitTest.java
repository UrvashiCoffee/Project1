package gitpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class GitTest {
	
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://tutorialsninja.com/demo/");
		System.out.println("Login into website");
		driver.quit();
		
	}
		
}
