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

public class Page_22 extends BaseFragment{
    FrameLayout frameLayout_page_22;
    private PageInterface pageInterface;
    private ImageView img_page_22;

    public Page_22() {

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
        View page_22 = LayoutInflater.from(getContext()).inflate(R.layout.page_22, container, false);
        frameLayout_page_22=page_22.findViewById(R.id.frameLayout_page_22);
        img_page_22 =page_22.findViewById(R.id.page_22);


        return page_22;}



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_22.requestLayout();
    }
}