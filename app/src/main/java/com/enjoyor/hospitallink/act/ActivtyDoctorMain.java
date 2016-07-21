package com.enjoyor.hospitallink.act;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


import com.enjoyor.hospitallink.R;
import com.enjoyor.hospitallink.act.base.ToolBarActivity;
import com.enjoyor.hospitallink.adapter.Arr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by wuzhenzhen on 2016/7/8.
 */
public class ActivtyDoctorMain extends ToolBarActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
//    @Bind(R.id.data_text)
//    LinearLayout linearLayout;

    private Long data_long;
    @Bind(R.id.grid_view)
    GridView grid_view;
    List<String> list_day;
    List<String> list_monter;
    public static int doctor_main = 200;
    private Arr arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_doctor_main, false);
        ButterKnife.bind(this);
        setTitle("医生主页");
        setRightTvBtn("提交");
        getRightTvBtn().setOnClickListener(this);
        data_long = System.currentTimeMillis();
        list_day = new ArrayList<String>();
        list_monter = new ArrayList<String>();
        tiem_data(data_long);
        arr = new Arr(ActivtyDoctorMain.this, list_monter, list_day);

        grid_view.setAdapter(arr);
        grid_view.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ActivtyDoctorMain.this, AppointDetialActivity.class);
        startActivity(intent);
    }

    private void tiem_data(Long data_drop) {
        Date data = null;

        for (int i = 0; i < 7; i++) {
            SimpleDateFormat format = new SimpleDateFormat("MM-dd");
            Long as_data = 60 * 60 * 24 * 1000 * (i + 1) + data_drop;
            String d = format.format(as_data);
            try {
                data = format.parse(d);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Log.e("wokao", format.format(as_data) + "");
            list_monter.add(format.format(as_data));
            switch (data.getDay()) {
                case 1:
                    list_day.add("周三");
                    break;
                case 2:
                    list_day.add("周四");
                    break;
                case 3:
                    list_day.add("周五");
                    break;
                case 4:
                    list_day.add("周六");
                    break;
                case 5:
                    list_day.add("周日");
                    break;
                case 6:
                    list_day.add("周一");
                    break;
                case 0:
                    list_day.add("周二");
                    break;


            }
        }


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        doctor_main = position;
        arr.notifyDataSetInvalidated();
    }
}
