package com.mobi.goldstar.toosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.mobi.goldstar.toosapp.Modals.PostAdapter;
import com.mobi.goldstar.toosapp.Modals.PostModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ListView listView;
    ArrayList<PostModel> datas;
    private static PostAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView = (ListView) findViewById(R.id.home_content_listview);
        datas = new ArrayList<>();
        datas.add(new PostModel("ILoveYou", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 1));
        datas.add(new PostModel("ILoveYou", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 0));
        datas.add(new PostModel("ILoveYou", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 1));
        datas.add(new PostModel("ILoveYou", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 1));
        datas.add(new PostModel("ILoveYou", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 2));
        datas.add(new PostModel("ILoveYou", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 1));

        adapter = new PostAdapter(getApplicationContext(), datas);
        listView.setAdapter(adapter);
    }
}
