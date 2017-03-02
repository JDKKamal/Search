package com.jdkgroup.tabsearch.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jdkgroup.search.R;
import com.jdkgroup.tabsearch.viewholder.ItemViewHolder;
import com.jdkgroup.tabsearch.Model.ModelCountry;

import java.util.ArrayList;
import java.util.List;

public class AdapterToolbarSearchTab extends RecyclerView.Adapter<ItemViewHolder> {

    private List<ModelCountry> mCountryModel;
    private List<ModelCountry> mOriginalCountryModel;

    public AdapterToolbarSearchTab(List<ModelCountry> mCountryModel) {
        this.mCountryModel = mCountryModel;
        this.mOriginalCountryModel = mCountryModel;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        final ModelCountry model = mCountryModel.get(i);
        itemViewHolder.bind(model);
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemview_toolbar_search_tab, viewGroup, false);
        return new ItemViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mCountryModel.size();
    }

    public void setFilter(List<ModelCountry> countryModels){
        mCountryModel = new ArrayList<>();
        mCountryModel.addAll(countryModels);
        notifyDataSetChanged();
    }

}
