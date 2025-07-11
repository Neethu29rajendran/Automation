package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosElement = driver.findElement(By.id("uploadfile_0"));
		choosElement.sendKeys(
				"C:\\Users\\Neethu Arun\\git\\Automation\\AutomationCourse\\src\\test\\resources\\samplePDF.pdf");
		WebElement checkBox = driver.findElement(By.id("terms"));
		checkBox.click();
		WebElement submitBtn = driver.findElement(By.id("submitbutton"));
		submitBtn.click();
	}
	
	public void fileUploadUsingRobotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		StringSelection selection=new StringSelection("C:\\Users\\Neethu Arun\\git\\Automation\\AutomationCourse\\src\\test\\resources\\samplePDF.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot=new Robot();
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		FileUpload file = new FileUpload();
		file.initializeBrowser();
		//file.fileUploadUsingSendKeys();
		try {
			file.fileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
