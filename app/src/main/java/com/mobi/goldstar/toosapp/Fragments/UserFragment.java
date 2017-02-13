package com.mobi.goldstar.toosapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mobi.goldstar.toosapp.Modals.PostAdapter;
import com.mobi.goldstar.toosapp.Modals.PostModel;
import com.mobi.goldstar.toosapp.Modals.UserAdapter;
import com.mobi.goldstar.toosapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {


    private ListView listView;
    ArrayList<PostModel> datas;
    private static UserAdapter adapter;

    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        listView = (ListView) view.findViewById(R.id.user_content_listview);
        datas = new ArrayList<>();
        datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 1));
        datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person2, "asdfadsfa", R.drawable.person2, 0));
        datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person3, "asdfadsfa", R.drawable.person3, 1));
        datas.add(new PostModel("Person1", "12s", "", R.drawable.person4, "asdfadsfa", R.drawable.person4, 1));
        datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person5, "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video1, R.drawable.person5, 2));
        datas.add(new PostModel("Person1", "12s", "Nice to meet you. This is a test post and Wishing you enjoy with this", R.drawable.person1, "asdfadsfa", R.drawable.person1, 1));

        adapter = new UserAdapter(getActivity(), datas);
        listView.setAdapter(adapter);
        return view;
    }

}
