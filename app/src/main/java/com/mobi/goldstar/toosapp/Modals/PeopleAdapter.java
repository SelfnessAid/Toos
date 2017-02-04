package com.mobi.goldstar.toosapp.Modals;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobi.goldstar.toosapp.R;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>{
    private ArrayList<Integer> peoples;
    Context context;

    private static LayoutInflater inflater = null;

    public PeopleAdapter(Context con, ArrayList<Integer> datas) {
        this.context = con;
        this.peoples = datas;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public PeopleAdapter.PeopleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_people, parent, false);
        PeopleViewHolder viewHolder = new PeopleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PeopleAdapter.PeopleViewHolder holder, int position) {
        holder.people.setImageResource(peoples.get(position));
    }

    @Override
    public int getItemCount() {
        return peoples.size();
    }

    public static class PeopleViewHolder extends RecyclerView.ViewHolder {
        CircleImageView people;
        public PeopleViewHolder(View itemView) {
            super(itemView);
            people = (CircleImageView) itemView.findViewById(R.id.search_people_item);
        }
    }
}
