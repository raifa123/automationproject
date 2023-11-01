package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sdpage {
	WebDriver driver;
By username=By.id("user-name");
By password=By.id("password");
By login=By.xpath("//input[@id='login-button']");
By pd1=By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]");
By pd2=By.xpath("//div[3]//div[3]//button[1]");
By pd3=By.xpath("//div[5]//div[3]//button[1]");
By pd4=By.xpath("//body//div[@id='page_wrapper']//div[@id='inventory_container']//div[@id='inventory_container']//div[2]//div[3]//button[1]");
By pd5=By.xpath("//div[4]//div[3]//button[1]");
By pd6=By.xpath("//div[6]//div[3]//button[1]");
By cart=By.xpath("//*[name()='path' and contains(@fill,'currentCol')]");
By checkout=By.xpath("//a[@class='btn_action checkout_button']");
By firstname=By.id("first-name");
By lastname=By.id("last-name");
By post=By.id("postal-code");
By cont=By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input");
By home=By.xpath("//button[normalize-space()='Open Menu']");
By logout=By.xpath("//a[@id='logout_sidebar_link']");

public Sdpage(WebDriver driver)
{
	this.driver=driver;
}

public void login(String user,String pswd)
{
	driver.findElement(username).sendKeys(user);
	driver.findElement(password).sendKeys(pswd);
	driver.findElement(login).click();
}
public void products()
{
	driver.findElement(pd1).click();
	driver.findElement(pd2).click();
	driver.findElement(pd3).click();
	driver.findElement(pd4).click();
	driver.findElement(pd5).click();
	driver.findElement(pd6).click();
	driver.findElement(cart).click();
	driver.findElement(checkout).click();
}
public void details(String fst,String scnd,String pin)
{
	driver.findElement(firstname).sendKeys(fst);
	driver.findElement(lastname).sendKeys(scnd);
	driver.findElement(post).sendKeys(pin);
	driver.findElement(cont).click();
}
public void logout()
{
	driver.findElement(home).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(logout).click();
}

}
