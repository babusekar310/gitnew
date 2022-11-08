package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	public WebDriver driver;
	@Given("To configure the browser that we are going to launch")
	public void to_configure_the_browser_that_we_are_going_to_launch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@When("To launch the browser")
	public void to_launch_the_browser() {
		driver.get("https://www.facebook.com/");
	}

	@When("To pass the invalid username in the email text field")
	public void to_pass_the_invalid_username_in_the_email_text_field() {
		WebElement usrName = driver.findElement(By.id("email"));
		usrName.sendKeys("java@1234");
	}

	@When("To pass the invalid password in the password field")
	public void to_pass_the_invalid_password_in_the_password_field() {
		WebElement usrPass = driver.findElement(By.id("pass"));
	    usrPass.sendKeys("67891234");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("To close the browser")
	public void to_close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
	    driver.quit();
	}


}
