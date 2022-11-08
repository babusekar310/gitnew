package org.stepdefinition1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	public WebDriver driver;
	@Given("To configure the browser that we want to launch")
	public void to_configure_the_browser_that_we_want_to_launch() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	}

	@When("To launch the browser for example edge")
	public void to_launch_the_browser_for_example_edge() {
			driver.get("https://www.google.com/");
	    
	}

	@When("To enter the value iphone in the search text field")
	public void to_enter_the_value_iphone_in_the_search_text_field() {
	    	driver.findElement(By.name("q")).sendKeys("iPhone");
	}

	@When("To click the search button to check the function is working or not")
	public void to_click_the_search_button_to_check_the_function_is_working_or_not() throws AWTException {
	    	Robot r = new Robot();
	    	r.keyPress(KeyEvent.VK_ENTER);
	    	r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("To close the browser after the test is done")
	public void to_close_the_browser_after_the_test_is_done() throws InterruptedException {
			Thread.sleep(6000);
			driver.quit();
	}



}
