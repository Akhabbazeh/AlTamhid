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

public class Page_21 extends BaseFragment {
    FrameLayout frameLayout_page_21;
    private PageInterface pageInterface;
    private View page_21_1;
    private View page_21_2;
    private View page_21_3;
    private View page_21_4;
    private View page_21_5;
    private View page_21_6;
    private View page_21_7;
    private View page_21_8;
    private View page_21_9;
    private View page_21_10;
    private View page_21_11;
    private View page_21_12;


    public Page_21() {

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
        View page_21 = LayoutInflater.from(getContext()).inflate(R.layout.page_21, container, false);
        frameLayout_page_21=page_21.findViewById(R.id.frameLayout_page_21);
        page_21_1 = page_21.findViewById(R.id.page_21_1);
        page_21_2 = page_21.findViewById(R.id.page_21_2);
        page_21_3 = page_21.findViewById(R.id.page_21_3);
        page_21_4 = page_21.findViewById(R.id.page_21_4);
        page_21_5 = page_21.findViewById(R.id.page_21_5);
        page_21_6 = page_21.findViewById(R.id.page_21_6);
        page_21_7 = page_21.findViewById(R.id.page_21_7);
        page_21_8 = page_21.findViewById(R.id.page_21_8);
        page_21_9 = page_21.findViewById(R.id.page_21_9);
        page_21_10 = page_21.findViewById(R.id.page_21_10);
        page_21_11 = page_21.findViewById(R.id.page_21_11);
        page_21_12 = page_21.findViewById(R.id.page_21_12);



        setOnLongClickListener();


        return page_21;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_21_1) {
                pageInterface.OnLongClickListeners("page_21_1");
            }
            else if (v.getId() == R.id.page_21_2) {
                pageInterface.OnLongClickListeners("page_21_2");
            }
            else if (v.getId() == R.id.page_21_3) {
                pageInterface.OnLongClickListeners("page_21_3");
            }
            else if (v.getId() == R.id.page_21_4) {
                pageInterface.OnLongClickListeners("page_21_4");
            }
            else if (v.getId() == R.id.page_21_5) {
                pageInterface.OnLongClickListeners("page_21_5");
            }
            else if (v.getId() == R.id.page_21_6) {
                pageInterface.OnLongClickListeners("page_21_6");
            }
            else if (v.getId() == R.id.page_21_7) {
                pageInterface.OnLongClickListeners("page_21_7");
            }
            else if (v.getId() == R.id.page_21_8) {
                pageInterface.OnLongClickListeners("page_21_8");
            }
            else if (v.getId() == R.id.page_21_9) {
                pageInterface.OnLongClickListeners("page_21_9");
            }
            else if (v.getId() == R.id.page_21_10) {
                pageInterface.OnLongClickListeners("page_21_10");
            }
            else if (v.getId() == R.id.page_21_11) {
                pageInterface.OnLongClickListeners("page_21_11");
            }
            else if (v.getId() == R.id.page_21_12) {
                pageInterface.OnLongClickListeners("page_21_12");
            }



            return true;
        }
    };
    private void setOnLongClickListener(){
        page_21_1.setOnLongClickListener(listener);
        page_21_2.setOnLongClickListener(listener);
        page_21_3.setOnLongClickListener(listener);
        page_21_4.setOnLongClickListener(listener);
        page_21_5.setOnLongClickListener(listener);
        page_21_6.setOnLongClickListener(listener);
        page_21_7.setOnLongClickListener(listener);
        page_21_8.setOnLongClickListener(listener);
        page_21_9.setOnLongClickListener(listener);
        page_21_10.setOnLongClickListener(listener);
        page_21_11.setOnLongClickListener(listener);
        page_21_12.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_21.requestLayout();
    }
}