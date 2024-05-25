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

public class Page_14 extends BaseFragment {
    FrameLayout frameLayout_page_14;
    private PageInterface pageInterface;
    private View page_14_1;
    private View page_14_2;
    private View page_14_3;
    private View page_14_4;
    private View page_14_5;
    private View page_14_6;


    public Page_14() {

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
        View page_14 = LayoutInflater.from(getContext()).inflate(R.layout.page_14, container, false);
        frameLayout_page_14=page_14.findViewById(R.id.frameLayout_page_14);
        page_14_1 = page_14.findViewById(R.id.page_14_1);
        page_14_2 = page_14.findViewById(R.id.page_14_2);
        page_14_3 = page_14.findViewById(R.id.page_14_3);
        page_14_4 = page_14.findViewById(R.id.page_14_4);
        page_14_5 = page_14.findViewById(R.id.page_14_5);
        page_14_6 = page_14.findViewById(R.id.page_14_6);



        setOnLongClickListener();


        return page_14;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_14_1) {
                pageInterface.OnLongClickListeners("page_14_1");
            }
            else if (v.getId() == R.id.page_14_2) {
                pageInterface.OnLongClickListeners("page_14_2");
            }
            else if (v.getId() == R.id.page_14_3) {
                pageInterface.OnLongClickListeners("page_14_3");
            }
            else if (v.getId() == R.id.page_14_4) {
                pageInterface.OnLongClickListeners("page_14_4");
            }
            else if (v.getId() == R.id.page_14_5) {
                pageInterface.OnLongClickListeners("page_14_5");
            }
            else if (v.getId() == R.id.page_14_6) {
                pageInterface.OnLongClickListeners("page_14_6");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_14_1.setOnLongClickListener(listener);
        page_14_2.setOnLongClickListener(listener);
        page_14_3.setOnLongClickListener(listener);
        page_14_4.setOnLongClickListener(listener);
        page_14_5.setOnLongClickListener(listener);
        page_14_6.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_14.requestLayout();
    }
}