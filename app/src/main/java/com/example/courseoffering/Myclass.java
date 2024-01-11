package com.example.courseoffering;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Myclass extends BaseAdapter {
    private Context context;
    private String[] items;

    public Myclass(Context context,String[] items){
        this.context=context;
        this.items=items;
    }
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.mycostumelayout,null,false);
            holder=new ViewHolder();
            holder.textView=view.findViewById(R.id.textview);
            view.setTag(holder);
        }
        else{
            holder=(ViewHolder) view.getTag();
        }
        holder.textView.setText(items[i]);

        return view;
    }
    public static class ViewHolder{
        TextView textView;
    }
}
