package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParamsCucumberTest {

	WebDriver driver;

	@Given("^Open Chrome and start application$")
	public void Open_Chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\9501252\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.carmax.com");
		Thread.sleep(1000);
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" in search box$")
	public void I_enter_and_in_search_box(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/form/div/div/input")).sendKeys(arg1,arg2);
		Thread.sleep(1000);
	}

	@Then("^user should able to see results accordingly$")
	public void user_should_able_to_see_results_accordingly() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/form/div/div/button")).click();
	    Thread.sleep(1000);
	}

	@Then("^Application should be closed$")
	public void Application_should_be_closed() throws Throwable {
		Thread.sleep(5000);
		driver.close();
	}


}
