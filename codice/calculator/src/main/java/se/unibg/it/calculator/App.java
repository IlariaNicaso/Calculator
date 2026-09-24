package se.unibg.it.calculator;

import org.apache.logging.log4j.*;

public class App {

	private static Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.error("Error log message");
	}
}
