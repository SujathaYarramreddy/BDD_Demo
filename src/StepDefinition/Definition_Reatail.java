package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Definition_Reatail {
	WebDriver driver;
	@Given("^Launch the page$")
	public void launch_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://realestate.upskills.in");
	    	}

	@When("^To Validathe Retail Login with Valid Credentials$")
	public void to_Validathe_Retail_Login_with_Valid_Credentials() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("sign-in")).click();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		  Thread.sleep(3000);
		  
	}

	@Then("^To make it successful$")
	public void to_make_it_successful() {
	    // Write code here that turns the phrase above into concrete actions
		String expectedtitle = "Real Estate";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle);
	    System.out.println("Done");
	    driver.close();
		
	}

}
