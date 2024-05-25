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

public class Page_24 extends BaseFragment {
    FrameLayout frameLayout_page_24;
    private PageInterface pageInterface;
    private View page_24_1;
    private View page_24_2;
    private View page_24_3;
    private View page_24_4;
    private View page_24_5;
    private View page_24_6;
    private View page_24_7;
    private View page_24_8;
    private View page_24_9;
    private View page_24_10;
    private View page_24_11;
    private View page_24_12;
    private View page_24_13;
    private View page_24_14;
    private View page_24_15;
    private View page_24_16;
    private View page_24_17;


    public Page_24() {

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
        View page_24 = LayoutInflater.from(getContext()).inflate(R.layout.page_24, container, false);
        frameLayout_page_24=page_24.findViewById(R.id.frameLayout_page_24);
        page_24_1 = page_24.findViewById(R.id.page_24_1);
        page_24_2 = page_24.findViewById(R.id.page_24_2);
        page_24_3 = page_24.findViewById(R.id.page_24_3);
        page_24_4 = page_24.findViewById(R.id.page_24_4);
        page_24_5 = page_24.findViewById(R.id.page_24_5);
        page_24_6 = page_24.findViewById(R.id.page_24_6);
        page_24_7 = page_24.findViewById(R.id.page_24_7);
        page_24_8 = page_24.findViewById(R.id.page_24_8);
        page_24_9 = page_24.findViewById(R.id.page_24_9);
        page_24_10 = page_24.findViewById(R.id.page_24_10);
        page_24_11 = page_24.findViewById(R.id.page_24_11);
        page_24_12 = page_24.findViewById(R.id.page_24_12);
        page_24_13 = page_24.findViewById(R.id.page_24_13);
        page_24_14 = page_24.findViewById(R.id.page_24_14);
        page_24_15 = page_24.findViewById(R.id.page_24_15);
        page_24_16 = page_24.findViewById(R.id.page_24_16);
        page_24_17 = page_24.findViewById(R.id.page_24_17);



        setOnLongClickListener();


        return page_24;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_24_1) {
                pageInterface.OnLongClickListeners("page_24_1");
            }
            else if (v.getId() == R.id.page_24_2) {
                pageInterface.OnLongClickListeners("page_24_2");
            }
            else if (v.getId() == R.id.page_24_3) {
                pageInterface.OnLongClickListeners("page_24_3");
            }
            else if (v.getId() == R.id.page_24_4) {
                pageInterface.OnLongClickListeners("page_24_4");
            }
            else if (v.getId() == R.id.page_24_5) {
                pageInterface.OnLongClickListeners("page_24_5");
            }
            else if (v.getId() == R.id.page_24_6) {
                pageInterface.OnLongClickListeners("page_24_6");
            }
            else if (v.getId() == R.id.page_24_7) {
                pageInterface.OnLongClickListeners("page_24_7");
            }
            else if (v.getId() == R.id.page_24_8) {
                pageInterface.OnLongClickListeners("page_24_8");
            }
            else if (v.getId() == R.id.page_24_9) {
                pageInterface.OnLongClickListeners("page_24_9");
            }
            else if (v.getId() == R.id.page_24_10) {
                pageInterface.OnLongClickListeners("page_24_10");
            }
            else if (v.getId() == R.id.page_24_11) {
                pageInterface.OnLongClickListeners("page_24_11");
            }
            else if (v.getId() == R.id.page_24_12) {
                pageInterface.OnLongClickListeners("page_24_12");
            }
            else if (v.getId() == R.id.page_24_13) {
                pageInterface.OnLongClickListeners("page_24_13");
            }
            else if (v.getId() == R.id.page_24_14) {
                pageInterface.OnLongClickListeners("page_24_14");
            }
            else if (v.getId() == R.id.page_24_15) {
                pageInterface.OnLongClickListeners("page_24_15");
            }
            else if (v.getId() == R.id.page_24_16) {
                pageInterface.OnLongClickListeners("page_24_16");
            }
            else if (v.getId() == R.id.page_24_17) {
                pageInterface.OnLongClickListeners("page_24_17");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_24_1.setOnLongClickListener(listener);
        page_24_2.setOnLongClickListener(listener);
        page_24_3.setOnLongClickListener(listener);
        page_24_4.setOnLongClickListener(listener);
        page_24_5.setOnLongClickListener(listener);
        page_24_6.setOnLongClickListener(listener);
        page_24_7.setOnLongClickListener(listener);
        page_24_8.setOnLongClickListener(listener);
        page_24_9.setOnLongClickListener(listener);
        page_24_10.setOnLongClickListener(listener);
        page_24_11.setOnLongClickListener(listener);
        page_24_12.setOnLongClickListener(listener);
        page_24_13.setOnLongClickListener(listener);
        page_24_14.setOnLongClickListener(listener);
        page_24_15.setOnLongClickListener(listener);
        page_24_16.setOnLongClickListener(listener);
        page_24_17.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_24.requestLayout();
    }
}