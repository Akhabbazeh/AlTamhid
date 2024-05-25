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

public class Page_32 extends BaseFragment {
    FrameLayout frameLayout_page_32;
    private PageInterface pageInterface;
    private View page_32_1;
    private View page_32_2;
    private View page_32_3;
    private View page_32_4;
    private View page_32_5;
    private View page_32_6;
    private View page_32_7;
    private View page_32_8;
    private View page_32_9;
    private View page_32_10;
    private View page_32_11;
    private View page_32_12;
    private View page_32_13;
    private View page_32_14;
    private View page_32_15;
    private View page_32_16;
    private View page_32_17;
    private View page_32_18;
    private View page_32_19;
    private View page_32_20;
    private View page_32_21;
    private View page_32_22;


    public Page_32() {

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
        View page_32 = LayoutInflater.from(getContext()).inflate(R.layout.page_32, container, false);
        frameLayout_page_32=page_32.findViewById(R.id.frameLayout_page_32);
        page_32_1 = page_32.findViewById(R.id.page_32_1);
        page_32_2 = page_32.findViewById(R.id.page_32_2);
        page_32_3 = page_32.findViewById(R.id.page_32_3);
        page_32_4 = page_32.findViewById(R.id.page_32_4);
        page_32_5 = page_32.findViewById(R.id.page_32_5);
        page_32_6 = page_32.findViewById(R.id.page_32_6);
        page_32_7 = page_32.findViewById(R.id.page_32_7);
        page_32_8 = page_32.findViewById(R.id.page_32_8);
        page_32_9 = page_32.findViewById(R.id.page_32_9);
        page_32_10 = page_32.findViewById(R.id.page_32_10);
        page_32_11 = page_32.findViewById(R.id.page_32_11);
        page_32_12 = page_32.findViewById(R.id.page_32_12);
        page_32_13 = page_32.findViewById(R.id.page_32_13);
        page_32_14 = page_32.findViewById(R.id.page_32_14);
        page_32_15 = page_32.findViewById(R.id.page_32_15);
        page_32_16 = page_32.findViewById(R.id.page_32_16);
        page_32_17 = page_32.findViewById(R.id.page_32_17);
        page_32_18 = page_32.findViewById(R.id.page_32_18);
        page_32_19 = page_32.findViewById(R.id.page_32_19);
        page_32_20 = page_32.findViewById(R.id.page_32_20);
        page_32_21 = page_32.findViewById(R.id.page_32_21);
        page_32_22 = page_32.findViewById(R.id.page_32_22);



        setOnLongClickListener();


        return page_32;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_32_1) {
                pageInterface.OnLongClickListeners("page_32_1");
            }
            else if (v.getId() == R.id.page_32_2) {
                pageInterface.OnLongClickListeners("page_32_2");
            }
            else if (v.getId() == R.id.page_32_3) {
                pageInterface.OnLongClickListeners("page_32_3");
            }
            else if (v.getId() == R.id.page_32_4) {
                pageInterface.OnLongClickListeners("page_32_4");
            }
            else if (v.getId() == R.id.page_32_5) {
                pageInterface.OnLongClickListeners("page_32_5");
            }
            else if (v.getId() == R.id.page_32_6) {
                pageInterface.OnLongClickListeners("page_32_6");
            }
            else if (v.getId() == R.id.page_32_7) {
                pageInterface.OnLongClickListeners("page_32_7");
            }
            else if (v.getId() == R.id.page_32_8) {
                pageInterface.OnLongClickListeners("page_32_8");
            }
            else if (v.getId() == R.id.page_32_9) {
                pageInterface.OnLongClickListeners("page_32_9");
            }
            else if (v.getId() == R.id.page_32_10) {
                pageInterface.OnLongClickListeners("page_32_10");
            }
            else if (v.getId() == R.id.page_32_11) {
                pageInterface.OnLongClickListeners("page_32_11");
            }
            else if (v.getId() == R.id.page_32_12) {
                pageInterface.OnLongClickListeners("page_32_12");
            }
            else if (v.getId() == R.id.page_32_13) {
                pageInterface.OnLongClickListeners("page_32_13");
            }
            else if (v.getId() == R.id.page_32_14) {
                pageInterface.OnLongClickListeners("page_32_14");
            }
            else if (v.getId() == R.id.page_32_15) {
                pageInterface.OnLongClickListeners("page_32_15");
            }
            else if (v.getId() == R.id.page_32_16) {
                pageInterface.OnLongClickListeners("page_32_16");
            }
            else if (v.getId() == R.id.page_32_17) {
                pageInterface.OnLongClickListeners("page_32_17");
            }
            else if (v.getId() == R.id.page_32_18) {
                pageInterface.OnLongClickListeners("page_32_18");
            }
            else if (v.getId() == R.id.page_32_19) {
                pageInterface.OnLongClickListeners("page_32_19");
            }
            else if (v.getId() == R.id.page_32_20) {
                pageInterface.OnLongClickListeners("page_32_20");
            }
            else if (v.getId() == R.id.page_32_21) {
                pageInterface.OnLongClickListeners("page_32_21");
            }
            else if (v.getId() == R.id.page_32_22) {
                pageInterface.OnLongClickListeners("page_32_22");
            }



            return true;
        }
    };
    private void setOnLongClickListener(){
        page_32_1.setOnLongClickListener(listener);
        page_32_2.setOnLongClickListener(listener);
        page_32_3.setOnLongClickListener(listener);
        page_32_4.setOnLongClickListener(listener);
        page_32_5.setOnLongClickListener(listener);
        page_32_6.setOnLongClickListener(listener);
        page_32_7.setOnLongClickListener(listener);
        page_32_8.setOnLongClickListener(listener);
        page_32_9.setOnLongClickListener(listener);
        page_32_10.setOnLongClickListener(listener);
        page_32_11.setOnLongClickListener(listener);
        page_32_12.setOnLongClickListener(listener);
        page_32_13.setOnLongClickListener(listener);
        page_32_14.setOnLongClickListener(listener);
        page_32_15.setOnLongClickListener(listener);
        page_32_16.setOnLongClickListener(listener);
        page_32_17.setOnLongClickListener(listener);
        page_32_18.setOnLongClickListener(listener);
        page_32_19.setOnLongClickListener(listener);
        page_32_20.setOnLongClickListener(listener);
        page_32_21.setOnLongClickListener(listener);
        page_32_22.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_32.requestLayout();
    }
}