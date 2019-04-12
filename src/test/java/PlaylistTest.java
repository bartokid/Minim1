import Manager.MyMusic;
import Manager.MyMusicImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class PlaylistTest {
    private MyMusic myMusic;

    @Before
    public void setUp() {

        this.myMusic = MyMusicImpl.getInstance();

    }

    @After
    public void tearDown() {
        this.myMusic.clear();
    }
    @Test
    public void playListTest(){

    }
}
