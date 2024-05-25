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

public class Page_16 extends BaseFragment {
    FrameLayout frameLayout_page_16;
    private PageInterface pageInterface;
    private View page_16_1;
    private View page_16_2;
    private View page_16_3;
    private View page_16_4;
    private View page_16_5;
    private View page_16_6;
    private View page_16_7;
    private View page_16_8;
    private View page_16_9;
    private View page_16_10;
    private View page_16_11;
    private View page_16_12;
    private View page_16_13;
    private View page_16_14;
    private View page_16_15;
    private View page_16_16;


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
        page_16_1 = page_16.findViewById(R.id.page_16_1);
        page_16_2 = page_16.findViewById(R.id.page_16_2);
        page_16_3 = page_16.findViewById(R.id.page_16_3);
        page_16_4 = page_16.findViewById(R.id.page_16_4);
        page_16_5 = page_16.findViewById(R.id.page_16_5);
        page_16_6 = page_16.findViewById(R.id.page_16_6);
        page_16_7 = page_16.findViewById(R.id.page_16_7);
        page_16_8 = page_16.findViewById(R.id.page_16_8);
        page_16_9 = page_16.findViewById(R.id.page_16_9);
        page_16_10 = page_16.findViewById(R.id.page_16_10);
        page_16_11 = page_16.findViewById(R.id.page_16_11);
        page_16_12 = page_16.findViewById(R.id.page_16_12);
        page_16_13 = page_16.findViewById(R.id.page_16_13);
        page_16_14 = page_16.findViewById(R.id.page_16_14);
        page_16_15 = page_16.findViewById(R.id.page_16_15);
        page_16_16 = page_16.findViewById(R.id.page_16_16);



        setOnLongClickListener();


        return page_16;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_16_1) {
                pageInterface.OnLongClickListeners("page_16_1");
            }
            else if (v.getId() == R.id.page_16_2) {
                pageInterface.OnLongClickListeners("page_16_2");
            }
            else if (v.getId() == R.id.page_16_3) {
                pageInterface.OnLongClickListeners("page_16_3");
            }
            else if (v.getId() == R.id.page_16_4) {
                pageInterface.OnLongClickListeners("page_16_4");
            }
            else if (v.getId() == R.id.page_16_5) {
                pageInterface.OnLongClickListeners("page_16_5");
            }
            else if (v.getId() == R.id.page_16_6) {
                pageInterface.OnLongClickListeners("page_16_6");
            }
            else if (v.getId() == R.id.page_16_7) {
                pageInterface.OnLongClickListeners("page_16_7");
            }
            else if (v.getId() == R.id.page_16_8) {
                pageInterface.OnLongClickListeners("page_16_8");
            }
            else if (v.getId() == R.id.page_16_9) {
                pageInterface.OnLongClickListeners("page_16_9");
            }
            else if (v.getId() == R.id.page_16_10) {
                pageInterface.OnLongClickListeners("page_16_10");
            }
            else if (v.getId() == R.id.page_16_11) {
                pageInterface.OnLongClickListeners("page_16_11");
            }
            else if (v.getId() == R.id.page_16_12) {
                pageInterface.OnLongClickListeners("page_16_12");
            }
            else if (v.getId() == R.id.page_16_13) {
                pageInterface.OnLongClickListeners("page_16_13");
            }
            else if (v.getId() == R.id.page_16_14) {
                pageInterface.OnLongClickListeners("page_16_14");
            }
            else if (v.getId() == R.id.page_16_15) {
                pageInterface.OnLongClickListeners("page_16_15");
            }
            else if (v.getId() == R.id.page_16_16) {
                pageInterface.OnLongClickListeners("page_16_16");
            }



            return true;
        }
    };
    private void setOnLongClickListener(){
        page_16_1.setOnLongClickListener(listener);
        page_16_2.setOnLongClickListener(listener);
        page_16_3.setOnLongClickListener(listener);
        page_16_4.setOnLongClickListener(listener);
        page_16_5.setOnLongClickListener(listener);
        page_16_6.setOnLongClickListener(listener);
        page_16_7.setOnLongClickListener(listener);
        page_16_8.setOnLongClickListener(listener);
        page_16_9.setOnLongClickListener(listener);
        page_16_10.setOnLongClickListener(listener);
        page_16_11.setOnLongClickListener(listener);
        page_16_12.setOnLongClickListener(listener);
        page_16_13.setOnLongClickListener(listener);
        page_16_14.setOnLongClickListener(listener);
        page_16_15.setOnLongClickListener(listener);
        page_16_16.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_16.requestLayout();
    }
}
