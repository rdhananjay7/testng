package framework.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecuteApp2Test {

	private static Logger classLogger = LogManager.getLogger(ExecuteApp2Test.class.getName());

	@BeforeTest
	public void setup() {
		classLogger.info("---------------------------------------------------------------");
		classLogger.info("Executing @BeforeTest");
		classLogger.info("This gets executed once per class");
		classLogger.info("This will be executed before running all the tests in a class.");
		classLogger.info("---------------------------------------------------------------");
	}

	@AfterTest
	public void cleanup() {

		classLogger.info("---------------------------------------------------------------");
		classLogger.info("Executing @AfterTest");
		classLogger.info("This gets executed once per class");
		classLogger.info("This will be executed after running all the tests in a class.");
		classLogger.info("---------------------------------------------------------------");

	}

	@BeforeMethod
	public void methodSetup() {

		classLogger.info("");
		classLogger.info("--------------Executing @BeforeMethod--------------");
		classLogger.info("");
	}

	@AfterMethod
	public void methodCleanup() {

		classLogger.info("");
		classLogger.info("--------------Executing @AfterMethod--------------");
		classLogger.info("");

	}

	@Test
	public void closeAllBrowsers() {

		classLogger.info("---------------------------------------------------------------");
		classLogger.info("Executing closeAllBrowsers method");
		classLogger.info("Closing all the browsers one by one");
		classLogger.debug("Closing chrome browser");
		classLogger.debug("Closing firefox browser");

		classLogger.error("sample error logging");
		classLogger.fatal("sample fatal logging");
		classLogger.info("---------------------------------------------------------------");

	}

	@Test(dependsOnMethods = { "closeAllBrowsers" }, alwaysRun = true)
	public void launchUrl() {

		classLogger.info("---------------------------------------------------------------");
		classLogger.info("Executing launchUrl method");
		classLogger.debug("Launched URL successfully");
		classLogger.info("---------------------------------------------------------------");

	}

}
