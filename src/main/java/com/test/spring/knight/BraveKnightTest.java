package com.test.spring.knight;

import org.junit.Test;
import static org.mockito.Mockito.*;
/**
 * @author hui
 * 2019/8/22 0022 16:42
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}
