package com.beetronix.al_tamhid.features.pages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.beetronix.al_tamhid.R;
import com.beetronix.al_tamhid.features.PageInterface;
import com.beetronix.al_tamhid.util.Tool;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_21 extends BaseFragment{
    FrameLayout frameLayout_page_21;
    private PageInterface pageInterface;
    private ImageView img_page_21;

    public Page_21() {

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
        View page_21 = LayoutInflater.from(getContext()).inflate(R.layout.page_21, container, false);
        frameLayout_page_21=page_21.findViewById(R.id.frameLayout_page_21);
        img_page_21 =page_21.findViewById(R.id.page_21);




        return page_21;}



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_21.requestLayout();
    }
}