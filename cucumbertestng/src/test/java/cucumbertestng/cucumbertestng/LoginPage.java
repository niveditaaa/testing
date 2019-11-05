package cucumbertestng.cucumbertestng;


import cucumbertestng.cucumbertestng.OpenMRSTests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPage  
{
	//WebDriver driver;
	@Given("^Open Application and Enter url$")
	public void open_Application_and_Enter_url() throws Throwable {
		 OpenMRSTests.driver.get("https://cis-dev1.manageamerica.com/Account/LogOn");
		  
		/* System.setProperty("webdriver.chrome.driver","D://Firefox//chromedriver.exe");

		 driver= new ChromeDriver();
		 driver.get("https://cis-dev1.manageamerica.com/Account/LogOn");	
		 */
		
		
	}

	@When("^enter username$")
	public void enter_username() throws Throwable {
		// driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("cis-dev");	
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
		OpenMRSTests.driver.findElement(By.id("password")).sendKeys("Admin123");
		OpenMRSTests.driver.findElement(By.id("Inpatient Ward")).click();
		OpenMRSTests.driver.findElement(By.id("loginButton")).click();
	}

	@Then("^verify Msg$")
	public void verify_Msg() throws Throwable {
	   boolean result =  OpenMRSTests.driver.findElement(By.tagName("h4")).getText().contains("Logged");
	   Assert.assertTrue(result);
	}
}