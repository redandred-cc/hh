package com.company;


import org.apache.log4j.Logger;

public class TestLog4J {
    public static void main(String[] args) {
        //1.获取日志管理器
        Logger logger = Logger.getLogger(TestLog4J.class);
        //2.设置日志级别
        //3.将日志信息输出
        logger.debug("1.调试信息");
        logger.info("2.我是基本信息");
        logger.warn("3.警告信息");
        logger.error("4.错误信息");
        logger.fatal("5.严重信息");

    }
}
