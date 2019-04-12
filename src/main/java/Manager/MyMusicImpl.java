package Manager;

public class MyMusicImpl implements MyMusic{

    private static volatile MyMusicImpl instance = null;
    private MyMusicImpl(){

    }
    public static MyMusicImpl getInstance() {
        if (instance == null) {
            synchronized(MyMusicImpl.class) {
                if (instance == null) {
                    instance = new MyMusicImpl();
                }
            }
        }

        return instance;
    }
}
