package com.company;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TelLog {
    public static void main(String[] args) {
        String classpath = MusicSort.class.getClassLoader().getResource("//").getPath();
        PropertyConfigurator.configure(classpath + "tellog.properties");
        Logger logger = Logger.getLogger(TelLog.class);
        System.out.println("请输入手机号：");
        Scanner sc = new Scanner(System.in);
        String tel = sc.next();
        if (tel.length() != 11) {
            logger.warn("请输入11位数的手机号码！");
        } else {
            String regx = "\\d{11}";
            boolean falg = Pattern.matches(regx, tel);
            if (!falg) {
                logger.fatal("你输入的手机号包含非数字信息");
            } else {
                String stu = tel.substring(6);
                logger.debug("后五位:" + stu);
                String t = 6 + stu;
                logger.debug("短号:" + t);
            }
        }


    }
}
