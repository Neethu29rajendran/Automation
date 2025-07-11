package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {

	public void verifyDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));// dropdown is handled by
																							// Select class
		Select select = new Select(drop1);
		// select.selectByIndex(3);
		// select.selectByValue("python");
		select.selectByVisibleText("C#");

	}

	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBoxElement = driver.findElement(By.xpath("//input[@value=\"option-1\"]"));
		checkBoxElement.click();
		System.out.println(checkBoxElement.isSelected());

	}

	public void verifyRadioBtn() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='green']"));
		radioBtn.click();
		System.out.println("RadioButton : " + radioBtn.isSelected());

	}

	public static void main(String[] args) {

		HandlingDropdown dpDropdown = new HandlingDropdown();
		dpDropdown.initializeBrowser();
		// dpDropdown.verifyDropDown();
		   dpDropdown.verifyCheckBox();
		   dpDropdown.verifyRadioBtn();
	}

}
