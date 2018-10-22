package framework.utils.restapi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {

	public static Logger classLogger = LogManager.getLogger(Utils.class.getName());

	public static void sampleUtility(Logger logger) {

		classLogger.info("inside utils method for restapi");

	}
}
