package seleniumBasics;

import java.text.CompactNumberFormat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickElement =driver.findElement(By.id("alertButton"));
		clickElement.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
			}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement conform=driver.findElement(By.id("confirmButton"));
		conform.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
	}
	
	public void verifyPromtAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promt=driver.findElement(By.id("promtButton"));
		promt.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Neethu");
		alert.accept();
		//alert.dismiss();
		
	}

	public static void main(String[] args) {
		AlertHandling alertHandling=new AlertHandling();
		alertHandling.initializeBrowser();
		//alertHandling.verifySimpleAlert();
		//alertHandling.verifyConfirmAlert();
		alertHandling.verifyPromtAlert();

	}

}
