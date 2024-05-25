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

public class Page_36 extends BaseFragment {
    FrameLayout frameLayout_page_36;
    private PageInterface pageInterface;
    private View page_36_1;
    private View page_36_2;
    private View page_36_3;
    private View page_36_4;
    private View page_36_5;
    private View page_36_6;
    private View page_36_7;
    private View page_36_8;
    private View page_36_9;
    private View page_36_10;
    private View page_36_11;
    private View page_36_12;
    private View page_36_13;
    private View page_36_14;
    private View page_36_15;
    private View page_36_16;
    private View page_36_17;


    public Page_36() {

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
        View page_36 = LayoutInflater.from(getContext()).inflate(R.layout.page_36, container, false);
        frameLayout_page_36=page_36.findViewById(R.id.frameLayout_page_36);
        page_36_1 = page_36.findViewById(R.id.page_36_1);
        page_36_2 = page_36.findViewById(R.id.page_36_2);
        page_36_3 = page_36.findViewById(R.id.page_36_3);
        page_36_4 = page_36.findViewById(R.id.page_36_4);
        page_36_5 = page_36.findViewById(R.id.page_36_5);
        page_36_6 = page_36.findViewById(R.id.page_36_6);
        page_36_7 = page_36.findViewById(R.id.page_36_7);
        page_36_8 = page_36.findViewById(R.id.page_36_8);
        page_36_9 = page_36.findViewById(R.id.page_36_9);
        page_36_10 = page_36.findViewById(R.id.page_36_10);
        page_36_11 = page_36.findViewById(R.id.page_36_11);
        page_36_12 = page_36.findViewById(R.id.page_36_12);
        page_36_13 = page_36.findViewById(R.id.page_36_13);
        page_36_14 = page_36.findViewById(R.id.page_36_14);
        page_36_15 = page_36.findViewById(R.id.page_36_15);
        page_36_16 = page_36.findViewById(R.id.page_36_16);
        page_36_17 = page_36.findViewById(R.id.page_36_17);



        setOnLongClickListener();


        return page_36;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_36_1) {
                pageInterface.OnLongClickListeners("page_36_1");
            }
            else if (v.getId() == R.id.page_36_2) {
                pageInterface.OnLongClickListeners("page_36_2");
            }
            else if (v.getId() == R.id.page_36_3) {
                pageInterface.OnLongClickListeners("page_36_3");
            }
            else if (v.getId() == R.id.page_36_4) {
                pageInterface.OnLongClickListeners("page_36_4");
            }
            else if (v.getId() == R.id.page_36_5) {
                pageInterface.OnLongClickListeners("page_36_5");
            }
            else if (v.getId() == R.id.page_36_6) {
                pageInterface.OnLongClickListeners("page_36_6");
            }
            else if (v.getId() == R.id.page_36_7) {
                pageInterface.OnLongClickListeners("page_36_7");
            }
            else if (v.getId() == R.id.page_36_8) {
                pageInterface.OnLongClickListeners("page_36_8");
            }
            else if (v.getId() == R.id.page_36_9) {
                pageInterface.OnLongClickListeners("page_36_9");
            }
            else if (v.getId() == R.id.page_36_10) {
                pageInterface.OnLongClickListeners("page_36_10");
            }
            else if (v.getId() == R.id.page_36_11) {
                pageInterface.OnLongClickListeners("page_36_11");
            }
            else if (v.getId() == R.id.page_36_12) {
                pageInterface.OnLongClickListeners("page_36_12");
            }
            else if (v.getId() == R.id.page_36_13) {
                pageInterface.OnLongClickListeners("page_36_13");
            }
            else if (v.getId() == R.id.page_36_14) {
                pageInterface.OnLongClickListeners("page_36_14");
            }
            else if (v.getId() == R.id.page_36_15) {
                pageInterface.OnLongClickListeners("page_36_15");
            }
            else if (v.getId() == R.id.page_36_16) {
                pageInterface.OnLongClickListeners("page_36_16");
            }
            else if (v.getId() == R.id.page_36_17) {
                pageInterface.OnLongClickListeners("page_36_17");
            }



            return true;
        }
    };
    private void setOnLongClickListener(){

        page_36_1.setOnLongClickListener(listener);
        page_36_2.setOnLongClickListener(listener);
        page_36_3.setOnLongClickListener(listener);
        page_36_4.setOnLongClickListener(listener);
        page_36_5.setOnLongClickListener(listener);
        page_36_6.setOnLongClickListener(listener);
        page_36_7.setOnLongClickListener(listener);
        page_36_8.setOnLongClickListener(listener);
        page_36_9.setOnLongClickListener(listener);
        page_36_10.setOnLongClickListener(listener);
        page_36_11.setOnLongClickListener(listener);
        page_36_12.setOnLongClickListener(listener);
        page_36_13.setOnLongClickListener(listener);
        page_36_14.setOnLongClickListener(listener);
        page_36_15.setOnLongClickListener(listener);
        page_36_16.setOnLongClickListener(listener);
        page_36_17.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_36.requestLayout();
    }
}