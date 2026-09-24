package se.unibg.it.calculator;

import org.apache.logging.log4j.*;

public class App {

	private static Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.error("Somma di 3 e 5: " + Calculator.Somma(3, 5));
		logger.error("Differenza di 8 e 2: " + Calculator.Differenza(8, 2));
		logger.error("Prodotto di 4 e -2: " + Calculator.prod(4, -2));
		logger.error("Divisione di 6 e 3: " + Calculator.div(6, 3));
	}
}
