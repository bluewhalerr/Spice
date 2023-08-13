package in.spicejet.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
	Actions actions;
	WebDriver driver;
	@FindBy(xpath = "//div[contains(@data-testid,'round-trip-radio-button')]")
	private WebElement radiobtn;

	@FindBy(xpath = "//div[contains(@data-testid,'to-testID-origin')]")
	private WebElement designation1;

	@FindBy(xpath = "//div[contains(@class,'css-1dbjc4n r-b5h31w r-95jzfe')]")
	List<WebElement> list;


	@FindBy(xpath = "//div[contains(@class,'css-1dbjc4n r-b5h31w r-95jzfe')]")
	List<WebElement> list1;
	
	@FindBy(xpath = "//div[contains(@data-testid,'to-testID-origin')]")
	private WebElement designation2;

	@FindBy(xpath = "//div[contains(@data-testid,'to-testID-flip-arrow')]")
	private WebElement arrow;

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void selectRadioBtn() {
		radiobtn.click();
	}

	public void clickOnTheDesignations() {
		designation1.click();
	}

	public void selectingLocation() {

		String select = "Agra";

		for (WebElement ele : list) {

			String getOptions = ele.getText();

			if (getOptions.contains(select)) {

				ele.click();
				break;
			}
		}
	}

	public void clickOnTheDesignations1() {

		designation1.click();
	}

	public void selectingLocation2() {
		WebElement secondElement = driver.switchTo().activeElement();

		String select1 = "Bengaluru";

		for (WebElement eles : list1) {

			String getOptionss = eles.getText();

			if (getOptionss.contains(select1)) {

				eles.click();;
				break;
			}
		}
	}
	
	public void arrowBtnClick() {
		arrow.click();
	}
//	public void enterTheLocation() {
//		designation2.sendKeys("Bengaluru");
//		designation2.sendKeys(Keys.ENTER);
//		
//	}
}
