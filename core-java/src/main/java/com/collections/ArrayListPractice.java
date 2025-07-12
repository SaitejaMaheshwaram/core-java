package com.collections;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ArrayListPractice {

    @Test
    public void createList() {
        List list = new ArrayList();
        log.info("list={}", list);

        List<String> list2 = new ArrayList<>();
        log.info("list2 = {}", list2);

        List<Integer> list3 = new ArrayList<>();
        log.info("list3={}", list3);

    }

    @Test
    public void add() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        log.info("list={}", list);
    }

    @Test
    public void get() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        log.info("list ={}", list);
        Integer value = list.get(0);
        log.info("value = {}", value);

        int value2 = list.get(1);
        log.info("value2 = {}", value2);
    }

    @Test
    public void remove() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        log.info("list = {}", list);

        Integer remove = list.remove(1);
        log.info("removed = {} , list = {}", remove, list);
    }

    @Test
    public void addAll() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        log.info("list1= {}", list1);

        List<String> list2 = new ArrayList<>();
        list2.add("h");
        list2.add("i");
        list2.add("j");
        log.info("list2 = {}", list2);

        list1.addAll(list2);

        log.info("list1 ={}, list2={}", list1, list2);

        list1.removeAll(list2);
        log.info("list1={}, list2={}", list1, list2);

    }

    @Test
    public void removeAll() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        log.info("list1= {}", list1);

        List<String> list2 = new ArrayList<>();
        list2.add("c");
        list2.add("i");
        list2.add("j");
        log.info("list2 = {}", list2);

        list1.removeAll(list2);
        log.info("list1={}, list2={}",list1, list2);
    }

    @Test
    public void iterate() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        log.info("list1={}", list1);

        for (Integer value : list1) {
            log.info("value ={}", value);
        }

        for (int i =0; i< list1.size(); i++) {
            int value1 = list1.get(i);
            log.info("value1={}", value1);
        }
    }

}