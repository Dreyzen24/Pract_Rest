package pe.edu.idat.apprestmvvm.apirest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import pe.edu.idat.apprestmvvm.model.Album;
public interface AlbumInterface {

    @GET("albums")
    public Call <List<Album>> getAlbums();
}
