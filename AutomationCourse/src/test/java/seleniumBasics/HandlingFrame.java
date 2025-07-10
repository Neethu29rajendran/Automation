package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrame extends Base {

	public void frameHandling() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames.size());
		WebElement framElement=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(framElement);
		WebElement headingElement=driver.findElement(By.id("sampleHeading"));
		System.out.println(headingElement.getText());
		driver.switchTo().defaultContent();

	}

	public static void main(String[] args) {
		HandlingFrame frame = new HandlingFrame();
		frame.initializeBrowser();
		frame.frameHandling();

	}

}
