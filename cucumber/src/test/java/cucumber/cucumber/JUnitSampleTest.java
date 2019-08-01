package cucumber.cucumber;




import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitSampleTest extends JUnitTestReporter {
	 WebDriver driver;	
	 
	/* @Given("^I open firefox browser$")
	    public void iOpenFirefoxBrowser() throws Throwable {
		 driver= new FirefoxDriver();		
	    }
	 
	    @When("^I navigate to login\\.html page$")
	    public void iNavigateToLoginHtmlPage() throws Throwable {
	    	driver.get("https://cis-dev1.manageamerica.com/Account/LogOn");		
	    }
	 
	    @When("^I provide username as hi and password as hi$")
	    public void iProvideUsernameAsHiAndPasswordAsHi() throws Throwable {
	        WebElement webElement = driver.findElement(By.id("username"));
	        webElement.sendKeys("hi");
	        webElement = driver.findElement(By.id("password"));
	        webElement.sendKeys("hi");
	    }
	 
	    @When("^I click on login button$")
	    public void iClickOnLoginButton() throws Throwable {
	        WebElement webElement = driver.findElement(By.id("login-btn"));
	        webElement.click();
	    }
	 
	    @Then("^hi should be name$")
	    public void hiShouldBeName() throws Throwable {
	        WebElement webElement = driver.findElement(By.id("name"));
	        try {
	        	//assertTrue(webElement.getText()).isEqualTo("hi");
	        } finally {
	        	driver.quit();
	        }
	    }
	   
	}*/
	 
	/* @Given("^Open the Firefox and launch the application$")				
	    public void open_the_Firefox_and_launch_the_application() throws Throwable							
	    {		
	        System.out.println("This Step open the Firefox and launch the application.");	
	        driver= new FirefoxDriver();					
	        driver.manage().window().maximize();			
	        driver.get("https://cis-dev1.manageamerica.com/Account/LogOn");		
	    }		

	    @When("^Enter the Username and Password$")					
	    public void enter_the_Username_and_Password() throws Throwable 							
	    {		
	       System.out.println("This step enter the Username and Password on the login page.");		
	       driver.findElement(By.name("//*[@id=\"userName\"]")).sendKeys("cis-dev");							
	       driver.findElement(By.name("//*[@id=\"password\"]")).sendKeys("password12");
	    }		

	    @Then("^Reset the credential$")					
	    public void Reset_the_credential() throws Throwable 							
	    {    		
	        System.out.println("This step click on the Reset button.");				
	        driver.findElement(By.name("btnReset")).click();		
	    }		

	*/

	 @Test
		public void LoginWithValidCredentials() throws Exception {
		 System.setProperty("webdriver.chrome.driver","D://Firefox//chromedriver.exe");

		 driver= new ChromeDriver();
		 driver.get("https://cis-dev1.manageamerica.com/Account/LogOn");	
		
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("cis-dev");							
	     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("UiCD!s5s3ieQ");
	     Thread.sleep(3000);
	     
	     //click on login button
	     driver.findElement(By.xpath("//*[@id=\"LoginButton\"]")).click();
	     Thread.sleep(5000);
	     //click on find resident
	   WebElement elem=  driver.findElement(By.xpath("//*[@id=\"qFindResident\"]"));
	   elem.click();
	   
	     
			assertTrue(elem.isEnabled());
			
		}

	@Test
	public void LoginWithInvalidCredentials() throws Exception {
		System.setProperty("webdriver.chrome.driver","D://Firefox//chromedriver.exe");

		 driver= new ChromeDriver();
		 driver.get("https://cis-dev1.manageamerica.com/Account/LogOn");	
		
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("cis");							
	     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("UiCD!ieQ");
	     
	     //click on login button
	     driver.findElement(By.xpath("//*[@id=\"LoginButton\"]")).click();
	     Thread.sleep(5000);
	     //click on find resident
	   WebElement elem=  driver.findElement(By.xpath("//*[@id=\"qFindResident\"]"));
	   elem.click();
	   
	  assertFalse(elem.isEnabled());
	}

	@Test
	public void LoginWithValidUsername() throws Exception {
		 System.setProperty("webdriver.chrome.driver","D://Firefox//chromedriver.exe");

		 driver= new ChromeDriver();
		 driver.get("https://cis-dev1.manageamerica.com/Account/LogOn");	
		
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("cis-dev");							
	     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gfg");
	     
	     //click on login button
	     driver.findElement(By.xpath("//*[@id=\"LoginButton\"]")).click();
	     Thread.sleep(5000);
	     //click on find resident
	   WebElement elem=  driver.findElement(By.xpath("//*[@id=\"qFindResident\"]"));
	   elem.click();
	   
	     
			assertTrue(!elem.isEnabled());
	}

	@Test
	public void LoginWithValidPassword() throws Exception {
		 System.setProperty("webdriver.chrome.driver","D://Firefox//chromedriver.exe");

		 driver= new ChromeDriver();
		 driver.get("https://cis-dev1.manageamerica.com/Account/LogOn");	
		
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("pn");							
	     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("UiCD!s5s3ieQ");
	     
	     //click on login button
	     driver.findElement(By.xpath("//*[@id=\"LoginButton\"]")).click();
	     Thread.sleep(5000);
	     //click on find resident
	   WebElement elem=  driver.findElement(By.xpath("//*[@id=\"qFindResident\"]"));
	   elem.click();
	   
	     
			assertTrue(!elem.isEnabled());
	}
}
	
	
