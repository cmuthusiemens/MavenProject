package Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import framework.BaseTest;
@Listeners (framework.TestStatusListener.class)
public class TC_001_OpenWebsite extends BaseTest {

	@Test
	public void OpenWebsite() throws Exception {
		HomePage.Launch();
		HomePage.verifyPageTitle("YouTube");

	}

}
