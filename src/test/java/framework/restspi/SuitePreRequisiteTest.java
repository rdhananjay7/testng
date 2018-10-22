package framework.restspi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitePreRequisiteTest {

	private static Logger suiteLogger = LogManager.getLogger(SuitePreRequisiteTest.class.getName());

	@BeforeSuite
	public void beforeSuite() {

		suiteLogger.info("------------------------------------------------------------------------------");
		suiteLogger.info("This is a suite level execution for @BeforeSuite annotation.");
		suiteLogger.info("This will happen only once, before running all the tests in a suite.");
		suiteLogger.info("This can be placed anywhere in the package, testNG picks it up to run first.");
		suiteLogger.info("------------------------------------------------------------------------------");

	}

	@AfterSuite
	public void afterSuite() {

		suiteLogger.info("------------------------------------------------------------------------------");
		suiteLogger.info("This is a suite level execution for @AfterSuite annotation.");
		suiteLogger.info("This will happen only once, after running all the tests in a suite.");
		suiteLogger.info("This can be placed anywhere in the package, testNG picks it up in the end.");
		suiteLogger.info("------------------------------------------------------------------------------");

	}

}
