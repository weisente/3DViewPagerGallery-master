package com.example.evanzeng.viewpagertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.evanzeng.viewpagertest.card.CardItem;
import com.example.evanzeng.viewpagertest.card.CardPagerAdapter;
import com.example.evanzeng.viewpagertest.card.ShadowTransformer;

/**
 * Created by san on 2017/10/11.
 */

public class NewActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);


        CardPagerAdapter cardPagerAdapter = new CardPagerAdapter();

        for(int i = 0 ;i <10;i++){
            cardPagerAdapter.addCardItem(new CardItem(R.string.app_name,R.string.app_name));
        }

        ShadowTransformer shadowTransformer = new ShadowTransformer(mViewPager, cardPagerAdapter);
        mViewPager.setAdapter(cardPagerAdapter);
        mViewPager.setPageTransformer(false,shadowTransformer);
        mViewPager.setOffscreenPageLimit(3);
        shadowTransformer.enableScaling(true);
    }
}
