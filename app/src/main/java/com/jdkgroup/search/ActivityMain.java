package com.jdkgroup.search;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

    private TextView tvToolbarTabSearch, tvRecyclerViewAPE;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvToolbarTabSearch = (TextView) findViewById(R.id.tvToolbarTabSearch);
        tvRecyclerViewAPE = (TextView) findViewById(R.id.tvRecyclerViewAPE);

        tvToolbarTabSearch.setOnClickListener(this);
        tvRecyclerViewAPE.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvToolbarTabSearch:
                intent = new Intent(getApplicationContext(), ActivityToolBarSearchTab.class);
                startActivity(intent);
                break;

            case R.id.tvRecyclerViewAPE:
                //intent = new Intent(getApplicationContext(),.class);
                //startActivity(intent);
                break;
        }
    }
}

