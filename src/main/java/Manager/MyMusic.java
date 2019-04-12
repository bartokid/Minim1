package Manager;
import java.util.*;
import models.*;

public interface MyMusic {
    /**
     * Afegeig un artista al sistema
     * @param name
     * @param surname
     */
    void addArtista( String name, String surname);

    /**
     *Afegeig un usuari al sistema
     * @param usrId
     * @param usuari
     */
    void addUser(String usrId, Usuari usuari);

    /**
     * Retorna llista dels artistes del sistema
     * @return lista de artistas
     */
    List<Artista> getArtistes();

    /**
     * crea una playlis per al usuari
     * @param usrId
     * @param titol
     * @param nomArtista
     * @param album
     * @param duració
     */
    void createPlaylist(String usrId,String titol, String nomArtista, String album, int duració);

    /**
     * Afergir el titol a una playlist de l'usuari
     * @param usrId
     * @param playlisId
     * @param tittle
     */
    void setPlaylistTittle(String usrId, String playlisId, String tittle);

    /**
     * retorna una llista amb les playlist del usuari
     * @param usrId
     * @return
     */
    List<Playlist> getUserPlaylist(String usrId);

    /**
     * elimina les estructures creades
     */
    void clear();
}
