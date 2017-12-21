package cn.com.talklaw.ui.activity;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

import cn.com.talklaw.R;
import cn.com.talklaw.base.BaseTalkLawActivity;
import cn.com.talklaw.ui.adapter.HomeAdapter;

/**
 * @author zhaoyapeng
 * @version create time:17/12/2115:44
 * @Email zyp@jusfoun.com
 * @Description ${TODO}
 */
public class HomeActivity extends BaseTalkLawActivity {


    private ViewPager viewPager;
    private HomeAdapter adapter;
    private LinearLayout opinionLayout,statementLayout,myLayout;
    @Override
    public int getLayoutResId() {
        return R.layout.activity_home;
    }

    @Override
    public void initDatas() {
        adapter = new HomeAdapter(getSupportFragmentManager());
    }

    @Override
    public void initView() {
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        opinionLayout = findViewById(R.id.layout_opinion);
        statementLayout = findViewById(R.id.layout_statement);
        myLayout = findViewById(R.id.layout_my);
    }

    @Override
    public void initAction() {
        viewPager.setAdapter(adapter);
        opinionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        statementLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        myLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
