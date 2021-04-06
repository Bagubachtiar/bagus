package com.bagusbachtiar.fragmenttablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.net.JarURLConnection;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        TabLayout tabLayout;
        ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new ChatFragment());
        fragments.add(new StatusFragment());
        fragments.add(new ChatFragment());

        ArrayList<String> Judulfragment = new ArrayList<>();
        Judulfragment.add("CHAT");
        Judulfragment.add("STATUS");
        Judulfragment.add("CALL");

        MyViewPagerAdapter MyViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), fragments, Judulfragment);
        viewPager.setAdapter(MyViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}