package Manager;

import models.Artista;
import models.Playlist;
import models.Usuari;
import org.apache.log4j.*;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class MyMusicImpl implements MyMusic{
    //VARIABLES
    private static volatile MyMusicImpl instance = null;
    private HashMap<String, Usuari> usuaris;
    private LinkedList<Artista> artistes;

    //CONSTRUCTOR
    private MyMusicImpl(){
        this.usuaris= new HashMap<String,Usuari>();
        this.artistes=new LinkedList<Artista>();
    }
    //SINGLETON
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
    //METODOS
    @Override
    public void addArtista( String name, String surname) {
        artistes.add(new Artista(name,surname));
    }

    @Override
    public void addUser( String usrId, Usuari usuari) {
        usuaris.put(usrId,usuari);
    }

    @Override
    public List<Artista> getArtistes() {

        return null;
    }

    @Override
    public void createPlaylist(String usrId, String titol, String nomArtista, String album, int duració) {

    }

    @Override
    public void setPlaylistTittle(String usrId, String playlisId, String tittle) {

    }

    @Override
    public List<Playlist> getUserPlaylist(String usrId) {
        return null;
    }

    @Override
    public void clear() {
        usuaris= new HashMap<>();
        artistes= new LinkedList<>();
    }
}
