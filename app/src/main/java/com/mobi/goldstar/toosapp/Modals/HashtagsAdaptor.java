package com.mobi.goldstar.toosapp.Modals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mobi.goldstar.toosapp.R;

import java.util.ArrayList;

public class HashtagsAdaptor extends BaseAdapter{
    private ArrayList<String> hashtags;
    Context context;
    private static LayoutInflater inflater = null;
    private int tagCount;

    public HashtagsAdaptor(Context con, ArrayList<String> datas) {
        this.context = con;
        this.hashtags = datas;
        tagCount = hashtags.size();
        inflater = (LayoutInflater)context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        if (tagCount%2==0)
            return tagCount/2;
        else
            return tagCount/2 + 1;
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
        View rowView;
        rowView = inflater.inflate(R.layout.cell_hashtags, null);
        TextView firstView = (TextView) rowView.findViewById(R.id.search_hastags_first_item);
        firstView.setText(hashtags.get(position));
        TextView secondView = (TextView) rowView.findViewById(R.id.search_hastags_second_item);
        if ((position + tagCount/2 + 1) < tagCount)
            secondView.setText(hashtags.get(position + tagCount/2 + 1));
        return rowView;
    }
}
