package com.basics;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class StringPractice {

    @Test
    public void method1() {
        log.info("Testing");
    }

    @Test
    public void createString() {
        String s = "a";
        log.info("s={}", s);

        String s2 = new String("abc");
        log.info("s2={}", s2);
    }

    @Test
    public void splitBySpace() {
        String str = "welcome to java";
        log.info("str={}", str);

        String[] strArray = str.split(" ");
        log.info("strArray={}", strArray);

        for (String value: strArray) {
            log.info("value={}", value);
        }
    }

    @Test
    public void convertToUpperCase() {
        String s = "java";
        log.info("s={}", s);

        String s2 = s.toUpperCase();
        log.info("s2={}", s2);
    }

    @Test
    public void convertToLowerCase() {
        String s = "JAVA";
        log.info("s={}", s);

        String lowerCase = s.toLowerCase();
        log.info("lowercase={}", lowerCase);
    }

    @Test
    public void subString() {
        String s = "WelcomeToJava";
        log.info("s={}", s);

        String substring1 = s.substring(4);
        log.info("subString={}", substring1);

        String substring2 = s.substring(2, 5);
        log.info("subString2={}", substring2);
    }

}