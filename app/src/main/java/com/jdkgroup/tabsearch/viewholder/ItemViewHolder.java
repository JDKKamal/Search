package com.jdkgroup.tabsearch.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.jdkgroup.search.R;
import com.jdkgroup.tabsearch.Model.ModelCountry;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView tvCountryName;
    public TextView tvCountryISO;

    public ItemViewHolder(View itemView) {
        super(itemView);
        itemView.setClickable(true);
        tvCountryName = (TextView) itemView.findViewById(R.id.tvCountryName);
        tvCountryISO = (TextView) itemView.findViewById(R.id.tvCountryISO);
    }

    public void bind(ModelCountry countryModel) {
        tvCountryName.setText(countryModel.getName());
        tvCountryISO.setText(countryModel.getisoCode());
    }
}
