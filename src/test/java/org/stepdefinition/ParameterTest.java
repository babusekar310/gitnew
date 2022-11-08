package org.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
		public WebDriver driver;
		@Given("To configure the browser that we are going to launch")
		public void to_configure_the_browser_that_we_are_going_to_launch() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		@When("To launch the browser that we need to open")
		public void to_launch_the_browser_that_we_need_to_open() {
			driver.get("https://www.facebook.com/");
		}

		@When("To pass the value {string} to the email text field")
		public void to_pass_the_value_to_the_email_text_field(String username) {
			WebElement usrName = driver.findElement(By.id("email"));
			usrName.sendKeys(username);
		}

		@When("To pass the value {string} to the password text field")
		public void to_pass_the_value_to_the_password_text_field(String password) {
			WebElement usrPass = driver.findElement(By.id("pass"));
		    usrPass.sendKeys(password);
		}

		@When("To click the login button by using click method")
		public void to_click_the_login_button_by_using_click_method() {
			driver.findElement(By.name("login")).click();
		}

		@Then("To exit the browser by using exit method")
		public void to_exit_the_browser_by_using_exit_method() {
		    	driver.quit();
		}

}

