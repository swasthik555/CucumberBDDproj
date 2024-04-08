package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Before("@TutorialsNinja")
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^I navigated to login page of the Application$")
	public void i_navigated_to_login_page_of_the_application() {
	   
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("^I enter emailAddress as \"(.*)\" and password as \"(.*)\" into the fields")
	public void i_enter_email_address_as_and_password_as_into_the_fields(String emailId, String password) {
	   driver.findElement(By.id("input-email")).sendKeys(emailId);
	   driver.findElement(By.id("input-password")).sendKeys(password);
		
	}

	@When("^I click on the Login button$")
	public void i_click_on_the_login_button() {
	    
		driver.findElement(By.cssSelector("input[value='Login']")).click();
	}

	@Then("^The user should be able to successfully login$")
	public void the_user_should_be_able_to_successfully_login() {
	   
		WebElement accountBreadCrumb = null;
	
		try {
			accountBreadCrumb = driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']abc"));
		}catch(Exception e) {
			System.out.println("Login has failed");
		}
		//Assert.assertNotNull("Login has failed", accountBreadCrumb);
		Assert.fail();
	}
	
	@After("@TutorialsNinja")
	public void tearDown() {
		
		driver.quit();
	}
	
}
