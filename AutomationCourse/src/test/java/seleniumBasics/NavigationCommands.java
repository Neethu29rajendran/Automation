package seleniumBasics;

public class NavigationCommands extends Base {
	public void verifyNavigationCommand(){
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().forward();//to move back to amazon.why to is used ? bcz path already known ,so we use forward() instead of to() with url
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommands navigation=new NavigationCommands();// same name for the obj can be created no issue bcz they all r in diff class ,but always try to give class related name.
		navigation.initializeBrowser();
		navigation.verifyNavigationCommand();

	}

}
