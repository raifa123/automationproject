package pagepkg;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class Projectpage {
WebDriver driver;
//By logo=By.xpath("//img[@class='notIeLogoHeader aspectRatioEqual sdHomepage cur-pointer']");
By toyss=By.xpath("//span[contains(text(),\"Toys, Kids' Fashion & more\")]");
By edu=By.xpath("//span[normalize-space()='Educational Toys']");
By kids=By.xpath("//div[@id='sdFooter']//div[4]//ul[1]//li[2]//a[1]");
By searchfield=By.xpath("//input[@id='inputValEnter']");
By search=By.xpath("//body/div[@id='sdHeader']/div[4]/div[2]/div[1]/div[2]/button[1]/span[1]");
By dress=By.xpath("//*[@id=\"664091792998\"]/div[3]/div[1]/a/p");
By pincode=By.xpath("//input[@placeholder='Enter your pincode']");
By check=By.xpath("//button[normalize-space()='Check']");
By cart1=By.xpath("//*[@id=\"add-cart-button-id\"]/span");
By signin=By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']");


public Projectpage(WebDriver driver)
{
	this.driver=driver;
}
public void title()
{
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	String expectedtitle="Snapdeal";
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
}
public void logotext()
{
	WebElement logotext=driver.findElement(By.xpath("//body/div[@id='sdHeader']/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]"));
	String text=logotext.getAttribute("value");
	Assert.assertTrue(true);
	System.out.println(text);
}
public void items(String code)
{
	WebElement toys=driver.findElement(toyss);
	Actions act=new Actions(driver);
	act.moveToElement(toys).perform();
	driver.findElement(edu).click();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(kids).click();
	driver.findElement(pincode).sendKeys(code);
	driver.findElement(check).click();
	
	
}
public void search(String dress) throws Throwable
{
	String mainwindow=driver.getWindowHandle();
	driver.findElement(searchfield).click();
	driver.findElement(searchfield).sendKeys(dress);
	driver.findElement(search).click();
	driver.findElement(By.xpath("//*[@id=\"664091792998\"]/div[3]/div[1]/a/p")).click();
	
	Set<String> allwindowhandles1=driver.getWindowHandles();
	for(String cart:allwindowhandles1)
	{
		if(!cart.equalsIgnoreCase(mainwindow))
		{	
		driver.switchTo().window(cart);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(cart1).click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\raifa\\OneDrive\\Desktop\\projectsrc.png"));
		driver.navigate().back();
		driver.close();
	}
	}

	driver.navigate().back();
}

public void logout()
{
	WebElement sign=driver.findElement(signin);
	Actions act=new Actions(driver);
	act.moveToElement(sign).perform();
	
}
}

