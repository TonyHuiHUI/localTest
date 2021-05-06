package com.test.spring.knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hui
 * 2019/8/23 0023 10:03
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/services.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
