package cn.com.talklaw;

import com.jusfoun.baselibrary.BaseApplication;
import com.jusfoun.baselibrary.net.Api;

import cn.com.talklaw.comment.ApiService;
import cn.com.talklaw.comment.DaoInstance;

/**
 * @author wangcc
 * @date 2017/11/17
 * @describe
 */

public class TalkLawApplication extends BaseApplication{

    @Override
    public void onCreate() {
        super.onCreate();
        Api.getInstance().register(this,getString(R.string.url));
        DaoInstance.getInstance().regester(this);
    }
}
