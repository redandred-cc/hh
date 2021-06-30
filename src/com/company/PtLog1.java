package com.company;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PtLog1 {
    public static void main(String[] args) {
        //1.获取日志管理器
        Logger logger = Logger.getLogger(PtLog1.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩(end结束)：");
        List list = new ArrayList();
        List lista = new ArrayList();
        while (true) {
            String n = sc.next();
            try {
                if (n.equals("end")) {
//              以调试信息打印所有的参数
                    for (Object str : lista) {
                        logger.debug("参数有：" + str);
                    }
                    break;
                } else {
                    lista.add(n);
                    int x = Integer.valueOf(n);
                    if (x < 0 || x > 1000) {
                        logger.warn("你输入的数字不是正整数");
                    } else {
                        list.add(n);
                    }
                }
            } catch (Exception e) {
                logger.fatal("你属的不是数字");
            }
        }
        System.out.println("----------------------------------");
        for (Object s : list) {
            logger.debug("排序前的正整数：" + s);
        }
        System.out.println("----------------------------------");
        Collections.sort(list);
        for (Object s : list) {
            logger.info("排序后的正整数：" + s);
        }
    }
}
