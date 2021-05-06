package com.test.spring.knight;

/**
 * @author hui
 * 2019/8/22 0022 16:38
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
