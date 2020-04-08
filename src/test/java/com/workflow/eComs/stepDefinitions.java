package com.workflow.eComs;

import base.testBase;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.SignInPage;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class  stepDefinitions extends testBase {
	@Before
	public void setup() throws IOException {
		initialize();
	}


	@Given("^I go to the Home Page$")
	public void i_go_to_the_Home_Page() throws Throwable {
		driver.get(CONFIG.getProperty("URL"));
		driver.findElements(By.tagName("a"));
	}

	@Given("^I click the login link$")
	public void i_click_the_login_link() throws Throwable {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.click_Sign_in();
	}

	@Given("^I enter email address$")
	public void i_enter_email_address() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("escosolo7@gmail.com");
	}


	@Given("^I enter password$")
	public void i_enter_password() throws Throwable {
		driver.findElement(By.name("passwd")).sendKeys("Ikeama78");

	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.click_login_button();
	}

	@Then("^I verify that I am logged in successfully$")
	public void i_verify_that_I_am_logged_in_successfully() throws Throwable {
		String expectedUser = "Emeka Onuorha";
		System.out.println(expectedUser);
		String actualUser = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
		assertEquals(expectedUser,actualUser);

	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		driver.findElement(By.linkText("Sign out")).click();

	}

	@Given("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.enter_password(password);
	}
	@Given("^I enter email \"([^\"]*)\" address$")
	public void i_enter_my_address(String email) throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.enter_email_address(email);
	}
	@Given("^I click on the create account button$")
	public void I_click_on_the_create_account_button() throws Throwable {
		driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
		Thread.sleep(3000);
	}
	@Given("^I click on male radio button$")
	public void i_click_on_male_radio_button() throws Throwable {
		driver.findElement(By.id("id_gender1")).click();
	}

	@Given("^I enter a firstname \"([^\"]*)\"$")
	public void i_enter_a_firstname(String firstname) throws Throwable {
		driver.findElement(By.id("customer_firstname")).sendKeys(firstname);
	}

	@Given("^I enter a lastname \"([^\"]*)\"$")
	public void i_enter_a_lastname(String lastname) throws Throwable {
		driver.findElement(By.id("customer_lastname")).sendKeys(lastname);
	}


	@Given("^I enter a \"([^\"]*)\"$")
	public void i_enter_a(String password) throws Throwable {
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@Given("^I enter my date of birth$")
	public void i_enter_my_date_of_birth() throws Throwable {
		new Select(driver.findElement(By.id("days"))).selectByValue("1");
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("months"))).selectByValue("1");
		new Select(driver.findElement(By.id("years"))).selectByValue("1998");
		Thread.sleep(2000);
	}

	@Given("^I enter address$")
	public void i_enter_address() throws Throwable {
		driver.findElement(By.id("company")).sendKeys("BP Ltd");
		driver.findElement(By.id("address1")).sendKeys("1");
		driver.findElement(By.id("address2")).sendKeys("Park Road");
	}

	@Given("^I enter city$")
	public void i_enter_city() throws Throwable {
		driver.findElement(By.id("city")).sendKeys("Chicago");
	}

	@Given("^I enter state$")
	public void i_enter_state() throws Throwable {
		new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Illinois");
		driver.findElement(By.cssSelector("#id_state > option[value=\"13\"]")).click();
	}

	@Given("^I enter postal code$")
	public void i_enter_postal_code() throws Throwable {
		driver.findElement(By.id("postcode")).sendKeys("24378");
	}

	@Given("^I enter country$")
	public void i_enter_country() throws Throwable {

	}

	@Given("^I enter mobile number$")
	public void i_enter_mobile_number() throws Throwable {
		driver.findElement(By.id("phone")).sendKeys("0207 8876 920");
	}

	@When("^I click register button$")
	public void i_click_register_button() throws Throwable {
		driver.findElement(By.id("submitAccount")).click();
	}

	@Then("^I verify that \"([^\"]*)\" is logged in$")
	public void iVerifyThatIsLoggedIn(String user) throws Throwable {
		assertEquals(user, driver.findElement(By.cssSelector("span")).getText());
	}


	@And("^I enter my new email address$")
	public void iEnterMyNewEmailAddress() {
		random = 100 + (int)(Math.random()*((1000-1) +1));
		System.out.println(random);
		driver.findElement(By.id("email_create")).sendKeys("switch" + random + "@gmail.com");
	}


	@Then("^I see an error \"([^\"]*)\" message details$")
	public void i_see_an_error_message_details(String errormessage) throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.I_see_login_error_message(errormessage);
	}

    @When("^I search for \"([^\"]*)\" in the search input box$")
    public void iSearchForInTheSearchInputBox(String value) throws Throwable {
		driver.findElement(By.id("search_query_top")).click();
		driver.findElement(By.id("search_query_top")).sendKeys(value);
		driver.findElement(By.name("submit_search")).click();
    }

	@Then("^I see \"([^\"]*)\" product listing page$")
	public void iSeeProductListingPage(String value) throws Throwable {
		assertEquals("1 result has been found.", driver.findElement(By.cssSelector("span.heading-counter")).getText());

	}

	@When("^I click on the first item on page$")
	public void iClickOnTheFirstItemOnPage() {
		driver.findElement(By.cssSelector("a.product_img_link > img.replace-2x.img-responsive")).click();
	}

	@Then("^I verify search description \"([^\"]*)\" on the product page$")
	public void iVerifySearchDescriptionOnTheProductPage(String value) throws Throwable {
		assertEquals("Faded Short Sleeve T-shirts", driver.findElement(By.cssSelector("h1")).getText());

	}

	@And("^I also see option to select sizes$")
	public void iAlsoSeeOptionToSelectSizes() {
		driver.findElement(By.id("group_1")).click();
		new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
		driver.findElement(By.id("group_1")).click();
	}


}