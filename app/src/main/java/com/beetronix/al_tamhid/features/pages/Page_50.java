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

public class Page_50 extends BaseFragment {
    FrameLayout frameLayout_page_50;
    private PageInterface pageInterface;
    private View page_50_1;
    private View page_50_2;
    private View page_50_3;
    private View page_50_4;
    private View page_50_5;
    private View page_50_6;
    private View page_50_7;
    private View page_50_8;
    private View page_50_9;
    private View page_50_10;
    private View page_50_11;
    private View page_50_12;
    private View page_50_13;
    private View page_50_14;
    private View page_50_15;
    private View page_50_16;
    private View page_50_17;
    private View page_50_18;
    private View page_50_19;
    private View page_50_20;
    private View page_50_21;
    private View page_50_22;


    public Page_50() {

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
        View page_50 = LayoutInflater.from(getContext()).inflate(R.layout.page_50, container, false);
        frameLayout_page_50=page_50.findViewById(R.id.frameLayout_page_50);
        page_50_1 = page_50.findViewById(R.id.page_50_1);
        page_50_2 = page_50.findViewById(R.id.page_50_2);
        page_50_3 = page_50.findViewById(R.id.page_50_3);
        page_50_4 = page_50.findViewById(R.id.page_50_4);
        page_50_5 = page_50.findViewById(R.id.page_50_5);
        page_50_6 = page_50.findViewById(R.id.page_50_6);
        page_50_7 = page_50.findViewById(R.id.page_50_7);
        page_50_8 = page_50.findViewById(R.id.page_50_8);
        page_50_9 = page_50.findViewById(R.id.page_50_9);
        page_50_10 = page_50.findViewById(R.id.page_50_10);
        page_50_11 = page_50.findViewById(R.id.page_50_11);
        page_50_12 = page_50.findViewById(R.id.page_50_12);
        page_50_13 = page_50.findViewById(R.id.page_50_13);
        page_50_14 = page_50.findViewById(R.id.page_50_14);
        page_50_15 = page_50.findViewById(R.id.page_50_15);
        page_50_16 = page_50.findViewById(R.id.page_50_16);
        page_50_17 = page_50.findViewById(R.id.page_50_17);
        page_50_18 = page_50.findViewById(R.id.page_50_18);
        page_50_19 = page_50.findViewById(R.id.page_50_19);
        page_50_20 = page_50.findViewById(R.id.page_50_20);
        page_50_21 = page_50.findViewById(R.id.page_50_21);
        page_50_22 = page_50.findViewById(R.id.page_50_22);




        setOnLongClickListener();


        return page_50;}


    View.OnLongClickListener listener = new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.page_50_1) {
                pageInterface.OnLongClickListeners("page_50_1");
            }
            else if (v.getId() == R.id.page_50_2) {
                pageInterface.OnLongClickListeners("page_50_2");
            }
            else if (v.getId() == R.id.page_50_3) {
                pageInterface.OnLongClickListeners("page_50_3");
            }
            else if (v.getId() == R.id.page_50_4) {
                pageInterface.OnLongClickListeners("page_50_4");
            }
            else if (v.getId() == R.id.page_50_5) {
                pageInterface.OnLongClickListeners("page_50_5");
            }
            else if (v.getId() == R.id.page_50_6) {
                pageInterface.OnLongClickListeners("page_50_6");
            }
            else if (v.getId() == R.id.page_50_7) {
                pageInterface.OnLongClickListeners("page_50_7");
            }
            else if (v.getId() == R.id.page_50_8) {
                pageInterface.OnLongClickListeners("page_50_8");
            }
            else if (v.getId() == R.id.page_50_9) {
                pageInterface.OnLongClickListeners("page_50_9");
            }
            else if (v.getId() == R.id.page_50_10) {
                pageInterface.OnLongClickListeners("page_50_10");
            }
            else if (v.getId() == R.id.page_50_11) {
                pageInterface.OnLongClickListeners("page_50_11");
            }
            else if (v.getId() == R.id.page_50_12) {
                pageInterface.OnLongClickListeners("page_50_12");
            }
            else if (v.getId() == R.id.page_50_13) {
                pageInterface.OnLongClickListeners("page_50_13");
            }
            else if (v.getId() == R.id.page_50_14) {
                pageInterface.OnLongClickListeners("page_50_14");
            }
            else if (v.getId() == R.id.page_50_15) {
                pageInterface.OnLongClickListeners("page_50_15");
            }
            else if (v.getId() == R.id.page_50_16) {
                pageInterface.OnLongClickListeners("page_50_16");
            }
            else if (v.getId() == R.id.page_50_17) {
                pageInterface.OnLongClickListeners("page_50_17");
            }
            else if (v.getId() == R.id.page_50_18) {
                pageInterface.OnLongClickListeners("page_50_18");
            }
            else if (v.getId() == R.id.page_50_19) {
                pageInterface.OnLongClickListeners("page_50_19");
            }
            else if (v.getId() == R.id.page_50_20) {
                pageInterface.OnLongClickListeners("page_50_20");
            }
            else if (v.getId() == R.id.page_50_21) {
                pageInterface.OnLongClickListeners("page_50_21");
            }
            else if (v.getId() == R.id.page_50_22) {
                pageInterface.OnLongClickListeners("page_50_22");
            }


            return true;
        }
    };
    private void setOnLongClickListener(){
        page_50_1.setOnLongClickListener(listener);
        page_50_2.setOnLongClickListener(listener);
        page_50_3.setOnLongClickListener(listener);
        page_50_4.setOnLongClickListener(listener);
        page_50_5.setOnLongClickListener(listener);
        page_50_6.setOnLongClickListener(listener);
        page_50_7.setOnLongClickListener(listener);
        page_50_8.setOnLongClickListener(listener);
        page_50_9.setOnLongClickListener(listener);
        page_50_10.setOnLongClickListener(listener);
        page_50_11.setOnLongClickListener(listener);
        page_50_12.setOnLongClickListener(listener);
        page_50_13.setOnLongClickListener(listener);
        page_50_14.setOnLongClickListener(listener);
        page_50_15.setOnLongClickListener(listener);
        page_50_16.setOnLongClickListener(listener);
        page_50_17.setOnLongClickListener(listener);
        page_50_18.setOnLongClickListener(listener);
        page_50_19.setOnLongClickListener(listener);
        page_50_20.setOnLongClickListener(listener);
        page_50_21.setOnLongClickListener(listener);
        page_50_22.setOnLongClickListener(listener);



    }



    @Override
    public void onResume() {
        super.onResume();
        frameLayout_page_50.requestLayout();
    }
}