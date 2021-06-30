package com.company;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MusicSort {
    public static void main(String[] args) {
        String classpath = MusicSort.class.getClassLoader().getResource("//").getPath();
        PropertyConfigurator.configure(classpath + "musicsort.properties");
        Logger logger = Logger.getLogger(MusicSort.class);
        logger.debug("MusicSort");
    }
}
