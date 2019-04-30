package com.alexdo.projects.debtninja.ui.receipt;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

public class VerticalPageTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View view, float v) {
        if (v < -1) {
            view.setAlpha(0);

        } else if (v <= 1) {
            view.setAlpha(1);
            view.setTranslationX(view.getWidth() * -v);
            float yPosition = v * view.getHeight();
            view.setTranslationY(yPosition);

        } else {
            view.setAlpha(0);
        }
    }
}
