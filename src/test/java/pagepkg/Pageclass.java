package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import basepkg.Baseclass;

public class Pageclass {
WebDriver driver;
By leavingfrom= By.name("origin");

By goingto=By.xpath("//body/div[@id='root']/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");

By travclass=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/div");
By departdate=By.xpath("//body/div[@id='root']/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]");
By adult=By.xpath("//body/div[@id='root']/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/div[3]/ul[1]/li[1]/ul[1]/li[1]/div[1]/div[1]/div[3]/p[1]");
By child=By.xpath("//body/div[@id='root']/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/div[3]/ul[1]/li[1]/ul[1]/li[2]/div[1]/div[1]/div[3]/p[1]");
By chooseclass=By.xpath("//span[normalize-space()='Business']");
By done=By.xpath("//span[normalize-space()='Done']");
By search=By.xpath("//input[@value='Search']");

public Pageclass (WebDriver driver)
{
	this.driver=driver;
}
	
	

	
public void setvalues(String from,String to)
{
	driver.findElement(leavingfrom).click();
	driver.findElement(leavingfrom).clear();
	driver.findElement(leavingfrom).sendKeys(from);
	driver.findElement(goingto).click();
	driver.findElement(goingto).clear();
	driver.findElement(goingto).sendKeys(to);
	
}
public void departdate(String date)
{
	driver.findElement(departdate).click();
	driver.findElement(departdate).sendKeys(date);
}
public void travellers()
{
	driver.findElement(travclass).click();
	driver.findElement(adult).click();
	driver.findElement(child).click();
	driver.findElement(chooseclass).click();
	driver.findElement(done).click();
}

public void search()
{
	driver.findElement(search).click();
}
}
