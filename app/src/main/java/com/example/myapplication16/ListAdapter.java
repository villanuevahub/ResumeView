package com.example.myapplication16;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater layoutInflater;
    private List<Users>usersList;

    public ListAdapter(Activity activity, List<Users> usersList) {
        this.activity = activity;
        this.usersList = usersList;
    }

    @Override
    public int getCount() {
        return usersList.size();
    }

    @Override
    public Object getItem(int position) {
        return usersList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Users users = usersList.get(position);
        //View converView;
        //convertView = layoutInflater.inflate(R.layout.list_item, null);
        if (layoutInflater == null)
            layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = layoutInflater.inflate(R.layout.list_textview, null);
        TextView list_item = (TextView)convertView.findViewById(R.id.tVusrlsitem);
        list_item.setText(usersList.get(position).getFirst_Name()+" "+usersList.get(position).getSecond_Name()+" "+usersList.get(position).getLast_Name());
        return convertView;
    }
}
