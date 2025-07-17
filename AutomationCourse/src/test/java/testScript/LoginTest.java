package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestNgBase;

public class LoginTest extends TestNgBase {

	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidCredential() {
		//used if page factory not used
		// WebElement usernameField = driver.findElement(By.id("user-name"));
		// usernameField.sendKeys("standard_user");
		// WebElement passwordField = driver.findElement(By.id("password"));
		// passwordField.sendKeys("secret_sauce");
		// WebElement loginButton = driver.findElement(By.id("login-button"));
		// loginButton.click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField();
		loginPage.enterPasswordOnPasswordfield();
		loginPage.clickOnLoginButton();
	}

	@Test
	public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() {
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce_1");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

	@Test
	public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndValidPassword() {
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user_1");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

	@Test
	public void verifyWhetherUserIsAbleToLoginWithInvalidCredential() {
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user_1");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce_1");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}
}
