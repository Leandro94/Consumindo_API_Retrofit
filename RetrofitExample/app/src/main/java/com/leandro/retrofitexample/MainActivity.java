package com.leandro.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    //para enviar imagem
    /*final String OCR_URL = "https://api.ocr.space/parse/image";
    final String API_KEY = "34eab8418788957";
    final String LANGUAGE = "eng";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/").build();
        Api api = retrofit.create(Api.class);

        //aula 16
        //String contentType = "application/json";
        //String userAgent = "RetrofitExample";

        //tarefa 8
        String username = "myusername";
        String password = "mypassword";
        String userAndPassword = username +":"+password;
        String authorization = "Basic "+ Base64.encodeToString(userAndPassword.getBytes(),Base64.NO_WRAP);

        /* aula 14
        String id = "1";
        String userId = "2";
        String title = "This is title";
        String body = "This is body";*/

        //tarefa 7
        /*String id="1";
        String name="leandro";*/

        //---------------------------------------------
        // Query map of parameters
        /*
        Map<String, String> params = new HashMap<>();
        params.put("userId","1");
        params.put("id","2");*/

        /*
        //----------------------------------------------
        //null parameter
        String userId = "1";
        String postId = null;

        //-----------------------------------------------
        //Busca por uma lista de Ids
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        //-----------------------------------------------
        //UTILIZAR String json PARA POSTS
        String json = "{\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "    \"body\": \"quia et suscipit nsuscipit recusandae consequuntur expedita et cum nreprehenderit molestiae ut ut quas totam nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "  }";

        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"),json);
        */

        //-----------------------------------------------------------------------------------------
        //tarefa 8 Header login
        try{

            api.auth(authorization).enqueue(new Callback<ResponseBody>() {
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
        }
        //-----------------------------------------------------------------------------------------
        //aula 16 headers dynamic
        /*
        try{

            api.sendRequestWithHeaders(contentType,userAgent).enqueue(new Callback<ResponseBody>() {
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
        }

        //------------------------------------------------------------------------------------------
        //aula 15 Headers static
        /*
        try{

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
        }

         */
        /*
        //------------------------------------------------------------------------------------------
        //tarefa 7 URL Encoded
        try{

            api.postUsers(id,name).enqueue(new Callback<ResponseBody>() {
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
        //------------------------------------------------------------------------------------------
        /*
        //Form URL Encoded
        try{

            api.postPost(id,userId,title,body).enqueue(new Callback<ResponseBody>() {
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
        }
        */

        //------------------------------------------------------------------------------------------
        //upload imagem
        /*
        try {
            InputStream input = getAssets().open("image.png");
            File file = new File(getCacheDir(), "image.png");

            try {
                OutputStream output = new FileOutputStream(file);
                try {
                    try {
                        byte[] buffer = new byte[1024];
                        int read;

                        while ((read = input.read(buffer)) != -1) {
                            output.write(buffer, 0, read);
                        }
                        output.flush();
                    } finally {
                        output.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                input.close();
            }

            RequestBody apiKey = RequestBody.create(MediaType.parse("multipart/form-data"), API_KEY);

            RequestBody language = RequestBody.create(MediaType.parse("multipart/form-data"), LANGUAGE);

            final RequestBody requestBodyWithFile = RequestBody.create(MediaType.parse("multipart/form-data"), file);
            MultipartBody.Part filePart = MultipartBody.Part.createFormData("file", file.getName(), requestBodyWithFile);

            api.ocr(OCR_URL, apiKey, language, filePart).enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    try {
                        Log.d("xxx", response.body().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {

                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //------------------------------------------------------------------------------------------
        //upload file
        /*
        try{

            File file = new File(getCacheDir(),"hello.txt");
            FileWriter writer = new FileWriter(file);
            writer.append("Hello");
            writer.flush();
            writer.close();

            RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"),file);
            MultipartBody.Part part = MultipartBody.Part.createFormData("file",file.getName(),requestBody);

            api.uploadFile("https://file.io/",part).enqueue(new Callback<ResponseBody>() {
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
        }
        */
        /*
        //-------------------------------------------------------------------------------------
        //Different endpoint
        api.get_Ip().enqueue(new Callback<ResponseBody>() {
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
        /*
        //--------------------------------------------------------------------------------------
        //Path change part of URL
        api.getUserById(1).enqueue(new Callback<ResponseBody>() {
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
        /*
        //--------------------------------------------------------------------------------------
        //Map parameter
        api.getPostsByParams(params).enqueue(new Callback<ResponseBody>() {
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
         */
        /*
        //-----------------------------------------------------------------------------------------
        //Null parameter
        api.getPostsByUserIdAndPostId(userId,postId).enqueue(new Callback<ResponseBody>() {
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
        */
        /*
        //-----------------------------------------------------------------------------------------
        //Buscando por uma lista de Id (Tarefa 4)
        api.getUsersByIds(ids).enqueue(new Callback<ResponseBody>() {
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

         */
        //-----------------------------------------------------------------------------------------
        /*
        //Buscando por uma lista de Id
        api.getPostsByIds(ids).enqueue(new Callback<ResponseBody>() {
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
         */
        /*
        //------------------------------------------------------------------------------------------
        //Fazendo consulta com mais de um parâmetro
        api.getPostsByUserIdAndPostId(1,1).enqueue(new Callback<ResponseBody>() {
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
         */
        /*
        //------------------------------------------------------------------------------------------
        //Consulta com um parâmetro
        api.getPostsByCommentsId(1).enqueue(new Callback<ResponseBody>() {
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
        */
        /*
        //------------------------------------------------------------------------------------------
        //Usando @Query para pesquisar um id especifico de usuário
        api.getPostsByUserId(2).enqueue(new Callback<ResponseBody>() {
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
        */
        /*
        //------------------------------------------------------------------------------------------
        //Lendo dados de comentários
        api.getIp().enqueue(new Callback<ResponseBody>() {
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
        });*/
        /*
        //------------------------------------------------------------------------------------------
        //Enviando dados de comentários
        api.postPosts(requestBody).enqueue(new Callback<ResponseBody>() {
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
        });*/

    }
}
