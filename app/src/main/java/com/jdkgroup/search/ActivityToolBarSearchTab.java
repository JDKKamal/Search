package com.jdkgroup.search;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.jdkgroup.tabsearch.TabFragments.FragmentTabOne;
import com.jdkgroup.tabsearch.TabFragments.FragmentTabThree;
import com.jdkgroup.tabsearch.TabFragments.FragmentTabTwo;
import com.jdkgroup.tabsearch.Adapter.AdapterViewPager.AdapterViewPager;


public class ActivityToolBarSearchTab extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_search_tab);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        AdapterViewPager adapter = new AdapterViewPager(getSupportFragmentManager());
        adapter.addFragment(new FragmentTabOne(), "One");
        adapter.addFragment(new FragmentTabTwo(), "Two");
        adapter.addFragment(new FragmentTabThree(), "Three");
        viewPager.setAdapter(adapter);

    }


}
