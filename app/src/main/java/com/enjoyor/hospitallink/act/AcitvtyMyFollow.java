package com.enjoyor.hospitallink.act;

import android.os.Bundle;
import android.view.View;

import com.enjoyor.hospitallink.R;
import com.enjoyor.hospitallink.act.base.ToolBarActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by wuzhenzhen on 2016/7/20.
 */
public class AcitvtyMyFollow extends ToolBarActivity {
    @Bind(R.id.iv_myfollow)
    View iv_myfollow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_myfollow,false);
        ButterKnife.bind(this);
        setTitle("我的关注");
    }
}
