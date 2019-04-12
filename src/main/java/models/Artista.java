package models;
import utils.RandomUtils;

public class Artista {

    //VARIABLES
    private String id;
    private String name;
    private String surname;

    //Constructors
    public Artista(){
        this.id= RandomUtils.getId();
    }
    public Artista(String name, String surname){
        this();
        this.name=name;
        this.surname=surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
