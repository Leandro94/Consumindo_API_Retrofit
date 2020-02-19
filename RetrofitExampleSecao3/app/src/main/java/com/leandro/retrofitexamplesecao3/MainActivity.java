package com.leandro.retrofitexamplesecao3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.leandro.retrofitexamplesecao3.model.Todo;
import com.leandro.retrofitexamplesecao3.model.User;
import com.leandro.retrofitexamplesecao3.rss.Item;
import com.leandro.retrofitexamplesecao3.rss.RSS;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(loggingInterceptor).build();

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                .client(client)
                .build();*/

        //JSON
        /*
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();*/
        //XML
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();


        Api api = retrofit.create(Api.class);

        try{
            api.getRSSFeed().enqueue(new Callback<RSS>() {
                @Override
                public void onResponse(Call<RSS> call, Response<RSS> response) {
                    RSS rss =  response.body();


                    for(Item item: rss.getChannel().getItemList()){
                        if(item.getTitle()!=null)
                            Log.d("XXX",item.getTitle());
                    }
                }

                @Override
                public void onFailure(Call<RSS> call, Throwable t) {
                    Log.d("XXX",t.getMessage());
                }
            });

        }
        catch (Exception e)
        {
            Log.d("XXX",e.getMessage());
        }

        //---------------------------------------------------------------------------------
        //aula 21 XML CONVERTER
        /*
        try{

            api.getMenu().enqueue(new Callback<BreakfastMenu>() {
                @Override
                public void onResponse(Call<BreakfastMenu> call, Response<BreakfastMenu> response) {
                    BreakfastMenu breakfastMenu = response.body();

                    for(Food food: breakfastMenu.getFoodList()){
                        Log.d("XXX",food.getName());
                    }
                }

                @Override
                public void onFailure(Call<BreakfastMenu> call, Throwable t) {

                }
            });

        }
        catch (Exception e){

            e.printStackTrace();
        }*/
        //-----------------------------------------------------------------------------
        //aula 19 json schema POJO
        /*

        try{

            api.getTodos().enqueue(new Callback<List<Todo>>() {
                @Override
                public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                    List<Todo> todos = response.body();

                    Log.d("XXX","Todos: "+ todos.size());
                }

                @Override
                public void onFailure(Call<List<Todo>> call, Throwable t) {

                }
            });

        }
        catch (Exception e){

            e.printStackTrace();
        }*/
        //-----------------------------------------------------------------------------
        //aula 19 json schema POJO
        /*

        try{

            api.getUserById("1").enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    User user = response.body();

                    Log.d("XXX", user.getName());
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {

                }
            });

        }
        catch (Exception e){

            e.printStackTrace();
        }


        //----------------------------------------------------------------------
        //tarefa 9
        /*
        try{

            api.getPostById("1").enqueue(new Callback<Post>() {
                @Override
                public void onResponse(Call<Post> call, Response<Post> response) {
                    Post post = response.body();

                    Log.d("XXX", post.getTitle());
                }

                @Override
                public void onFailure(Call<Post> call, Throwable t) {

                }
            });

        }
        catch (Exception e){

            e.printStackTrace();
        }

        //-----------------------------------------------------------------------------
        //aula 18 JSON CONVERTER
        /*try{

            api.getCommentById(1).enqueue(new Callback<Comment>() {
                @Override
                public void onResponse(Call<Comment> call, Response<Comment> response) {
                    Comment comment = response.body();

                    Log.d("XXX", comment.getBody());
                }

                @Override
                public void onFailure(Call<Comment> call, Throwable t) {

                }
            });

        }
        catch (Exception e){

            e.printStackTrace();
        }
         */
        //---------------------------------------------------------------------------
        //aula 17
        /*try{

            api.sendRequestWithHeaders().enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    try{
                        Log.d("XXX", response.body().string());
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {

                }
            });

        }
        catch (Exception e){

            e.printStackTrace();
        }*/
    }
}
