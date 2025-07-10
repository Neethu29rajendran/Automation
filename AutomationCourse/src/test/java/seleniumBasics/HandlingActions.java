package seleniumBasics;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	public void verifyRightClick() {
		WebElement rightElement = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions ac = new Actions(driver);
		ac.contextClick(rightElement).build().perform();

	}

	public void verifyMouseHover() {
		WebElement rightElement = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(rightElement).build().perform();

	}

	public void verifyDragandDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement droElement = driver.findElement(By.id("droppable"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(dragElement, droElement).build().perform();

	}

	public void verifyKeyboardAction() throws AWTException {
		Robot robot = new Robot();// created obj
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);

	}

	public static void main(String[] args) {
		HandlingActions actions = new HandlingActions();
		actions.initializeBrowser();
		// actions.verifyRightClick();
		// actions.verifyMouseHover();
		// actions.verifyDragandDrop();

		try {
			actions.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
