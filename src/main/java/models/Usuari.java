package models;
import utils.RandomUtils;
import org.apache.log4j.Logger;
import java.util.LinkedList;
import java.util.ArrayList;

public class Usuari {

    //Variables
    final static Logger log = Logger.getLogger(Usuari.class);
    private String id;
    private String name;
    private ArrayList<Playlist> playlists;
    private LinkedList<String> playlistsTittle;

    //constructors
    public Usuari(){
        this.id = RandomUtils.getId();
        this.playlists= new ArrayList<>();
        this.playlistsTittle= new LinkedList<>();
    }
    public Usuari(String name){
        this();
        this.name=name;
    }

    //getters i setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public LinkedList<String> getPlaylistsTittle() {
        return playlistsTittle;
    }

    public void setPlaylistsTittle(LinkedList<String> playlistsTittle) {
        this.playlistsTittle = playlistsTittle;
    }

    //METOHDS
    public void addPlaylist(Playlist playlist){
        playlists.add(playlist);
        log.info("playlist added succesfully");
    }
    public void deletePlaylist(int index){
        playlists.remove(index);
        log.info("playlist removed succesfully");
    }

    public void addPlaylistTittle(Playlist playlist, String tittle){
        int i = playlists.indexOf(playlist);
        if(i>0) {
            playlistsTittle.add(i, tittle);
            log.info("tittle added to the playlist");
        }
        else
            log.info("the playlist doesn't exist");
    }
}
