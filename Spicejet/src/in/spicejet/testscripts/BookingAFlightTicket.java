package in.spicejet.testscripts;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.spicejet.pages.LandingPage;

public class BookingAFlightTicket {
	ChromeDriver driver;
	
	@BeforeTest
	public  void launchTheApplicaion() {
		System.setProperty("webriver.chrome.driver","resources//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver =new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
	}
	
	@Test
	public void buyATicket() throws InterruptedException {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.selectRadioBtn();
		landingPage.clickOnTheDesignations();
		landingPage.selectingLocation();
		//landingPage.arrowBtnClick();
		//landingPage.clickOnTheDesignations1();
		landingPage.selectingLocation2();
		//landingPage.enterTheLocation();
		
		
	}
}
