package com.mobi.goldstar.toosapp.Modals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mobi.goldstar.toosapp.R;

import java.util.ArrayList;


public class NotificationAdapter extends BaseAdapter {
    private ArrayList<ChatModel> chats;
    Context context;
    private static LayoutInflater inflater = null;
    public NotificationAdapter(Context con, ArrayList<ChatModel> datas) {
        this.context = con;
        this.chats = datas;
        inflater = (LayoutInflater)context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return chats.size();
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
        rowView = inflater.inflate(R.layout.cell_notification, null);
        CircleImageView circleImageView = (CircleImageView) rowView.findViewById(R.id.notification_user_profile);
        circleImageView.setImageResource(chats.get(position).usr_img_url);
        TextView chat_timeView = (TextView) rowView.findViewById(R.id.notification_chat_time);
        chat_timeView.setText(chats.get(position).usr_post_time);
        TextView chat_contentView = (TextView) rowView.findViewById(R.id.notification_user_chat_content);
        chat_contentView.setText(chats.get(position).usr_post_content);
        TextView chat_nameView = (TextView) rowView.findViewById(R.id.notification_user_name);
        chat_nameView.setText(chats.get(position).usr_id);
        return rowView;
    }
}
