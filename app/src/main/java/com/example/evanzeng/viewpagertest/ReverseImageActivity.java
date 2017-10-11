package com.example.evanzeng.viewpagertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.evanzeng.viewpagertest.util.ImageUtil;

import java.util.ArrayList;
import java.util.List;

import static com.example.evanzeng.viewpagertest.R.id.viewPager;


/**
 * Created by Administrator on 2016/8/20.
 */

public class ReverseImageActivity extends AppCompatActivity {

    private List<ImageView> imageViewList;

    private ViewPager mViewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewPager = (ViewPager) findViewById(viewPager);
        imageViewList=new ArrayList<>();
        imageViewList=new ArrayList<>();
        //初始化网络的数据
        ImageView first=new ImageView(ReverseImageActivity.this);
        /**
         * 为imageview生成的带犹豫倒影的bitmap
         */
        first.setImageBitmap(ImageUtil.getReverseBitmapById(R.mipmap.first,ReverseImageActivity.this));
        ImageView second=new ImageView(ReverseImageActivity.this);
        second.setImageBitmap(ImageUtil.getReverseBitmapById(R.mipmap.second,ReverseImageActivity.this));
        ImageView third=new ImageView(ReverseImageActivity.this);
        third.setImageBitmap(ImageUtil.getReverseBitmapById(R.mipmap.third,ReverseImageActivity.this));
        ImageView fourth=new ImageView(ReverseImageActivity.this);
        fourth.setImageBitmap(ImageUtil.getReverseBitmapById(R.mipmap.fourth,ReverseImageActivity.this));
        ImageView fifth=new ImageView(ReverseImageActivity.this);
        fifth.setImageBitmap(ImageUtil.getReverseBitmapById(R.mipmap.fifth,ReverseImageActivity.this));

        imageViewList.add(first);
        imageViewList.add(second);
        imageViewList.add(third);
        imageViewList.add(fourth);
        imageViewList.add(fifth);
        mViewPager.setOffscreenPageLimit(3);


    }
}
