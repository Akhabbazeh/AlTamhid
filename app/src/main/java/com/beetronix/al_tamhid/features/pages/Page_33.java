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

public class Page_33 extends BaseFragment {
    FrameLayout frameLayout_page_33;
    private PageInterface pageInterface;
    private View page_33_1;
    private View page_33_2;
    private View page_33_3;
    private View page_33_4;
    private View page_33_5;
    private View page_33_6;
    private View page_33_7;
    private View page_33_8;
    private View page_33_9;
    private View page_33_10;
    private View page_33_11;
    private View page_33_12;
    private View page_33_13;
    private View page_33_14;
    private View page_33_15;
    private View page_33_16;


    public Page_33() {

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
        View page_33 = LayoutInflater.from(getContext()).inflate(R.layout.page_33, container, false);
        frameLayout_page_33=page_33.findViewById(R.id.frameLayout_page_33);
        page_33_1 = page_33.findViewById(R.id.page_33_1);
        page_33_2 = page_33.findViewById(R.id.page_33_2);
        page_33_3 = page_33.findViewById(R.id.page_33_3);
        page_33_4 = page_33.findViewById(R.id.page_33_4);
        page_33_5 = page_33.findViewById(R.id.page_33_5);
        page_33_6 = page_33.findViewById(R.id.page_33_6);
        page_33_7 = page_33.findViewById(R.id.page_33_7);
        page_33_8 = page_33.findViewById(R.id.page_33_8);
        page_33_9 = page_33.findViewById(R.id.page_33_9);
        page_33_10 = page_33.findViewById(R.id.page_33_10);
        page_33_11 = page_33.findViewById(R.id.page_33_11);
        page_33_12 = page_33.findViewById(R.id.page_33_12);
        page_33_13 = page_33.findViewById(R.id.page_33_13);
        page_33_14 = page_33.findViewById(R.id.page_33_14);
        page_33_15 = page_33.findViewById(R.id.page_33_15);
        page_33_16 = page_33.findViewById(R.id.page_33_16);



        setOnLongClickListener();


        return page_33;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_33_1) {
                pageInterface.OnLongClickListeners("page_33_1");
            }
            else if (v.getId() == R.id.page_33_2) {
                pageInterface.OnLongClickListeners("page_33_2");
            }
            else if (v.getId() == R.id.page_33_3) {
                pageInterface.OnLongClickListeners("page_33_3");
            }
            else if (v.getId() == R.id.page_33_4) {
                pageInterface.OnLongClickListeners("page_33_4");
            }
            else if (v.getId() == R.id.page_33_5) {
                pageInterface.OnLongClickListeners("page_33_5");
            }
            else if (v.getId() == R.id.page_33_6) {
                pageInterface.OnLongClickListeners("page_33_6");
            }
            else if (v.getId() == R.id.page_33_7) {
                pageInterface.OnLongClickListeners("page_33_7");
            }
            else if (v.getId() == R.id.page_33_8) {
                pageInterface.OnLongClickListeners("page_33_8");
            }
            else if (v.getId() == R.id.page_33_9) {
                pageInterface.OnLongClickListeners("page_33_9");
            }
            else if (v.getId() == R.id.page_33_10) {
                pageInterface.OnLongClickListeners("page_33_10");
            }
            else if (v.getId() == R.id.page_33_11) {
                pageInterface.OnLongClickListeners("page_33_11");
            }
            else if (v.getId() == R.id.page_33_12) {
                pageInterface.OnLongClickListeners("page_33_12");
            }
            else if (v.getId() == R.id.page_33_13) {
                pageInterface.OnLongClickListeners("page_33_13");
            }
            else if (v.getId() == R.id.page_33_14) {
                pageInterface.OnLongClickListeners("page_33_14");
            }
            else if (v.getId() == R.id.page_33_15) {
                pageInterface.OnLongClickListeners("page_33_15");
            }
            else if (v.getId() == R.id.page_33_16) {
                pageInterface.OnLongClickListeners("page_33_16");
            }



            return true;
        }
    };
    private void setOnLongClickListener(){
        page_33_1.setOnLongClickListener(listener);
        page_33_2.setOnLongClickListener(listener);
        page_33_3.setOnLongClickListener(listener);
        page_33_4.setOnLongClickListener(listener);
        page_33_5.setOnLongClickListener(listener);
        page_33_6.setOnLongClickListener(listener);
        page_33_7.setOnLongClickListener(listener);
        page_33_8.setOnLongClickListener(listener);
        page_33_9.setOnLongClickListener(listener);
        page_33_10.setOnLongClickListener(listener);
        page_33_11.setOnLongClickListener(listener);
        page_33_12.setOnLongClickListener(listener);
        page_33_13.setOnLongClickListener(listener);
        page_33_14.setOnLongClickListener(listener);
        page_33_15.setOnLongClickListener(listener);
        page_33_16.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_33.requestLayout();
    }
}