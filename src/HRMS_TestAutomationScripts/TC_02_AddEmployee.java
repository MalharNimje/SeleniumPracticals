package HRMS_TestAutomationScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_02_AddEmployee {
@Test
public void TC_02_AddEmployees()
{
	 DOMConfigurator.configure("log4j.xml");
	General g = new General();
	g.openApplication();
	g.login();
	g.enterFrame();
	g.addEmployee();
	g.exitFrame();
	g.logout();
	g.closeApplication();
}
}
