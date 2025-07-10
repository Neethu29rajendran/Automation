package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base {

	public void tableHandling() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement tableElement=driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(tableElement.getText());

		WebElement row=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]"));
		System.out.println(row.getText());
	}

	public static void main(String[] args) {
		HandlingTable table = new HandlingTable();
		table.initializeBrowser();
		table.tableHandling();

	}

}
