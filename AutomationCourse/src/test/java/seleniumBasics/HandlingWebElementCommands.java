package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommands extends Base{
	public void verifyCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		msgBox.sendKeys("Neethu");
		WebElement showBtn=driver.findElement(By.xpath("//button[@id=\"button-one\"]"));
		showBtn.click();
		WebElement msgTxt=driver.findElement(By.xpath("//div[@id=\"message-one\"]"));
		System.out.println(msgTxt.getText());
		msgBox.clear();
		System.out.println(showBtn.getCssValue("background-color"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingWebElementCommands webElementCommands=new HandlingWebElementCommands();
		webElementCommands.initializeBrowser();
		webElementCommands.verifyCommands();
		

	}

}
