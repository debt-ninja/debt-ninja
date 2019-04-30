package com.alexdo.projects.debtninja.ui.receipt;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.alexdo.projects.debtninja.R;

public class ReceiptFragment extends Fragment {

    private ReceiptViewModel mViewModel;
    FragmentPagerAdapter adapterViewPager;


    public static ReceiptFragment newInstance() {
        return new ReceiptFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.receipt_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ReceiptViewModel.class);
        ViewPager viewPager = (ViewPager) getActivity().findViewById(R.id.viewPager);
        viewPager.setPageTransformer(true, new VerticalPageTransformer());
        adapterViewPager = new ReceiptPagerAdapter(getActivity().getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPager);
    }

    //^[0-9]+([.,]?[0-9]{1,2})?$

}
