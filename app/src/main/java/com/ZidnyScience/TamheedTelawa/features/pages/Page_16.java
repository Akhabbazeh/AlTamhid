package com.ZidnyScience.TamheedTelawa.features.pages;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.ZidnyScience.TamheedTelawa.R;
import com.ZidnyScience.TamheedTelawa.features.PageInterface;
import com.example.myapplication.features.ui.BaseFragment;

public class Page_16 extends BaseFragment{
    FrameLayout frameLayout_page_16;
    private PageInterface pageInterface;
    private ImageView img_page_16;

    public Page_16() {

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
        View page_16 = LayoutInflater.from(getContext()).inflate(R.layout.page_16, container, false);
        frameLayout_page_16=page_16.findViewById(R.id.frameLayout_page_16);
        img_page_16 =page_16.findViewById(R.id.page_16);



        return page_16;}



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_16.requestLayout();
    }
}