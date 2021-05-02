package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Protrainingtech.Site.CucumberFrameWok.feature;
import org.junit.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;

public class ContactUsForm {
	public WebDriver driver;
	
	@Before
	public void setup() {
		String Path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Path+"\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
		 driver.get("https://www.protrainingtech.com");
	     driver.manage().window().maximize();	
	}
	@Given("^Already opened the protrainingtech\\.com$")
	public void already_opened_the_protrainingtech_com() throws Throwable {
	String id=driver.getCurrentUrl();
	System.out.println(id);
	Assert.assertEquals(id,"https://www.protrainingtech.com/" );
	    
	}

	@When("^user clicks on the contact us link$")
	public void user_clicks_on_the_contact_us_link() throws Throwable {
		feature ob=new feature(driver);
		Thread.sleep(6000);
		ob.ContactLinkClick();
	    
	}

	@Then("^user able to see the contact us form$")
	public void user_able_to_see_the_contact_us_form() throws Throwable {
		feature ob=new feature(driver);
	WebElement Course=	ob.Course();
	String CourseElementText=Course.getText();
	System.out.println(CourseElementText);
	 
	}

	@When("^user enters value for First Name \"([^\"]*)\"$")
	public void user_enters_value_for_First_Name(String arg1) throws Throwable {
		feature ob=new feature(driver);
		ob.FirstFieldSendKeys(arg1);
	    
	}

	@And("^user enters value for Last Name\"([^\"]*)\"$")
	
	public void user_enters_value_for_Last_Name(String arg1) throws Throwable {
		feature ob=new feature(driver);
		ob.LastNameSendKeys(arg1);
	   
	}

	@And("^user enters value for Email \"([^\"]*)\"$")
	public void user_enters_value_for_Email(String arg1) throws Throwable {
		feature ob=new feature(driver);
		ob.EmailFieldSendKeys(arg1);
	    
	}

	@And("^user enters value for Phone \"([^\"]*)\"$")
	public void user_enters_value_for_Phone(String arg1) throws Throwable {
		feature ob=new feature(driver);
		ob.PhoneFieldSendKeys(arg1);
	    
	}

	@And("^user clcks on Register button$")
	public void user_clcks_on_Register_button() throws Throwable {
		Thread.sleep(6000);
		feature ob=new feature(driver);
		ob.RgsButtonClick();
	    
	}

	@Then("^user should see th confirmatin message$")
	public void user_should_see_th_confirmatin_message() throws Throwable {
		Thread.sleep(6000);
		feature ob=new feature(driver);
		WebElement Confirm=ob.Confirm();
		String dt=Confirm.getText();
		System.out.println(dt);
		Assert.assertEquals(dt,"Thank you for registering.");
	
	}



}
