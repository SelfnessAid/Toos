package com.mobi.goldstar.toosapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mobi.goldstar.toosapp.Modals.ChatAdapter;
import com.mobi.goldstar.toosapp.Modals.ChatModel;
import com.mobi.goldstar.toosapp.Modals.PostAdapter;
import com.mobi.goldstar.toosapp.Modals.PostModel;
import com.mobi.goldstar.toosapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {

    private ListView listView;
    ArrayList<ChatModel> datas;
    private static ChatAdapter adapter;

    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        listView = (ListView) view.findViewById(R.id.home_content_listview);
        datas = new ArrayList<>();
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person1));
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person2));
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person3));
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person4));
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person5));
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person1));
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person1));
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person1));
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person1));
        datas.add(new ChatModel("Person1", "08:99 PM", "Nice to meet you.", R.drawable.person1));

        adapter = new ChatAdapter(getActivity(), datas);
        listView.setAdapter(adapter);
        return view;
    }

}
