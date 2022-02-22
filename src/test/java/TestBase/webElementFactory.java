package TestBase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class webElementFactory {
	 //To send key
	public void sendKey(WebElement element,String value) {
		element.sendKeys(value);
	}
	//To click on element
	public void click(WebElement element) {
		element.click();
	}
	//To select dropdown by text
	public void selectByText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
		
	}
	
}
