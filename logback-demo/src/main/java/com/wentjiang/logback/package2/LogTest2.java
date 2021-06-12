package com.wentjiang.logback.package2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest2 {

    private Logger logger = LoggerFactory.getLogger(LogTest2.class);

    public void addLog(String message) {
        logger.trace("trace " + message);
        logger.debug("debug " + message);
        logger.info("info " + message);
        logger.warn("warn " + message);
        logger.error("error " + message);
    }
}
