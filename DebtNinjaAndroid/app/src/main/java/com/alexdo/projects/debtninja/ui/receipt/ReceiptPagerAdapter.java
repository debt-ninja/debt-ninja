package com.alexdo.projects.debtninja.ui.receipt;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.alexdo.projects.debtninja.ui.receipt.camera.CameraFragment;
import com.alexdo.projects.debtninja.ui.receipt.edit.EditFragment;

public class ReceiptPagerAdapter extends FragmentPagerAdapter {

    private static int ITEM_COUNT = 2;

    public ReceiptPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                return EditFragment.newInstance("", "Page # 1");
            case 1:
                return CameraFragment.newInstance("", "Page # 2");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return ITEM_COUNT;
    }
}
