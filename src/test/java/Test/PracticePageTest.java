package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.PracticePage;
import TestBase.webElementFactory;
import TestBase.webUtility;

public class PracticePageTest  {
	static WebDriver driver;
	webElementFactory factory;
	PracticePage page;
	
	@BeforeTest
	public WebDriver initilize() {
		driver= webUtility.getdriver();
		factory= new webElementFactory();
		return driver;
		
		}
	
	@Test
	public void fillForm() {
		//To initialize page factory
		page= PageFactory.initElements(driver, PracticePage.class);
		
		//To add first name and last name
		factory.sendKey(page.firstName,"claim");
		factory.sendKey(page.lastName,"genius");
		//To select gender
		factory.click(page.gMale);
		factory.click(page.expRadioButton);
		//To send Date
		factory.sendKey(page.datepicker,"21/02/2022");
		factory.click(page.profession);
		factory.click(page.automationTools);
		factory.selectByText(page.continents, "Europe");
		factory.selectByText(page.seleniumCommands, "Navigation Commands");
		//To Upload File
		factory.sendKey(page.uploadFile,page.filePath);
		factory.click(page.submit);
		
		}
	

}
