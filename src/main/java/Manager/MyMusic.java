package Manager;
import java.util.*;
import models.*;

public interface MyMusic {
    /**
     * Afegeig un artista al sistema
     * @param artistaId
     * @param name
     * @param surname
     */
    void addArtista(String artistaId, String name, String surname);

    /**
     *Afegeig un usuari al sistema
     * @param userId
     * @param name
     * @param surname
     */
    void addUser(String userId, String name, String surname);

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
