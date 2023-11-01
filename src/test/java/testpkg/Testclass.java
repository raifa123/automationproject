package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Pageclass;

public class Testclass {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void urlload()
{
	driver.get("https://www.marinersforex.com/Flights-Booking");
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
}
@Test
public void setvalues()
{
	Pageclass ob=new Pageclass(driver);
	
	ob.setvalues("Kochi, India  ","Dubai, United Arab Emirates");
	ob.departdate("26/11/24");
	ob.travellers();
	ob.search();
}
}
