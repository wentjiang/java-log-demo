package com.wentjiang.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Main main = new Main();
        main.addLog("hello world!");
    }

    public void addLog(String message) {
        logger.trace("trace " + message);
        logger.debug("debug " + message);
        logger.info("info " + message);
        logger.warn("warn " + message);
        logger.error("error " + message);
    }

}
