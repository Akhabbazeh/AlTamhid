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

public class Page_23 extends BaseFragment {
    FrameLayout frameLayout_page_23;
    private PageInterface pageInterface;
    private View page_23_1;
    private View page_23_2;
    private View page_23_3;
    private View page_23_4;
    private View page_23_5;
    private View page_23_6;
    private View page_23_7;
    private View page_23_8;
    private View page_23_9;
    private View page_23_10;
    private View page_23_11;
    private View page_23_12;
    private View page_23_13;
    private View page_23_14;
    private View page_23_15;
    private View page_23_16;
    private View page_23_17;


    public Page_23() {

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
        View page_23 = LayoutInflater.from(getContext()).inflate(R.layout.page_23, container, false);
        frameLayout_page_23=page_23.findViewById(R.id.frameLayout_page_23);
        page_23_1 = page_23.findViewById(R.id.page_23_1);
        page_23_2 = page_23.findViewById(R.id.page_23_2);
        page_23_3 = page_23.findViewById(R.id.page_23_3);
        page_23_4 = page_23.findViewById(R.id.page_23_4);
        page_23_5 = page_23.findViewById(R.id.page_23_5);
        page_23_6 = page_23.findViewById(R.id.page_23_6);
        page_23_7 = page_23.findViewById(R.id.page_23_7);
        page_23_8 = page_23.findViewById(R.id.page_23_8);
        page_23_9 = page_23.findViewById(R.id.page_23_9);
        page_23_10 = page_23.findViewById(R.id.page_23_10);
        page_23_11 = page_23.findViewById(R.id.page_23_11);
        page_23_12 = page_23.findViewById(R.id.page_23_12);
        page_23_13 = page_23.findViewById(R.id.page_23_13);
        page_23_14 = page_23.findViewById(R.id.page_23_14);
        page_23_15 = page_23.findViewById(R.id.page_23_15);
        page_23_16 = page_23.findViewById(R.id.page_23_16);
        page_23_17 = page_23.findViewById(R.id.page_23_17);



        setOnLongClickListener();


        return page_23;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_23_1) {
                pageInterface.OnLongClickListeners("page_23_1");
            }
            else if (v.getId() == R.id.page_23_2) {
                pageInterface.OnLongClickListeners("page_23_2");
            }
            else if (v.getId() == R.id.page_23_3) {
                pageInterface.OnLongClickListeners("page_23_3");
            }
            else if (v.getId() == R.id.page_23_4) {
                pageInterface.OnLongClickListeners("page_23_4");
            }
            else if (v.getId() == R.id.page_23_5) {
                pageInterface.OnLongClickListeners("page_23_5");
            }
            else if (v.getId() == R.id.page_23_6) {
                pageInterface.OnLongClickListeners("page_23_6");
            }
            else if (v.getId() == R.id.page_23_7) {
                pageInterface.OnLongClickListeners("page_23_7");
            }
            else if (v.getId() == R.id.page_23_8) {
                pageInterface.OnLongClickListeners("page_23_8");
            }
            else if (v.getId() == R.id.page_23_9) {
                pageInterface.OnLongClickListeners("page_23_9");
            }
            else if (v.getId() == R.id.page_23_10) {
                pageInterface.OnLongClickListeners("page_23_10");
            }
            else if (v.getId() == R.id.page_23_11) {
                pageInterface.OnLongClickListeners("page_23_11");
            }
            else if (v.getId() == R.id.page_23_12) {
                pageInterface.OnLongClickListeners("page_23_12");
            }
            else if (v.getId() == R.id.page_23_13) {
                pageInterface.OnLongClickListeners("page_23_13");
            }
            else if (v.getId() == R.id.page_23_14) {
                pageInterface.OnLongClickListeners("page_23_14");
            }
            else if (v.getId() == R.id.page_23_15) {
                pageInterface.OnLongClickListeners("page_23_15");
            }
            else if (v.getId() == R.id.page_23_16) {
                pageInterface.OnLongClickListeners("page_23_16");
            }
            else if (v.getId() == R.id.page_23_17) {
                pageInterface.OnLongClickListeners("page_23_17");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_23_1.setOnLongClickListener(listener);
        page_23_2.setOnLongClickListener(listener);
        page_23_3.setOnLongClickListener(listener);
        page_23_4.setOnLongClickListener(listener);
        page_23_5.setOnLongClickListener(listener);
        page_23_6.setOnLongClickListener(listener);
        page_23_7.setOnLongClickListener(listener);
        page_23_8.setOnLongClickListener(listener);
        page_23_9.setOnLongClickListener(listener);
        page_23_10.setOnLongClickListener(listener);
        page_23_11.setOnLongClickListener(listener);
        page_23_12.setOnLongClickListener(listener);
        page_23_13.setOnLongClickListener(listener);
        page_23_14.setOnLongClickListener(listener);
        page_23_15.setOnLongClickListener(listener);
        page_23_16.setOnLongClickListener(listener);
        page_23_17.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_23.requestLayout();
    }
}