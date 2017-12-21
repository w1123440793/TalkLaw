package cn.com.talklaw.ui.fragment;

import cn.com.talklaw.R;
import cn.com.talklaw.base.BaseTalkLawFragment;

/**
 * @author zhaoyapeng
 * @version create time:17/12/2115:49
 * @Email zyp@jusfoun.com
 * @Description ${首页fragment}
 */
public class HomeFragment extends BaseTalkLawFragment {


    public static HomeFragment getInstance(){
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initDatas() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initAction() {

    }
}
