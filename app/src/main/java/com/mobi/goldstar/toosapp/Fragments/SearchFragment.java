package com.mobi.goldstar.toosapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.mobi.goldstar.toosapp.Modals.HashtagsAdaptor;
import com.mobi.goldstar.toosapp.Modals.PeopleAdapter;
import com.mobi.goldstar.toosapp.Modals.PostAdapter;
import com.mobi.goldstar.toosapp.Modals.PostModel;
import com.mobi.goldstar.toosapp.Modals.SearchAdapter;
import com.mobi.goldstar.toosapp.R;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    private ListView hashtags_listview, posts_listview;
    RecyclerView people_listView;
    ArrayList<PostModel> post_datas;
    ArrayList<Integer> people_datas;
    ArrayList<String> hashtag_datas;

    private static SearchAdapter post_adapter;
    private static PeopleAdapter peopleAdapter;
    private static HashtagsAdaptor hashtagsAdaptor;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        View hashtagsView = inflater.inflate(R.layout.hashtags_listview, container, false);


        posts_listview = (ListView) view.findViewById(R.id.search_posts_list_view);
        post_datas = new ArrayList<>();
        post_datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 1));
        post_datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person2, "asdfadsfa", R.drawable.person2, 0));
        post_datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person3, "asdfadsfa", R.drawable.person3, 1));
        post_datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person4, "asdfadsfa", R.drawable.person4, 1));
        post_datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person5, "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video1, R.drawable.person5, 2));
        post_datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 1));

        post_adapter = new SearchAdapter(getActivity(), post_datas);
        posts_listview.setAdapter(post_adapter);

        return view;
    }

}
