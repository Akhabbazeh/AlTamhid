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

public class Page_34 extends BaseFragment{
    FrameLayout frameLayout_page_34;
    private PageInterface pageInterface;
    private ImageView img_page_34;

    public Page_34() {

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
        View page_34 = LayoutInflater.from(getContext()).inflate(R.layout.page_34, container, false);
        frameLayout_page_34=page_34.findViewById(R.id.frameLayout_page_34);
        img_page_34 =page_34.findViewById(R.id.page_34);



        return page_34;}



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_34.requestLayout();
    }
}