package com.example.hwhong.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hwhong on 7/10/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{
    String[] countryName, capitalName;

    public RecyclerAdapter (String[] countryName, String[] capitalName ) {
        this.countryName = countryName;
        this.capitalName = capitalName;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.row_layout, parent, false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.country.setText(countryName[position]);
        holder.capital.setText(capitalName[position]);
    }

    @Override
    public int getItemCount() {
        return countryName.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView country;
        TextView capital;

        public RecyclerViewHolder(View view) {
            super(view);

            country = (TextView) view.findViewById(R.id.countryName);
            capital = (TextView) view.findViewById(R.id.capitalName);
        }
    }
}
