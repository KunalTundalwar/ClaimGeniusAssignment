package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import Test.PracticePageTest;
import TestBase.webUtility;

 public class PracticePage {
	
	  WebDriver driver;
	  public String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\TestData\\download.jpg"; 
	 
	 @FindBy(how=How.NAME,using="firstname")
	 public WebElement firstName;
	
	 @FindBy(how=How.NAME,using="lastname")
	public WebElement lastName;	
	
	 @FindBy(how=How.ID,using="sex-0")
	 public WebElement gMale;
	
	 @FindBy(how=How.ID,using="sex-1")
	 public WebElement  gFemale;
	
	 @FindBy(how=How.XPATH,using="//div//input[@name='exp']")
	 public WebElement  expRadioButton;
	
	 @FindBy(how=How.ID,using="datepicker")
	public WebElement  datepicker;
	
	@FindBy(how=How.XPATH,using="//input[@id='profession-1']")
	public WebElement profession;
	
	@FindBy(how=How.XPATH,using="//select[@id='continents']")
	public WebElement continents;
	
	@FindBy(how=How.XPATH,using="//select[@id='selenium_commands']")
	public WebElement seleniumCommands;
	
	@FindBy(how=How.CLASS_NAME,using="input-file")
	public WebElement uploadFile;
	
	@FindBy(how=How.XPATH,using="//button[@id='submit']")
	public WebElement submit;
	
	@FindBy(how=How.XPATH,using="//input[@id='tool-2']")
	public WebElement automationTools;
}
