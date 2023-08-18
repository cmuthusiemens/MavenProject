package Pages;

import org.openqa.selenium.By;

import framework.CommonMethodsAndAssertions;
import Utils.ConfigFileReader;


public class HomePage extends CommonMethodsAndAssertions {

	private By searchBox = By.name("search_query");
	private By searchButton = By.id("search-icon-legacy");
	private By OpenChannelButton = By.id("channel-title");
	private By videoTab = By.xpath("//div[text()='Videos']");

	public void Launch() throws Exception {
		String url = ConfigFileReader.getApplicationUrl(); 
		open(url);
		//takeScreenshot();
		//enterUsername();
		//enterPassWord();
		//clickSubmitbutton();
		System.out.println("Logging in...");

	}

/*	private void clickSubmitbutton() throws Exception {
		// takeScreenshot();
		click(submitButton);
	}

	private void enterUsername() throws Exception {
		type(ConfigFileReader.getUserName(), userName);
	}

	private void enterPassWord() throws Exception {
		type(ConfigFileReader.getPassWord(), passWord);
	}
*/
	public void verifyPageTitle(String title) {
		verifyPageTitleAssertion(title);
	}

	public void searchFor(String searchText) throws Exception {
		type(searchText, searchBox);	
		clickSearchbutton();
	}

	private void clickSearchbutton() throws Exception {
		click(searchButton);
	}

	public void OpenChannel() throws Exception {
		//Thread.sleep(5000);
		click(OpenChannelButton);
	}

	public void navigateToVideos() throws Exception {
		//Thread.sleep(2000);
		click(videoTab);
	}

}
