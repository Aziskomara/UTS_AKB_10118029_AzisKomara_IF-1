// Tanggal : 26 05 2021
// Nim     : 10118029
// Nama    : Azis Komara
// Kelas   : IF-1
package com.example.utsakb_azira;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.utsakb_azira.fragments.PageFragment1;
import com.example.utsakb_azira.fragments.PageFragment2;
import com.example.utsakb_azira.fragments.PageFragment3;

import java.util.ArrayList;
import java.util.List;

public class Walkthrough extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    TextView tv_page_counter;
    Button button1;
    int total = 3 , count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        List<Fragment> List = new ArrayList<>();
        List.add(new PageFragment1());
        List.add(new PageFragment2());
        List.add(new PageFragment3());


        tv_page_counter = findViewById(R.id.pageCounter);
        tv_page_counter.setText(count +"/"+ total);
        button1 = findViewById(R.id.button1);


        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),List);

        pager.setAdapter(pagerAdapter);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                count = 0;
                count = position + 1;
                tv_page_counter.setText(count +"/"+ total);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void mulai(View view){
        Intent intent2 = new Intent(Walkthrough.this,Home.class);
        startActivity(intent2);
        finish();

    }


}