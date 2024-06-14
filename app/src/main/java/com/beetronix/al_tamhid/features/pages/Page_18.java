package com.beetronix.al_tamhid.features.pages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.features.PageInterface;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_18 extends BaseFragment{
    FrameLayout frameLayout_page_18;
    private PageInterface pageInterface;

    public Page_18() {

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            pageInterface = (PageInterface) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement TextClicked");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View page_18 = LayoutInflater.from(getContext()).inflate(R.layout.page_18, container, false);
        frameLayout_page_18=page_18.findViewById(R.id.frameLayout_page_18);


        return page_18;}



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_18.requestLayout();
    }
}