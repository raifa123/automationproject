package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Projectpage;

public class Projecttest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	
}
@Test
public void log() throws Throwable
{
	
	Projectpage ob=new Projectpage(driver);
	ob.title();
	ob.logotext();
	ob.items("680101");
	ob.search("baby boy  dress");
	ob.logout();
	
}

}
