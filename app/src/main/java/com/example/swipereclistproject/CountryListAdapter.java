package com.example.swipereclistproject;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.MyViewHolder> implements Filterable {

    private Context context;
    private ArrayList<Item> itemList;

    public  static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView country_names;
        TextView language_spoken;
        TextView currencies_used;
        RelativeLayout viewForeground,viewBackgraound;

        public MyViewHolder(View itemView) {
            super(itemView);

            country_names = itemView.findViewById(R.id.country_name);
            language_spoken = itemView.findViewById(R.id.country_language);
            currencies_used = itemView.findViewById(R.id.country_currency);
            viewForeground = itemView.findViewById(R.id.view_foreground);
            viewBackgraound= itemView.findViewById(R.id.view_background);
        }
    }

    public CountryListAdapter(Context context, ArrayList<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
      //  Log.d("itemlist", String.valueOf(itemList.get(0).getCountryName()));
    }

    @Override
    public CountryListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View myView = LayoutInflater.from(parent.getContext())
                                       .inflate(R.layout.list_item,parent,false);

        return new MyViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(CountryListAdapter.MyViewHolder holder, int position) {

        final Item item = itemList.get(position);
        Log.d("itemlist",item.toString());
        holder.country_names.setText(item.getCountryName());
        holder.currencies_used.setText(item.getCurrenciesUsed().get(0));
        holder.language_spoken.setText(item.getLanguagesSpoken().get(0));

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void removeItem(int position) {
        itemList.remove(position);
        // notify the item removed by position
        // to perform recycler view delete animations
        // NOTE: don't call notifyDataSetChanged()
        notifyItemRemoved(position);
    }

    public void restoreItem(Item item, int position) {
        itemList.add(position, item);
        // notify item added by position
        notifyItemInserted(position);
    }

    @Override
    public Filter getFilter() {
        return null;
    }
}
