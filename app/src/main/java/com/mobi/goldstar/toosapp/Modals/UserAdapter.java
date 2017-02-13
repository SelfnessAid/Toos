package com.mobi.goldstar.toosapp.Modals;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.mobi.goldstar.toosapp.R;

import org.w3c.dom.Text;

import java.net.URI;
import java.util.ArrayList;


public class UserAdapter extends BaseAdapter {
    private ArrayList<PostModel> posts;
    Context context;

    private static final int USER_PROFILE = 0;
    private static final int USER_POSTS= 1;
    private static LayoutInflater inflater = null;

    public UserAdapter(Context con, ArrayList<PostModel> datas) {
        this.context = con;
        this.posts = datas;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return posts.size() + 1;
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return USER_PROFILE;
        } else {
            return USER_POSTS;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item item = new Item();
        View rowView;
        int cell_type = getItemViewType(position);
        if (cell_type == USER_PROFILE) {
            rowView = inflater.inflate(R.layout.cell_user_info, null);
        } else {
            rowView = inflater.inflate(R.layout.cell_home, null);
            item.usr_img = (CircleImageView) rowView.findViewById(R.id.profile);
            item.user_id = (TextView) rowView.findViewById(R.id.usr_id);
            item.post_time = (TextView) rowView.findViewById(R.id.post_time);
            item.post_content = (TextView) rowView.findViewById(R.id.usr_post_content);
            item.post_img = (ImageView) rowView.findViewById(R.id.usr_post_image);
            item.post_video = (VideoView) rowView.findViewById(R.id.usr_post_video);
            item.like_btn = (ImageButton) rowView.findViewById(R.id.usr_post_like_btn);
            item.comment_btn = (ImageButton) rowView.findViewById(R.id.usr_post_comment_btn);
            item.upload_btn = (ImageButton) rowView.findViewById(R.id.usr_post_upload_btn);

            Object obj = getItem(position - 1);
            PostModel post = (PostModel)obj;

            item.usr_img.setImageResource(post.usr_img_url);
            item.user_id.setText(post.usr_id);
            item.post_time.setText(post.usr_post_time);
            item.post_content.setText(post.usr_post_content);
            switch (post.usr_post_type) {
                case 0: //Text
                    item.post_img.setVisibility(View.GONE);
                    item.post_video.setVisibility(View.GONE);
                    break;
                case 1: //Image
                    item.post_img.setVisibility(View.VISIBLE);
                    item.post_img.setImageResource(post.usr_post_img_url);
                    item.post_video.setVisibility(View.GONE);
                    break;
                case 2: //Video
                    item.post_img.setVisibility(View.INVISIBLE);
                    item.post_video.setVisibility(View.VISIBLE);
                    item.post_video.setVideoURI(Uri.parse(post.usr_post_video_url));
                    item.post_video.start();
                    break;
                default:
                    break;
            }
        }

        return rowView;
    }

    public class Item {
        CircleImageView usr_img;
        TextView user_id;
        TextView post_time;
        TextView post_content;
        ImageView post_img;
        VideoView post_video;
        ImageButton like_btn;
        ImageButton comment_btn;
        ImageButton upload_btn;
    }
}
