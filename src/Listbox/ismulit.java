package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ismulit 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","D:\\Selenium_Software\\geckodriver.exe");
	FirefoxDriver fd = new FirefoxDriver();
	fd.get("file:///C:/Users/Monica/Desktop/sam.html");
	WebElement listbo = fd.findElement(By.id("CountrySelect"));
	 Select llis = new Select(listbo);
	 if (llis.isMultiple())
	 {
		 System.out.println("listbox is multi select");
	 }
	 else
	 {
		 System.out.println("listbox is not multi select");
	 }
}
}
