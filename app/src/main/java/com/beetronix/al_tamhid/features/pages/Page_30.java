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

public class Page_30 extends BaseFragment {
    FrameLayout frameLayout_page_30;
    private PageInterface pageInterface;
    private View page_30_1;
    private View page_30_2;
    private View page_30_3;
    private View page_30_4;
    private View page_30_5;
    private View page_30_6;
    private View page_30_7;
    private View page_30_8;
    private View page_30_9;
    private View page_30_10;
    private View page_30_11;
    private View page_30_12;
    private View page_30_13;
    private View page_30_14;
    private View page_30_15;
    private View page_30_16;
    private View page_30_17;
    private View page_30_18;
    private View page_30_19;
    private View page_30_20;
    private View page_30_21;
    private View page_30_22;
    private View page_30_23;
    private View page_30_24;


    public Page_30() {

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
        View page_30 = LayoutInflater.from(getContext()).inflate(R.layout.page_30, container, false);
        frameLayout_page_30=page_30.findViewById(R.id.frameLayout_page_30);
        page_30_1 = page_30.findViewById(R.id.page_30_1);
        page_30_2 = page_30.findViewById(R.id.page_30_2);
        page_30_3 = page_30.findViewById(R.id.page_30_3);
        page_30_4 = page_30.findViewById(R.id.page_30_4);
        page_30_5 = page_30.findViewById(R.id.page_30_5);
        page_30_6 = page_30.findViewById(R.id.page_30_6);
        page_30_7 = page_30.findViewById(R.id.page_30_7);
        page_30_8 = page_30.findViewById(R.id.page_30_8);
        page_30_9 = page_30.findViewById(R.id.page_30_9);
        page_30_10 = page_30.findViewById(R.id.page_30_10);
        page_30_11 = page_30.findViewById(R.id.page_30_11);
        page_30_12 = page_30.findViewById(R.id.page_30_12);
        page_30_13 = page_30.findViewById(R.id.page_30_13);
        page_30_14 = page_30.findViewById(R.id.page_30_14);
        page_30_15 = page_30.findViewById(R.id.page_30_15);
        page_30_16 = page_30.findViewById(R.id.page_30_16);
        page_30_17 = page_30.findViewById(R.id.page_30_17);
        page_30_18 = page_30.findViewById(R.id.page_30_18);
        page_30_19 = page_30.findViewById(R.id.page_30_19);
        page_30_20 = page_30.findViewById(R.id.page_30_20);
        page_30_21 = page_30.findViewById(R.id.page_30_21);
        page_30_22 = page_30.findViewById(R.id.page_30_22);
        page_30_23 = page_30.findViewById(R.id.page_30_23);
        page_30_24 = page_30.findViewById(R.id.page_30_24);



        setOnLongClickListener();


        return page_30;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_30_1) {
                pageInterface.OnLongClickListeners("page_30_1");
            }
            else if (v.getId() == R.id.page_30_2) {
                pageInterface.OnLongClickListeners("page_30_2");
            }
            else if (v.getId() == R.id.page_30_3) {
                pageInterface.OnLongClickListeners("page_30_3");
            }
            else if (v.getId() == R.id.page_30_4) {
                pageInterface.OnLongClickListeners("page_30_4");
            }
            else if (v.getId() == R.id.page_30_5) {
                pageInterface.OnLongClickListeners("page_30_5");
            }
            else if (v.getId() == R.id.page_30_6) {
                pageInterface.OnLongClickListeners("page_30_6");
            }
            else if (v.getId() == R.id.page_30_7) {
                pageInterface.OnLongClickListeners("page_30_7");
            }
            else if (v.getId() == R.id.page_30_8) {
                pageInterface.OnLongClickListeners("page_30_8");
            }
            else if (v.getId() == R.id.page_30_9) {
                pageInterface.OnLongClickListeners("page_30_9");
            }
            else if (v.getId() == R.id.page_30_10) {
                pageInterface.OnLongClickListeners("page_30_10");
            }
            else if (v.getId() == R.id.page_30_11) {
                pageInterface.OnLongClickListeners("page_30_11");
            }
            else if (v.getId() == R.id.page_30_12) {
                pageInterface.OnLongClickListeners("page_30_12");
            }
            else if (v.getId() == R.id.page_30_13) {
                pageInterface.OnLongClickListeners("page_30_13");
            }
            else if (v.getId() == R.id.page_30_14) {
                pageInterface.OnLongClickListeners("page_30_14");
            }
            else if (v.getId() == R.id.page_30_15) {
                pageInterface.OnLongClickListeners("page_30_15");
            }
            else if (v.getId() == R.id.page_30_16) {
                pageInterface.OnLongClickListeners("page_30_16");
            }
            else if (v.getId() == R.id.page_30_17) {
                pageInterface.OnLongClickListeners("page_30_17");
            }
            else if (v.getId() == R.id.page_30_18) {
                pageInterface.OnLongClickListeners("page_30_18");
            }
            else if (v.getId() == R.id.page_30_19) {
                pageInterface.OnLongClickListeners("page_30_19");
            }
            else if (v.getId() == R.id.page_30_20) {
                pageInterface.OnLongClickListeners("page_30_20");
            }
            else if (v.getId() == R.id.page_30_21) {
                pageInterface.OnLongClickListeners("page_30_21");
            }
            else if (v.getId() == R.id.page_30_22) {
                pageInterface.OnLongClickListeners("page_30_22");
            }
            else if (v.getId() == R.id.page_30_23) {
                pageInterface.OnLongClickListeners("page_30_23");
            }
            else if (v.getId() == R.id.page_30_24) {
                pageInterface.OnLongClickListeners("page_30_24");
            }

            return true;
        }
    };
    private void setOnLongClickListener(){
        page_30_1.setOnLongClickListener(listener);
        page_30_2.setOnLongClickListener(listener);
        page_30_3.setOnLongClickListener(listener);
        page_30_4.setOnLongClickListener(listener);
        page_30_5.setOnLongClickListener(listener);
        page_30_6.setOnLongClickListener(listener);
        page_30_7.setOnLongClickListener(listener);
        page_30_8.setOnLongClickListener(listener);
        page_30_9.setOnLongClickListener(listener);
        page_30_10.setOnLongClickListener(listener);
        page_30_11.setOnLongClickListener(listener);
        page_30_12.setOnLongClickListener(listener);
        page_30_13.setOnLongClickListener(listener);
        page_30_14.setOnLongClickListener(listener);
        page_30_15.setOnLongClickListener(listener);
        page_30_16.setOnLongClickListener(listener);
        page_30_17.setOnLongClickListener(listener);
        page_30_18.setOnLongClickListener(listener);
        page_30_19.setOnLongClickListener(listener);
        page_30_20.setOnLongClickListener(listener);
        page_30_21.setOnLongClickListener(listener);
        page_30_22.setOnLongClickListener(listener);
        page_30_23.setOnLongClickListener(listener);
        page_30_24.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_30.requestLayout();
    }
}