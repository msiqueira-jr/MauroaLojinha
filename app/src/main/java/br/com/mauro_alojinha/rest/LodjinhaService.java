package br.com.mauro_alojinha.rest;

import br.com.mauro_alojinha.model.BannerResp;
import br.com.mauro_alojinha.model.CategoriaResp;
import br.com.mauro_alojinha.model.ListaProdutoResp;
import br.com.mauro_alojinha.model.MaisVendidoResp;
import br.com.mauro_alojinha.model.Produto;
import br.com.mauro_alojinha.model.ProdutoPostResp;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LodjinhaService {

    @GET("banner")
    Single<BannerResp> getBanners();

    @GET("categoria")
    Single<CategoriaResp> getCategorias();

    @GET("produto")
    Single<ListaProdutoResp> getListaProdutos(@Query("offset") int offset,
                                              @Query("limit") int limit,
                                              @Query("categoriaId") int categoriaId);

    @GET("produto/maisvendidos")
    Single<MaisVendidoResp> getMaisVendido();

    @GET("produto/{produtoId}")
    Single<Produto> getProduto(@Path("produtoId") int produtoId);

    @POST("produto/{produtoId}")
    Single<ProdutoPostResp> reservarProduto(@Path("produtoId") int produtoId);
}
