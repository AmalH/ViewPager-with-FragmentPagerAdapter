package com.androidprojects.esprit.viewpagerwithfragmentpageradapter;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    TabsPagerAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager vpPager = (ViewPager) findViewById(R.id.viewpager);
        myAdapter = new TabsPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(myAdapter);
    }
}
