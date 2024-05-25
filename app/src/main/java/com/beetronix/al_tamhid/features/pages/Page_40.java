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

public class Page_40 extends BaseFragment {
    FrameLayout frameLayout_page_40;
    private PageInterface pageInterface;
    private View page_40_1;
    private View page_40_2;
    private View page_40_3;
    private View page_40_4;
    private View page_40_5;
    private View page_40_6;
    private View page_40_7;
    private View page_40_8;
    private View page_40_9;
    private View page_40_10;
    private View page_40_11;
    private View page_40_12;
    private View page_40_13;
    private View page_40_14;
    private View page_40_15;
    private View page_40_16;
    private View page_40_17;
    private View page_40_18;
    private View page_40_19;
    private View page_40_20;
    private View page_40_21;


    public Page_40() {

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
        View page_40 = LayoutInflater.from(getContext()).inflate(R.layout.page_40, container, false);
        frameLayout_page_40=page_40.findViewById(R.id.frameLayout_page_40);
        page_40_1 = page_40.findViewById(R.id.page_40_1);
        page_40_2 = page_40.findViewById(R.id.page_40_2);
        page_40_3 = page_40.findViewById(R.id.page_40_3);
        page_40_4 = page_40.findViewById(R.id.page_40_4);
        page_40_5 = page_40.findViewById(R.id.page_40_5);
        page_40_6 = page_40.findViewById(R.id.page_40_6);
        page_40_7 = page_40.findViewById(R.id.page_40_7);
        page_40_8 = page_40.findViewById(R.id.page_40_8);
        page_40_9 = page_40.findViewById(R.id.page_40_9);
        page_40_10 = page_40.findViewById(R.id.page_40_10);
        page_40_11 = page_40.findViewById(R.id.page_40_11);
        page_40_12 = page_40.findViewById(R.id.page_40_12);
        page_40_13 = page_40.findViewById(R.id.page_40_13);
        page_40_14 = page_40.findViewById(R.id.page_40_14);
        page_40_15 = page_40.findViewById(R.id.page_40_15);
        page_40_16 = page_40.findViewById(R.id.page_40_16);
        page_40_17 = page_40.findViewById(R.id.page_40_17);
        page_40_18 = page_40.findViewById(R.id.page_40_18);
        page_40_19 = page_40.findViewById(R.id.page_40_19);
        page_40_20 = page_40.findViewById(R.id.page_40_20);
        page_40_21 = page_40.findViewById(R.id.page_40_21);



        setOnLongClickListener();


        return page_40;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_40_1) {
                pageInterface.OnLongClickListeners("page_40_1");
            }
            else if (v.getId() == R.id.page_40_2) {
                pageInterface.OnLongClickListeners("page_40_2");
            }
            else if (v.getId() == R.id.page_40_3) {
                pageInterface.OnLongClickListeners("page_40_3");
            }
            else if (v.getId() == R.id.page_40_4) {
                pageInterface.OnLongClickListeners("page_40_4");
            }
            else if (v.getId() == R.id.page_40_5) {
                pageInterface.OnLongClickListeners("page_40_5");
            }
            else if (v.getId() == R.id.page_40_6) {
                pageInterface.OnLongClickListeners("page_40_6");
            }
            else if (v.getId() == R.id.page_40_7) {
                pageInterface.OnLongClickListeners("page_40_7");
            }
            else if (v.getId() == R.id.page_40_8) {
                pageInterface.OnLongClickListeners("page_40_8");
            }
            else if (v.getId() == R.id.page_40_9) {
                pageInterface.OnLongClickListeners("page_40_9");
            }
            else if (v.getId() == R.id.page_40_10) {
                pageInterface.OnLongClickListeners("page_40_10");
            }
            else if (v.getId() == R.id.page_40_11) {
                pageInterface.OnLongClickListeners("page_40_11");
            }
            else if (v.getId() == R.id.page_40_12) {
                pageInterface.OnLongClickListeners("page_40_12");
            }
            else if (v.getId() == R.id.page_40_13) {
                pageInterface.OnLongClickListeners("page_40_13");
            }
            else if (v.getId() == R.id.page_40_14) {
                pageInterface.OnLongClickListeners("page_40_14");
            }
            else if (v.getId() == R.id.page_40_15) {
                pageInterface.OnLongClickListeners("page_40_15");
            }
            else if (v.getId() == R.id.page_40_16) {
                pageInterface.OnLongClickListeners("page_40_16");
            }
            else if (v.getId() == R.id.page_40_17) {
                pageInterface.OnLongClickListeners("page_40_17");
            }
            else if (v.getId() == R.id.page_40_18) {
                pageInterface.OnLongClickListeners("page_40_18");
            }
            else if (v.getId() == R.id.page_40_19) {
                pageInterface.OnLongClickListeners("page_40_19");
            }
            else if (v.getId() == R.id.page_40_20) {
                pageInterface.OnLongClickListeners("page_40_20");
            }
            else if (v.getId() == R.id.page_40_21) {
                pageInterface.OnLongClickListeners("page_40_21");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_40_1.setOnLongClickListener(listener);
        page_40_2.setOnLongClickListener(listener);
        page_40_3.setOnLongClickListener(listener);
        page_40_4.setOnLongClickListener(listener);
        page_40_5.setOnLongClickListener(listener);
        page_40_6.setOnLongClickListener(listener);
        page_40_7.setOnLongClickListener(listener);
        page_40_8.setOnLongClickListener(listener);
        page_40_9.setOnLongClickListener(listener);
        page_40_10.setOnLongClickListener(listener);
        page_40_11.setOnLongClickListener(listener);
        page_40_12.setOnLongClickListener(listener);
        page_40_13.setOnLongClickListener(listener);
        page_40_14.setOnLongClickListener(listener);
        page_40_15.setOnLongClickListener(listener);
        page_40_16.setOnLongClickListener(listener);
        page_40_17.setOnLongClickListener(listener);
        page_40_18.setOnLongClickListener(listener);
        page_40_19.setOnLongClickListener(listener);
        page_40_20.setOnLongClickListener(listener);
        page_40_21.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_40.requestLayout();
    }
}