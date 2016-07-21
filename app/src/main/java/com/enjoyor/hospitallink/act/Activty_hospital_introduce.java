package com.enjoyor.hospitallink.act;

import android.os.Bundle;

import com.enjoyor.hospitallink.R;
import com.enjoyor.hospitallink.act.base.ToolBarActivity;

import butterknife.ButterKnife;

/**
 * Created by wuzhenzhen on 2016/7/20.
 * 医院介绍
 */
public class Activty_hospital_introduce extends ToolBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_hospital_introduce,false);
        ButterKnife.bind(this);
    }
}
