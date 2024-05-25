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

public class Page_37 extends BaseFragment {
    FrameLayout frameLayout_page_37;
    private PageInterface pageInterface;
    private View page_37_1;
    private View page_37_2;
    private View page_37_3;
    private View page_37_4;
    private View page_37_5;
    private View page_37_6;
    private View page_37_7;
    private View page_37_8;
    private View page_37_9;
    private View page_37_10;
    private View page_37_11;
    private View page_37_12;
    private View page_37_13;
    private View page_37_14;
    private View page_37_15;


    public Page_37() {

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
        View page_37 = LayoutInflater.from(getContext()).inflate(R.layout.page_37, container, false);
        frameLayout_page_37=page_37.findViewById(R.id.frameLayout_page_37);
        page_37_1 = page_37.findViewById(R.id.page_37_1);
        page_37_2 = page_37.findViewById(R.id.page_37_2);
        page_37_3 = page_37.findViewById(R.id.page_37_3);
        page_37_4 = page_37.findViewById(R.id.page_37_4);
        page_37_5 = page_37.findViewById(R.id.page_37_5);
        page_37_6 = page_37.findViewById(R.id.page_37_6);
        page_37_7 = page_37.findViewById(R.id.page_37_7);
        page_37_8 = page_37.findViewById(R.id.page_37_8);
        page_37_9 = page_37.findViewById(R.id.page_37_9);
        page_37_10 = page_37.findViewById(R.id.page_37_10);
        page_37_11 = page_37.findViewById(R.id.page_37_11);
        page_37_12 = page_37.findViewById(R.id.page_37_12);
        page_37_13 = page_37.findViewById(R.id.page_37_13);
        page_37_14 = page_37.findViewById(R.id.page_37_14);
        page_37_15 = page_37.findViewById(R.id.page_37_15);



        setOnLongClickListener();


        return page_37;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_37_1) {
                pageInterface.OnLongClickListeners("page_37_1");
            }
            else if (v.getId() == R.id.page_37_2) {
                pageInterface.OnLongClickListeners("page_37_2");
            }
            else if (v.getId() == R.id.page_37_3) {
                pageInterface.OnLongClickListeners("page_37_3");
            }
            else if (v.getId() == R.id.page_37_4) {
                pageInterface.OnLongClickListeners("page_37_4");
            }
            else if (v.getId() == R.id.page_37_5) {
                pageInterface.OnLongClickListeners("page_37_5");
            }
            else if (v.getId() == R.id.page_37_6) {
                pageInterface.OnLongClickListeners("page_37_6");
            }
            else if (v.getId() == R.id.page_37_7) {
                pageInterface.OnLongClickListeners("page_37_7");
            }
            else if (v.getId() == R.id.page_37_8) {
                pageInterface.OnLongClickListeners("page_37_8");
            }
            else if (v.getId() == R.id.page_37_9) {
                pageInterface.OnLongClickListeners("page_37_9");
            }
            else if (v.getId() == R.id.page_37_10) {
                pageInterface.OnLongClickListeners("page_37_10");
            }
            else if (v.getId() == R.id.page_37_11) {
                pageInterface.OnLongClickListeners("page_37_11");
            }
            else if (v.getId() == R.id.page_37_12) {
                pageInterface.OnLongClickListeners("page_37_12");
            }
            else if (v.getId() == R.id.page_37_13) {
                pageInterface.OnLongClickListeners("page_37_13");
            }
            else if (v.getId() == R.id.page_37_14) {
                pageInterface.OnLongClickListeners("page_37_14");
            }
            else if (v.getId() == R.id.page_37_15) {
                pageInterface.OnLongClickListeners("page_37_15");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_37_1.setOnLongClickListener(listener);
        page_37_2.setOnLongClickListener(listener);
        page_37_3.setOnLongClickListener(listener);
        page_37_4.setOnLongClickListener(listener);
        page_37_5.setOnLongClickListener(listener);
        page_37_6.setOnLongClickListener(listener);
        page_37_7.setOnLongClickListener(listener);
        page_37_8.setOnLongClickListener(listener);
        page_37_9.setOnLongClickListener(listener);
        page_37_10.setOnLongClickListener(listener);
        page_37_11.setOnLongClickListener(listener);
        page_37_12.setOnLongClickListener(listener);
        page_37_13.setOnLongClickListener(listener);
        page_37_14.setOnLongClickListener(listener);
        page_37_15.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_37.requestLayout();
    }
}