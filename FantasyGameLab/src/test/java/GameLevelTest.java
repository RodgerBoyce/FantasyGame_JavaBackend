import GameLevel.GameLevel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameLevelTest {

    private GameLevel gameLevel;

    @Before
    public void before(){
        gameLevel = new GameLevel(3);

    }

    @Test
    public void canCreateGameLevels(){
        assertEquals(3, gameLevel.getRooms().size());
    }
}
