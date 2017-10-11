package com.example.evanzeng.viewpagertest.ViewPager;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by san on 2017/10/11.
 */

public class NewTranformation implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        final float SCALE_MAX = 0.9f;
        final float ALPHA_MAX = 0.5f;

        float scale = (position < 0)
                ? ((1 - SCALE_MAX) * position + 1)
                : ((SCALE_MAX - 1) * position + 1);
        float alpha = (position < 0)
                ? ((1 - ALPHA_MAX) * position + 1)
                : ((ALPHA_MAX - 1) * position + 1);
        //为了滑动过程中，page间距不变，这里做了处理
        if(position < 0) {
            ViewCompat.setPivotX(page, page.getWidth());
            ViewCompat.setPivotY(page, page.getHeight() / 2);
        } else {
            ViewCompat.setPivotX(page, 0);
            ViewCompat.setPivotY(page, page.getHeight() / 2);
        }
        ViewCompat.setScaleX(page, scale);
        ViewCompat.setScaleY(page, scale);
        ViewCompat.setAlpha(page, Math.abs(alpha));



    }
}
