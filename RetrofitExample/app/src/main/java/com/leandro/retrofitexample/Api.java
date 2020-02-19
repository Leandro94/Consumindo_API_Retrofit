package com.leandro.retrofitexample;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface Api {

    @GET("/posts")
    Call<ResponseBody> getIp();

    @GET("/users")
    Call<ResponseBody>getUsers();

    @POST("/users")
    Call<ResponseBody> postUser(@Body RequestBody resRequestBody);

    @POST("/posts")
    Call<ResponseBody> postPosts(@Body RequestBody requestBody);

    @GET("/posts")
    Call<ResponseBody> getPostsByUserId(@Query("userId") int userId);

    @GET("/comments")
    Call<ResponseBody> getPostsByCommentsId(@Query("postId") int postId);

    @GET("/posts")
    Call<ResponseBody> getPostsByUserIdAndPostId(@Query("userId") int userId, @Query("id") int postId);

    @GET("/posts")
    Call<ResponseBody> getPostsByIds(@Query("id") List<Integer> ids);

    @GET("/users")
    Call<ResponseBody> getUsersByIds(@Query("id") List<Integer> ids);

    @GET("/posts")
    Call<ResponseBody> getPostsByUserIdAndPostId(@Query("userId") String userId, @Query("id")String postId);

    @GET("/posts")
    Call<ResponseBody> getPostsByParams(@QueryMap Map<String, String> params);

    @GET("/posts/{id}")
    Call<ResponseBody> getPostById(@Path("id")int id);

    @GET("/users/{id}")
    Call<ResponseBody> getUserById(@Path("id")int id);

    @GET("https://api.ipify.org")
    Call<ResponseBody> get_Ip();

    @Multipart
    @POST
    Call<ResponseBody>uploadFile(@Url String url, @Part MultipartBody.Part part);

    @Multipart
    @POST
    Call<ResponseBody>ocr(@Url String url, @Part("apikey") RequestBody apiKey, @Part ("language")RequestBody language, @Part MultipartBody.Part file);

    @FormUrlEncoded
    @POST("/posts")
    Call<ResponseBody>postPost(@Field("id")String id, @Field("userId") String userId,@Field("title")String title,@Field("body")String body);

    @FormUrlEncoded
    @POST("/users")
    Call<ResponseBody>postUsers(@Field("id")String id, @Field("name") String name);

    @Headers({"Content-Type: application/json", "User-Agent: RetrofitExample"})
    @GET("http://httpbin.org/get")
    Call<ResponseBody> sendRequestWithHeaders();

    @GET("http://httpbin.org/get")
    Call<ResponseBody>sendRequestWithHeaders(@Header("Content-Type")String contentType,@Header("User-Agent")String userAgent);

    @GET("https://httpbin.org/basic-auth/myusername/mypassword")
    Call<ResponseBody>auth(@Header("Authorization")String authorization);
}
