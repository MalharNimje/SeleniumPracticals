package HRMS_TestAutomationScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_01_LoginLogout {
@Test
public void TC_01_LoginLogouts() {
	 DOMConfigurator.configure("log4j.xml");
	General g = new General();
	g.openApplication();
	g.login();
	g.logout();
	g.closeApplication();
}
}
