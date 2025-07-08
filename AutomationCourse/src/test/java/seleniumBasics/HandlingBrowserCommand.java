package seleniumBasics;

import java.sql.Driver;

public class HandlingBrowserCommand extends Base{// gets all propert of Base class , so now we need to create obj for only HandlingBrowserCommand
	public void verifyCommands() {
		String title=driver.getTitle();
		System.out.println(title);
		
		String urlString=driver.getCurrentUrl();
		System.out.println(urlString);
		
		String handleId=driver.getWindowHandle();//getWindowHandles() cant use a string,use set etc
		System.out.println(handleId);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingBrowserCommand command=new HandlingBrowserCommand();
		command.initializeBrowser();
		command.verifyCommands();
		

	}

}
