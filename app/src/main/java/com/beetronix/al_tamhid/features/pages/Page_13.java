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

public class Page_13 extends BaseFragment {
    FrameLayout frameLayout_page_13;
    private PageInterface pageInterface;
    private View page_13_1;
    private View page_13_2;
    private View page_13_3;
    private View page_13_4;
    private View page_13_5;
    private View page_13_6;
    private View page_13_7;
    private View page_13_8;
    private View page_13_9;
    private View page_13_10;
    private View page_13_11;
    private View page_13_12;
    private View page_13_13;
    private View page_13_14;
    private View page_13_15;
    private View page_13_16;
    private View page_13_17;
    private View page_13_18;


    public Page_13() {

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
        View page_13 = LayoutInflater.from(getContext()).inflate(R.layout.page_13, container, false);
        frameLayout_page_13=page_13.findViewById(R.id.frameLayout_page_13);
        page_13_1 = page_13.findViewById(R.id.page_13_1);
        page_13_2 = page_13.findViewById(R.id.page_13_2);
        page_13_3 = page_13.findViewById(R.id.page_13_3);
        page_13_4 = page_13.findViewById(R.id.page_13_4);
        page_13_5 = page_13.findViewById(R.id.page_13_5);
        page_13_6 = page_13.findViewById(R.id.page_13_6);
        page_13_7 = page_13.findViewById(R.id.page_13_7);
        page_13_8 = page_13.findViewById(R.id.page_13_8);
        page_13_9 = page_13.findViewById(R.id.page_13_9);
        page_13_10 = page_13.findViewById(R.id.page_13_10);
        page_13_11 = page_13.findViewById(R.id.page_13_11);
        page_13_12 = page_13.findViewById(R.id.page_13_12);
        page_13_13 = page_13.findViewById(R.id.page_13_13);
        page_13_14 = page_13.findViewById(R.id.page_13_14);
        page_13_15 = page_13.findViewById(R.id.page_13_15);
        page_13_16 = page_13.findViewById(R.id.page_13_16);
        page_13_17 = page_13.findViewById(R.id.page_13_17);
        page_13_18 = page_13.findViewById(R.id.page_13_18);



        setOnLongClickListener();


        return page_13;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_13_1) {
                pageInterface.OnLongClickListeners("page_13_1");
            }
            else if (v.getId() == R.id.page_13_2) {
                pageInterface.OnLongClickListeners("page_13_2");
            }
            else if (v.getId() == R.id.page_13_3) {
                pageInterface.OnLongClickListeners("page_13_3");
            }
            else if (v.getId() == R.id.page_13_4) {
                pageInterface.OnLongClickListeners("page_13_4");
            }
            else if (v.getId() == R.id.page_13_5) {
                pageInterface.OnLongClickListeners("page_13_5");
            }
            else if (v.getId() == R.id.page_13_6) {
                pageInterface.OnLongClickListeners("page_13_6");
            }
            else if (v.getId() == R.id.page_13_7) {
                pageInterface.OnLongClickListeners("page_13_7");
            }
            else if (v.getId() == R.id.page_13_8) {
                pageInterface.OnLongClickListeners("page_13_8");
            }
            else if (v.getId() == R.id.page_13_9) {
                pageInterface.OnLongClickListeners("page_13_9");
            }
            else if (v.getId() == R.id.page_13_10) {
                pageInterface.OnLongClickListeners("page_13_10");
            }
            else if (v.getId() == R.id.page_13_11) {
                pageInterface.OnLongClickListeners("page_13_11");
            }
            else if (v.getId() == R.id.page_13_12) {
                pageInterface.OnLongClickListeners("page_13_12");
            }
            else if (v.getId() == R.id.page_13_13) {
                pageInterface.OnLongClickListeners("page_13_13");
            }
            else if (v.getId() == R.id.page_13_14) {
                pageInterface.OnLongClickListeners("page_13_14");
            }
            else if (v.getId() == R.id.page_13_15) {
                pageInterface.OnLongClickListeners("page_13_15");
            }
            else if (v.getId() == R.id.page_13_16) {
                pageInterface.OnLongClickListeners("page_13_16");
            }
            else if (v.getId() == R.id.page_13_17) {
                pageInterface.OnLongClickListeners("page_13_17");
            }
            else if (v.getId() == R.id.page_13_18) {
                pageInterface.OnLongClickListeners("page_13_18");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_13_1.setOnLongClickListener(listener);
        page_13_2.setOnLongClickListener(listener);
        page_13_3.setOnLongClickListener(listener);
        page_13_4.setOnLongClickListener(listener);
        page_13_5.setOnLongClickListener(listener);
        page_13_6.setOnLongClickListener(listener);
        page_13_7.setOnLongClickListener(listener);
        page_13_8.setOnLongClickListener(listener);
        page_13_9.setOnLongClickListener(listener);
        page_13_10.setOnLongClickListener(listener);
        page_13_11.setOnLongClickListener(listener);
        page_13_12.setOnLongClickListener(listener);
        page_13_13.setOnLongClickListener(listener);
        page_13_14.setOnLongClickListener(listener);
        page_13_15.setOnLongClickListener(listener);
        page_13_16.setOnLongClickListener(listener);
        page_13_17.setOnLongClickListener(listener);
        page_13_18.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_13.requestLayout();
    }
}