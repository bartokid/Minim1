package models;

import utils.RandomUtils;

public class Playlist {

    //Variables
    private String id;
    private String name;
    private String artista;
    private String album;
    private int duracio;

    //Constructors
    public Playlist(){
        this.id = RandomUtils.getId();
    }
    public Playlist(String name,String artista,String album, int duracio){
        this();
        this.name=name;
        this.artista=artista;
        this.album=album;
        this.duracio=duracio;
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracio() {
        return duracio;
    }

    public void setDuracio(int duracio) {
        this.duracio = duracio;
    }
}
