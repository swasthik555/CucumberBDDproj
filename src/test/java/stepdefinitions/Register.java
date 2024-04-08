package stepdefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Before("@register")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^I navigate to Register page$")
	public void i_navigate_to_register_page() {
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
	}

	@When("^I enter the below deatils$")
	public void i_enter_the_below_deatils(DataTable data) {
	    
		Map<String, String> dataMap = data.asMap(String.class,String.class);
		
		driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("FirstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("LastName"));
		driver.findElement(By.id("input-email")).sendKeys(dataMap.get("Email"));
		driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("Telephone"));
		driver.findElement(By.id("input-password")).sendKeys(dataMap.get("Password"));
		driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("Password"));
	}

	@When("^I select the privacy policy option$")
	public void i_select_the_privacy_policy_option() {
	    
		driver.findElement(By.cssSelector("input[name='agree']")).click();
	}

	@When("^I click on continue button$")
	public void i_click_on_continue_button() {
	 
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
	}

	@Then("^User should be able to successfully register$")
	public void user_should_be_able_to_successfully_register() {
	   String expectedtext = driver.findElement(By.xpath("//div[@class='col-sm-9']//h1[text()='Your Account Has Been Created!']")).getText();
	   Assert.assertEquals("Your Account Has Been Created!", expectedtext);
	}
	
}
