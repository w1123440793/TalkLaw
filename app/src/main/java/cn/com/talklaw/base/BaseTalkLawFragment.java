package cn.com.talklaw.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.jusfoun.baselibrary.base.BaseFragment;
import com.jusfoun.baselibrary.permissiongen.PermissionGen;

/**
 * @author wangcc
 * @date 2017/11/17
 * @describe
 */

public abstract class BaseTalkLawFragment extends BaseFragment{

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        PermissionGen.onRequestPermissionsResult(this,requestCode,permissions,grantResults);
    }
}
