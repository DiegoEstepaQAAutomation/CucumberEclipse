package steps;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import MapObject.MapObjectBuyTravel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps 

{
	

	WebDriver driver;
	
	
	 
	
	@Given("the user is in the employees page")
	public void theuserisintheemployeespage() 
	{
		
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php");
		
		
		
	}
	
	
	
	

	

	@When("the user enters to the page")
	public void the_user_enters_to_the_page() 
	{
		
		WebElement testUsername = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
		testUsername.sendKeys("Admin");
		//testUsername.submit();
		System.out.println(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))).getText());
		
		WebElement testUsername2 = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")));
		testUsername2.sendKeys("admin123");
		
		//testUsername2.submit();
		System.out.println(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))).getText());
		
		
		
		WebElement testUsername3 = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		testUsername3.click();
		
		
		//driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		//driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		//driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("employee data changes")
	public void employeedatachanges() 
	{
		String title = driver.findElement(By.className("Paul Collings")).getText();
		Assert.assertEquals(title,"\"Paul Collings\"");
		
		
	}
	
	

}
