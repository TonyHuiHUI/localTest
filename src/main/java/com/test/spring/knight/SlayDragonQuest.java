package com.test.spring.knight;

import java.io.PrintStream;

/**
 * @author hui
 * 2019/8/22 0022 17:57
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon");
    }
}
