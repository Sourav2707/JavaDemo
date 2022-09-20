package Testing;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SampleLogTest2 {
	static Logger log = Logger.getLogger(SampleLogTest.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		PropertyConfigurator.configure("log.info");
		log.info("Basic info");
		log.debug("Basic debug");
		log.error("Error logging");
		log.warn("Warning message");
		log.fatal("Fatal error");
	}
}
