package services;
import Manager.MyMusic;
import Manager.MyMusicImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import models.Artista;
import models.Usuari;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/playlist", description = "Endpoint to Playlist Service")
@Path("/playlist")
public class MyMusicService {
    private MyMusicImpl mm;

    public  MyMusicService() {
        this.mm = MyMusicImpl.getInstance();
        if (mm.sizeLlistaUsuaris() == 0) {
            mm.addUser("Pau1",new Usuari("Pau"));
            mm.addUser("jose1",new Usuari("jose"));


            mm.createPlaylist("Pau1","Top50mika","Mika","no place in heaven",3629);
            mm.createPlaylist("Pau1","Top50phillCo","Phill Collins","Tarzan",2348);
            mm.createPlaylist("Pau1","Anitta","Anitta","kisses",1766);

            mm.createPlaylist("jose1","pitbull hits","pitbull","house",3855);
            mm.createPlaylist("jose1","bad Bunny hits","BadBunny","REGG",3345);

            if(mm.sizeLlistaArtistes()==0){
                mm.addArtista("Mika","-");
                mm.addArtista("BadBunny","-");
                mm.addArtista("Anitta","-");
                mm.addArtista("pitbull","-");
                mm.addArtista("Phill Collins","-");
            }


        }


    }

    @GET
    @ApiOperation(value = "get list of artists that are in the system")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = Artista.class, responseContainer="List"),
    })
    @Path("/artists")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getArtists() {
        List<Artista> artistas = this.mm.getArtistes();
        GenericEntity<List<Artista>> entity = new GenericEntity<List<Artista>>(artistas) {};
        return Response.status(200).entity(entity).build();
    }

    @POST
    @ApiOperation(value = "set Playlist Tittle")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful")
    })
    @Path("/playlistTittle")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postTittle() {
        this.mm.setPlaylistTittle("Pau1","","kisses");
        return Response.status(200).build();
    }

}
