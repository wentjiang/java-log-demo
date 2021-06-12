package com.wentjiang.logback.package1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest1 {

    Logger logger = LoggerFactory.getLogger(LogTest1.class);

    public void addLog(String message) {
        logger.trace("trace " + message);
        logger.debug("debug " + message);
        logger.info("info " + message);
        logger.warn("warn " + message);
        logger.error("error " + message);
    }

}
