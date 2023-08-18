package Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import framework.BaseTest;
@Listeners (framework.TestStatusListener.class)
public class TC_004_NavigateAndChose extends BaseTest {

	@Test
	public void NavigateAndChose() throws Exception {
		//HomePage.Launch();
		//HomePage.verifyPageTitle("YouTube");
		//HomePage.searchFor("step-inforum");
		//HomePage.OpenChannel();
		HomePage.navigateToVideos();
	}

}
