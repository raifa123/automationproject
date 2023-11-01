package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Sdpage;

public class Sdtest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get("https://www.saucedemo.com/v1/");
}
@Test

public void values()
{
	
	Sdpage ob=new Sdpage(driver);
	ob.login("standard_user", "secret_sauce");
	ob.products();
	ob.details("abc", "efg", "123");
	ob.logout();
	
}
}


