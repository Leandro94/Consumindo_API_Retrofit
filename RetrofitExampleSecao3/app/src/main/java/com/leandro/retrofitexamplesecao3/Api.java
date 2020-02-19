package com.leandro.retrofitexamplesecao3;

import com.leandro.retrofitexamplesecao3.model.Todo;
import com.leandro.retrofitexamplesecao3.model.User;
import com.leandro.retrofitexamplesecao3.rss.RSS;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface Api {

    @Headers({"Content-Type: application/json","User-Agent: RetrofitExample"})
    @GET("http://httpbtin.org/get")
    Call<ResponseBody> sendRequestWithHeaders();

    @GET("/comments/{id}")
    Call<Comment> getCommentById(@Path("id")int id);

    @GET("/posts/{id}")
    Call<Post> getPostById(@Path("id")String id);

    @GET("/users/{id}")
    Call<User> getUserById(@Path("id")String id);

    @GET("/todos")
    Call<List<Todo>> getTodos();

    @GET("https://www.w3schools.com/xml/simple.xml")
    Call<BreakfastMenu>getMenu();

    @GET("http://rss.nytimes.com/services/xml/rss/nyt/Sports.xml")
    Call<RSS>getRSSFeed();
}
