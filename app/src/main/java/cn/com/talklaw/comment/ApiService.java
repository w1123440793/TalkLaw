package cn.com.talklaw.comment;

import java.util.HashMap;
import java.util.Map;

import cn.com.talklaw.model.MoveModel;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PartMap;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * @author wangcc
 * @date 2017/11/17
 * @describe 网络路由
 */

public interface ApiService {
    @Headers("Cache-Control:public,max-age=60")
    @GET("http://api.douban.com/v2/movie/top250")
    Observable<MoveModel> getMove(@QueryMap Map<String,String> params);
}
