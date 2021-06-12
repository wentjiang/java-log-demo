package com.wentjiang.logback;

import com.wentjiang.logback.package1.LogTest1;
import com.wentjiang.logback.package2.LogTest2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String message = "hello world";

        Main main = new Main();
        LogTest1 logTest1 = new LogTest1();
        LogTest2 logTest2 = new LogTest2();

        main.addLog(message);
        logTest1.addLog(message);
        logTest2.addLog(message);
    }

    public void addLog(String message) {
        logger.debug("debug message : " + message);
        logger.info("info message : " + message);
        logger.error("error message : " + message);
    }
}
