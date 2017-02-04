package cn.tedu.log4jDemo;

import org.apache.log4j.Logger;

public class Log4jDemo {
	
	private static final Logger log = Logger.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		
		log.debug(">>>>debug");
		log.info(">>>>info");
		log.warn(">>>>warn");
		log.error(">>>>error好的");

	}

}
