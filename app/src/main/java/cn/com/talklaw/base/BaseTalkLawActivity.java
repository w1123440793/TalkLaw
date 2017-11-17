package cn.com.talklaw.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.jusfoun.baselibrary.base.BaseActivity;
import com.jusfoun.baselibrary.base.BaseModel;
import com.jusfoun.baselibrary.permissiongen.PermissionGen;

import rx.Observable;
import rx.functions.Action1;

/**
 * @author wangcc
 * @date 2017/11/17
 * @describe
 */

public abstract class BaseTalkLawActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDatas();
        initView();
        initAction();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        PermissionGen.onRequestPermissionsResult(this,requestCode,permissions,grantResults);
    }
}
