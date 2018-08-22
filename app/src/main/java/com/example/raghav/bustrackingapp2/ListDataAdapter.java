package com.example.raghav.bustrackingapp2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import  java.util.ArrayList;
import  java.util.List;
import  java.lang.Object;

import static android.R.id.list;



public class ListDataAdapter extends ArrayAdapter {
    List list;
    public ListDataAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class LayoutHandler
    {
        TextView BUS,DRIVER,ROUTE,DL;

    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }
     @Override
    public int getCount(){
         return list.size();
     }

     @Override
    public Object getItem(int position){
         return list.get(position);
     }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;
        LayoutHandler layoutHandler;
        if(row == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.row_layout,parent,false);
            layoutHandler = new LayoutHandler();
            layoutHandler.BUS = (TextView)row.findViewById(R.id.text_bus_no);
            layoutHandler.DRIVER = (TextView)row.findViewById(R.id.text_drive_name);
            layoutHandler.ROUTE = (TextView)row.findViewById(R.id.text_route_no);
            layoutHandler.DL = (TextView)row.findViewById(R.id.text_dl_no);
            row.setTag(layoutHandler);

        }
        else
        {
            layoutHandler = (LayoutHandler) row.getTag();

        }
        DataProvider dataProvider = (DataProvider)this.getItem(position);
        layoutHandler.BUS.setText(dataProvider.getBus());
        layoutHandler.DRIVER.setText(dataProvider.getDriver());
        layoutHandler.ROUTE.setText(dataProvider.getRoute());
        layoutHandler.DL.setText(dataProvider.getDl());


        return row;
    }
}