package com.beetronix.al_tamhid.features.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.beetronix.al_tamhid.R;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_28 extends BaseFragment {
    FrameLayout frameLayout_Page_28;

    public Page_28() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_28 = LayoutInflater.from(getContext()).inflate(R.layout.page_28, container, false);
        frameLayout_Page_28=page_28.findViewById(R.id.frameLayout_page_28);

        return page_28;
    }
    @Override
    public void onResume() {
        super.onResume();
        frameLayout_Page_28.requestLayout();
    }
}