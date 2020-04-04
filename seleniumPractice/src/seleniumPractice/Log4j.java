package seleniumPractice;

import org.apache.log4j.Logger;

public class Log4j {

	
	static Logger log=Logger.getLogger(Log4j.class);
	
	public static void main(String[] args) {
		
		
		log.debug("hai");
		log.info("hai");
		log.warn("hai");
		log.error("hai");
		log.fatal("hai");

	}

}
