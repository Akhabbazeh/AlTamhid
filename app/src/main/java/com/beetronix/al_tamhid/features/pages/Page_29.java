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

public class Page_29 extends BaseFragment {
    FrameLayout frameLayout_page_29;
    private PageInterface pageInterface;
    private View page_29_1;
    private View page_29_2;
    private View page_29_3;
    private View page_29_4;
    private View page_29_5;
    private View page_29_6;
    private View page_29_7;
    private View page_29_8;
    private View page_29_9;
    private View page_29_10;
    private View page_29_11;
    private View page_29_12;
    private View page_29_13;
    private View page_29_14;
    private View page_29_15;
    private View page_29_16;


    public Page_29() {

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
        View page_29 = LayoutInflater.from(getContext()).inflate(R.layout.page_29, container, false);
        frameLayout_page_29=page_29.findViewById(R.id.frameLayout_page_29);
        page_29_1 = page_29.findViewById(R.id.page_29_1);
        page_29_2 = page_29.findViewById(R.id.page_29_2);
        page_29_3 = page_29.findViewById(R.id.page_29_3);
        page_29_4 = page_29.findViewById(R.id.page_29_4);
        page_29_5 = page_29.findViewById(R.id.page_29_5);
        page_29_6 = page_29.findViewById(R.id.page_29_6);
        page_29_7 = page_29.findViewById(R.id.page_29_7);
        page_29_8 = page_29.findViewById(R.id.page_29_8);
        page_29_9 = page_29.findViewById(R.id.page_29_9);
        page_29_10 = page_29.findViewById(R.id.page_29_10);
        page_29_11 = page_29.findViewById(R.id.page_29_11);
        page_29_12 = page_29.findViewById(R.id.page_29_12);
        page_29_13 = page_29.findViewById(R.id.page_29_13);
        page_29_14 = page_29.findViewById(R.id.page_29_14);
        page_29_15 = page_29.findViewById(R.id.page_29_15);
        page_29_16 = page_29.findViewById(R.id.page_29_16);



        setOnLongClickListener();


        return page_29;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_29_1) {
                pageInterface.OnLongClickListeners("page_29_1");
            }
            else if (v.getId() == R.id.page_29_2) {
                pageInterface.OnLongClickListeners("page_29_2");
            }
            else if (v.getId() == R.id.page_29_3) {
                pageInterface.OnLongClickListeners("page_29_3");
            }
            else if (v.getId() == R.id.page_29_4) {
                pageInterface.OnLongClickListeners("page_29_4");
            }
            else if (v.getId() == R.id.page_29_5) {
                pageInterface.OnLongClickListeners("page_29_5");
            }
            else if (v.getId() == R.id.page_29_6) {
                pageInterface.OnLongClickListeners("page_29_6");
            }
            else if (v.getId() == R.id.page_29_7) {
                pageInterface.OnLongClickListeners("page_29_7");
            }
            else if (v.getId() == R.id.page_29_8) {
                pageInterface.OnLongClickListeners("page_29_8");
            }
            else if (v.getId() == R.id.page_29_9) {
                pageInterface.OnLongClickListeners("page_29_9");
            }
            else if (v.getId() == R.id.page_29_10) {
                pageInterface.OnLongClickListeners("page_29_10");
            }
            else if (v.getId() == R.id.page_29_11) {
                pageInterface.OnLongClickListeners("page_29_11");
            }
            else if (v.getId() == R.id.page_29_12) {
                pageInterface.OnLongClickListeners("page_29_12");
            }
            else if (v.getId() == R.id.page_29_13) {
                pageInterface.OnLongClickListeners("page_29_13");
            }
            else if (v.getId() == R.id.page_29_14) {
                pageInterface.OnLongClickListeners("page_29_14");
            }
            else if (v.getId() == R.id.page_29_15) {
                pageInterface.OnLongClickListeners("page_29_15");
            }
            else if (v.getId() == R.id.page_29_16) {
                pageInterface.OnLongClickListeners("page_29_16");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_29_1.setOnLongClickListener(listener);
        page_29_2.setOnLongClickListener(listener);
        page_29_3.setOnLongClickListener(listener);
        page_29_4.setOnLongClickListener(listener);
        page_29_5.setOnLongClickListener(listener);
        page_29_6.setOnLongClickListener(listener);
        page_29_7.setOnLongClickListener(listener);
        page_29_8.setOnLongClickListener(listener);
        page_29_9.setOnLongClickListener(listener);
        page_29_10.setOnLongClickListener(listener);
        page_29_11.setOnLongClickListener(listener);
        page_29_12.setOnLongClickListener(listener);
        page_29_13.setOnLongClickListener(listener);
        page_29_14.setOnLongClickListener(listener);
        page_29_15.setOnLongClickListener(listener);
        page_29_16.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_29.requestLayout();
    }
}