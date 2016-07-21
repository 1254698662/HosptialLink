package com.enjoyor.hospitallink.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.enjoyor.hospitallink.R;
import com.enjoyor.hospitallink.fragment.base.BaseFragment;

import butterknife.ButterKnife;

/* Created by wuzhenzhen on 2016/7/20.
 */
public class Doctor_myfolloowFagmeng extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activty_myfollow,null);
        ButterKnife.bind(this,view);
        return view;


    }
}
