package com.enjoyor.hospitallink.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.enjoyor.hospitallink.R;
import com.enjoyor.hospitallink.act.ActivtyDoctorMain;

import java.util.List;

/**
 * Created by wuzhenzhen on 2016/7/12.
 */
public class Arr extends BaseAdapter{
   private Context context;
    private  Volhview volhview;
    private List<String>list_grid,list_day;
    public Arr( Context context,List<String>list_grid,List<String>list_day){
        this.list_grid=list_grid;
        this.list_day=list_day;
      this.context=context;
  }
    @Override
    public int getCount() {
        return 21;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.aaa,null);
            volhview=new Volhview();
            volhview.data_grid= (TextView) convertView.findViewById(R.id.grid_data1);
            volhview.data_day= (TextView) convertView.findViewById(R.id.grid_day);
            convertView.setTag(volhview);
        }else {
            convertView.getTag();

        }

        if (position<7){
            volhview.data_grid.setText(list_grid.get(position));
            volhview.data_day.setText(list_day.get(position));
        }else {
            volhview.data_grid.setText("余40号");
            volhview.data_day.setText("50元");
        }
if (ActivtyDoctorMain.doctor_main==position&&ActivtyDoctorMain.doctor_main>6){
    convertView.setBackgroundColor(convertView.getResources().getColor(R.color.hl_color_blue));


}else {
    convertView.setBackgroundColor(convertView.getResources().getColor(R.color.hl_color_white));

}
        return convertView;
    }

}
  class Volhview{
      TextView data_grid,data_day;


  }