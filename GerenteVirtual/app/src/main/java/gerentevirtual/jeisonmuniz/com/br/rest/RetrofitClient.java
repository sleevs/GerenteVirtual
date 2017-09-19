package gerentevirtual.jeisonmuniz.com.br.rest;

import java.util.List;

import gerentevirtual.jeisonmuniz.com.br.atores.Cliente;
import gerentevirtual.jeisonmuniz.com.br.atores.Endereco;
import gerentevirtual.jeisonmuniz.com.br.atores.Pedido;
import gerentevirtual.jeisonmuniz.com.br.atores.Profissional;
import gerentevirtual.jeisonmuniz.com.br.atores.Tarefa;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JSN on 19/09/2017.
 */

public interface RetrofitClient {




    //http://localhost:8080/JSNSoftwareMaster/webresources/br.com.jsnsoftware.modelo.conta
    //"http://localhost:8080/JSNPrototipo/ws_vivodebico/com.jsnprototipo.vivodebico.entidade.conta"
    public static String URL_WS_VIVODEBICO  = "http://127.0.0.1:8081/JSNGerente/rest/";

    //Callback<List<User>> cb

    @GET("ator_cliente")
    Call<List<Cliente>> getCliente();

    @GET("ator_endereco")
    Call<List<Endereco>> getEndereco();

    @GET("ator_tarefa")
    Call<List<Tarefa>> getTarefa();

    @GET("ator_profissional")
    Call<List<Profissional>> getProfissional();

    @GET("ator_pedido")
    Call<List<Pedido>> getPedido();


}
