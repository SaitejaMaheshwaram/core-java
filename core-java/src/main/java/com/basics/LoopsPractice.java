package com.basics;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LoopsPractice {

    @Test
    public void forEach() {
        String[] strArray = {"1", "2", "3", "4", "5"};
        for (int i=0; i<strArray.length; i++) {
            String value = strArray[i];
            log.info("value={}", value);
        }

        for (String value : strArray) {
            log.info("value = {}" , value);
        }
     }

}
