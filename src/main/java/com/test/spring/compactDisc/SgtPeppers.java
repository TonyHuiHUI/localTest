package com.test.spring.compactDisc;

import org.springframework.stereotype.Component;

/**
 * @author hui
 * 2019/8/29 0029 14:32
 */
@Component
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("SgtPeppers");
    }
}
