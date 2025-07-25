package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Excecuter extends Base {
	public void verifyJavaScriptExcecuter() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", showMessageButton);

		js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("window.scrollBy(0,-350)", "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excecuter excecuter = new Excecuter();

		excecuter.initializeBrowser();
		excecuter.verifyJavaScriptExcecuter();

	}

}
