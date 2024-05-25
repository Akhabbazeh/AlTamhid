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

public class Page_43 extends BaseFragment {
    FrameLayout frameLayout_page_43;
    private PageInterface pageInterface;
    private View page_43_1;
    private View page_43_2;
    private View page_43_3;
    private View page_43_4;
    private View page_43_5;
    private View page_43_6;
    private View page_43_7;
    private View page_43_8;
    private View page_43_9;
    private View page_43_10;
    private View page_43_11;
    private View page_43_12;
    private View page_43_13;
    private View page_43_14;
    private View page_43_15;
    private View page_43_16;


    public Page_43() {

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
        View page_43 = LayoutInflater.from(getContext()).inflate(R.layout.page_43, container, false);
        frameLayout_page_43=page_43.findViewById(R.id.frameLayout_page_43);
        page_43_1 = page_43.findViewById(R.id.page_43_1);
        page_43_2 = page_43.findViewById(R.id.page_43_2);
        page_43_3 = page_43.findViewById(R.id.page_43_3);
        page_43_4 = page_43.findViewById(R.id.page_43_4);
        page_43_5 = page_43.findViewById(R.id.page_43_5);
        page_43_6 = page_43.findViewById(R.id.page_43_6);
        page_43_7 = page_43.findViewById(R.id.page_43_7);
        page_43_8 = page_43.findViewById(R.id.page_43_8);
        page_43_9 = page_43.findViewById(R.id.page_43_9);
        page_43_10 = page_43.findViewById(R.id.page_43_10);
        page_43_11 = page_43.findViewById(R.id.page_43_11);
        page_43_12 = page_43.findViewById(R.id.page_43_12);
        page_43_13 = page_43.findViewById(R.id.page_43_13);
        page_43_14 = page_43.findViewById(R.id.page_43_14);
        page_43_15 = page_43.findViewById(R.id.page_43_15);
        page_43_16 = page_43.findViewById(R.id.page_43_16);



        setOnLongClickListener();


        return page_43;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_43_1) {
                pageInterface.OnLongClickListeners("page_43_1");
            }
            else if (v.getId() == R.id.page_43_2) {
                pageInterface.OnLongClickListeners("page_43_2");
            }
            else if (v.getId() == R.id.page_43_3) {
                pageInterface.OnLongClickListeners("page_43_3");
            }
            else if (v.getId() == R.id.page_43_4) {
                pageInterface.OnLongClickListeners("page_43_4");
            }
            else if (v.getId() == R.id.page_43_5) {
                pageInterface.OnLongClickListeners("page_43_5");
            }
            else if (v.getId() == R.id.page_43_6) {
                pageInterface.OnLongClickListeners("page_43_6");
            }
            else if (v.getId() == R.id.page_43_7) {
                pageInterface.OnLongClickListeners("page_43_7");
            }
            else if (v.getId() == R.id.page_43_8) {
                pageInterface.OnLongClickListeners("page_43_8");
            }
            else if (v.getId() == R.id.page_43_9) {
                pageInterface.OnLongClickListeners("page_43_9");
            }
            else if (v.getId() == R.id.page_43_10) {
                pageInterface.OnLongClickListeners("page_43_10");
            }
            else if (v.getId() == R.id.page_43_11) {
                pageInterface.OnLongClickListeners("page_43_11");
            }
            else if (v.getId() == R.id.page_43_12) {
                pageInterface.OnLongClickListeners("page_43_12");
            }
            else if (v.getId() == R.id.page_43_13) {
                pageInterface.OnLongClickListeners("page_43_13");
            }
            else if (v.getId() == R.id.page_43_14) {
                pageInterface.OnLongClickListeners("page_43_14");
            }
            else if (v.getId() == R.id.page_43_15) {
                pageInterface.OnLongClickListeners("page_43_15");
            }
            else if (v.getId() == R.id.page_43_16) {
                pageInterface.OnLongClickListeners("page_43_16");
            }



            return true;
        }
    };
    private void setOnLongClickListener(){
        page_43_1.setOnLongClickListener(listener);
        page_43_2.setOnLongClickListener(listener);
        page_43_3.setOnLongClickListener(listener);
        page_43_4.setOnLongClickListener(listener);
        page_43_5.setOnLongClickListener(listener);
        page_43_6.setOnLongClickListener(listener);
        page_43_7.setOnLongClickListener(listener);
        page_43_8.setOnLongClickListener(listener);
        page_43_9.setOnLongClickListener(listener);
        page_43_10.setOnLongClickListener(listener);
        page_43_11.setOnLongClickListener(listener);
        page_43_12.setOnLongClickListener(listener);
        page_43_13.setOnLongClickListener(listener);
        page_43_14.setOnLongClickListener(listener);
        page_43_15.setOnLongClickListener(listener);
        page_43_16.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_43.requestLayout();
    }
}